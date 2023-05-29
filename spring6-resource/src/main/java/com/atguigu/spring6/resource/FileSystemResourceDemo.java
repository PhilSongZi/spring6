package com.atguigu.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 访问系统资源。
 */
public class FileSystemResourceDemo {

    public static void loadFileSystemResource(String path) {

        // 创建对象
        FileSystemResource resource = new FileSystemResource(path);
        //绝对路径
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = "+ resource.getDescription());
        //获取文件内容
        InputStream in = null;
        try {
            in = resource.getInputStream();
            byte[] b = new byte[1024];
            while(in.read(b)!=-1) {
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // 绝对路径
        loadFileSystemResource("D:\\open_source_projects\\springcodes\\spring6\\README.md");
        // 相对路径(相对于项目根目录）
        loadFileSystemResource("README.md");
    }
}
