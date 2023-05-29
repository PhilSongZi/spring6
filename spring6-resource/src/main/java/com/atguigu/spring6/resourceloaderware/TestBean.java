package com.atguigu.spring6.resourceloaderware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */
public class TestBean implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    //实现ResourceLoaderAware接口必须实现的方法
    //如果把该Bean部署在Spring容器中，该方法将会有Spring容器负责调用。
    //Spring容器调用该方法时，Spring会将自身作为参数传给该方法。
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    //返回ResourceLoader对象的应用
    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}
