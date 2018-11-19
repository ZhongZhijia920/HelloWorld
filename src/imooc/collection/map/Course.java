package imooc.collection.map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 课程类
* */
public class Course {
    public  String id;   //实际中是私有的
    public  String name;

    public Set<Course> courses;

    public  Course(String id, String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }
    public Course(){

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null)
            return false;
        if(!(obj instanceof Course))
            return false;
        Course course = (Course) obj;
        if(this.name == null) {
            if (course.name == null)
                return true;
            else
                return false;
        }else{
            if(this.name.equals(course.name))
                return true;
            else
                return false;
        }
    }
}
