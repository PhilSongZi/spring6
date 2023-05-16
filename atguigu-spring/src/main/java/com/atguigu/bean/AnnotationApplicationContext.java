package com.atguigu.bean;

import com.atguigu.annotation.Bean;
import com.atguigu.annotation.Di;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/8 9:54
 */
public class AnnotationApplicationContext implements ApplicationContext{

    // 创建map集合，放bean对象
    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    // 返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    // 创建有参构造。传递包路径，设置包扫描规则
    // 当前包及其子包，哪个类含有@Bean注解，把这个类通过反射实例化
    public AnnotationApplicationContext(String basePackage) {
        // com.atguigu
        try {
            // 1.把 . 替换成 \
            String packagePath = basePackage.replace("\\.", "\\\\");

            // 2. 获取包绝对路径
            Enumeration<URL> urls = Thread.currentThread().
                    getContextClassLoader().
                    getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");

                // 获取包前面路径部分，字符串截取
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                // 包扫描
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        loadDi();
    }

    private void loadBean(File file) {

        // 1.判断当前是否文件夹
        if(file.isDirectory()) {
            // 2.获取文件夹内所有内容
            File[] childrenFiles = file.listFiles();

            // 3.判断文件夹为空则直接返回
            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }

            // 4.文件夹不为空，遍历所有内容
            for (File child:childrenFiles) {
                // 4.1遍历得到每个file对象，继续判断，若还是文件夹，递归
                if (child.isDirectory()) {
                    loadBean(child);
                } else {
                    // 4.2遍历得到file对象是文件时
                    // 4.3得到包路径+类名称部分——字符串截取
                    String pathWithClass =
                            child.getAbsolutePath().substring(rootPath.length() - 1);

                    // 4.4判断当前文件类型是否.class
                    if(pathWithClass.contains(".class")) {
                        // 4.5若是.class类型，把路径 \ 替换成 . 把.class去掉
                        // com.atguigu.service.UserServiceImpl
                        String allName = pathWithClass.replaceAll("\\\\", ".")
                                        .replace(".class", "");

                        // 4.6判断类上面是否有注解@Bean，有则实例化
                        // 4.6.1获取类的class
                        Class<?> clazz = null;
                        try {
                            clazz = Class.forName(allName);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }

                        // 4.6.2判断不是接口
                        if (!clazz.isInterface()) {
                            // 4.6.3判断类上是否有注解
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            if (annotation != null) {
                                // 4.6.4实例化
                                try {
                                    Object instance = clazz.getConstructor().newInstance();
                                    // 4.7放到map beanFactory中
                                    // 4.7.1当前类有接口，让接口class作为map的key
                                    if(clazz.getInterfaces().length > 0) {
                                        beanFactory.put(clazz.getInterfaces()[0], instance);
                                    } else {
                                        beanFactory.put(clazz, instance);
                                    }
                                } catch (InstantiationException e) {
                                    throw new RuntimeException(e);
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                } catch (InvocationTargetException e) {
                                    throw new RuntimeException(e);
                                } catch (NoSuchMethodException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 属性注入
    private void loadDi() {

        // 实例化对象在beanFactory的map集合中，因此，
        // 1.遍历beanFactory的map集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class, Object> entry:entries) {
            // 2.获取map集合每个对象（value），每个对象属性获取到
            Object obj = entry.getValue();

            // 获取对象class
            Class<?> clazz = obj.getClass();

            // 获取每个对象属性
            Field[] declaredFields = clazz.getDeclaredFields();

            // 3.遍历得到每个对象属性数组，得到每个属性
            for(Field field:declaredFields) {
                // 4.判断属性上是否有@Di注解
                Di annotation = field.getAnnotation(Di.class);
                // 5.若有@Di注解，把对象进行设置
                try {
                    field.set(obj, beanFactory.get(field.getType()));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
