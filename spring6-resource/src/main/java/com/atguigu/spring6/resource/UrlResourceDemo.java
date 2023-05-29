package com.atguigu.spring6.resource;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description urlResource访问网络路径下的资源。
 */

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

public class UrlResourceDemo {

    public static void main(String[] args) throws IOException {
        // http前缀
        loadUrlResource("https://www.baidu.com");
        // file前缀
        loadUrlResource("file:D:\\open_source_projects\\springcodes\\spring6\\README.md");
    }

    // http、file
    public static void loadUrlResource(String path) throws IOException {

        try {
            // 创建Resource实现类的对象UrlResource
            UrlResource url = new UrlResource(path);

            // 获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    // ftp
}
