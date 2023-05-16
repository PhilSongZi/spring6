package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 9:47
 */
public class Student {

    private Map<String, Teacher> teacherMap;
    private List<Lesson> lessonList;
    private String sname;
    private String sid;

    public void run() {
        System.out.println("学生编号：" + sid + "，学生名字：" + sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}
