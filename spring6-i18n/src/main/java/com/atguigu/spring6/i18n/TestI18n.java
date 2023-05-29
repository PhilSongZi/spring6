package com.atguigu.spring6.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description Java国际化。
 */
public class TestI18n {

    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("en","GB")).getString("test"));

        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("zh","CN")).getString("test"));
    }
}
