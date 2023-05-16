package com.atguigu.spring6.iocxml.dimap;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 10:10
 */
public class Lesson {

    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "LessonName:{" + lessonName + '\'' + '}';
    }
}
