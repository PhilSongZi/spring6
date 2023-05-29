package com.atguigu.spring6.resourceloaderware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */
public class TestDemo {
    public static void main(String[] args) {
        //Spring容器会将一个ResourceLoader对象作为该方法的参数传入
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = ctx.getBean("testBean",TestBean.class);
        //获取ResourceLoader对象
        ResourceLoader resourceLoader = testBean.getResourceLoader();

        System.out.println("Spring容器将自身注入到ResourceLoaderAware Bean 中 ？ ：" + (resourceLoader == ctx));

        //加载其他资源
        Resource resource = resourceLoader.getResource("README.md");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
