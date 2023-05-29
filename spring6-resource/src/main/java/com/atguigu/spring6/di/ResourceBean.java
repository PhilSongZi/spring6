package com.atguigu.spring6.di;

import org.springframework.core.io.Resource;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 把resource作为属性。
 */
public class ResourceBean {

    private Resource res;

    public void setRes(Resource res) {
        this.res = res;
    }
    public Resource getRes() {
        return this.res;
    }

    public void parse(){
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
    }
}
