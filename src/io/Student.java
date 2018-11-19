package io;

import java.io.Serializable;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 20:04
 **/
public class Student implements Serializable {

    private String stuno;
    private String stuname;
    private int stuage;

    public Student(String stuno, String stuname, int stuage) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.stuage = stuage;
    }

    public Student(){

    }
    public String getStuno() {
        return stuno;
    }
    public String getStuname() {
        return stuname;
    }
    public int getStuage() {
        return stuage;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }
}
