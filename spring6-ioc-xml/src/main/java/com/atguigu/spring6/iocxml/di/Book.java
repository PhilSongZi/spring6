package com.atguigu.spring6.iocxml.di;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 16:21
 */
public class Book {
    private String bname;
    private String author;

    public Book() {
        System.out.println("无参构造方法执行了...");
    }
    public Book(String bname, String author) {
        System.out.println("有参构造方法执行了...");
        this.author = author;
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // 原生的注入：set和构造器
        // set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("尚硅谷");

        // 构造器注入
        Book book1 = new Book("C++", "尚硅谷");
    }
}
