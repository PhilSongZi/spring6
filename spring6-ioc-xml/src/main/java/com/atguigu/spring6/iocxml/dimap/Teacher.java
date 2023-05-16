package com.atguigu.spring6.iocxml.dimap;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 9:48
 */
public class Teacher {

    private String teacherName;
    private String teacherId;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherName;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
