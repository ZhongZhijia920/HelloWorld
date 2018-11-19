package imooc.map2;

import imooc.collection.map.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: HelloWOrld
 * @description: 泛型
 * @create: 2018-10-07 17:25
 **/
public class TestGeneric {
    public List<Course> courses;

    public TestGeneric(){
        this.courses = new ArrayList<Course>();
    }

    /**
     * 添加
     */
    public void testAdd(){
        Course cr1 = new Course("1","大学语文");
        courses.add(cr1);

        Course cr2 = new Course("2","Java基础");
        courses.add(cr2);
    }

    /**
     * 测试循环遍历
     */
    public void testForEach(){
        for(Course cr : courses){
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    /**
     * 泛型集合课添加泛型子类的对象实例
     * @param
     */
    public void testChild(){
        ChildCourse ccr = new ChildCourse();
        ccr.id = "3";
        ccr.name = "我是子类型课程对象的实例";
        courses.add(ccr);
    }

    /**
     * 泛型不能使用基本类型
     * @param args
     */

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();

        tg.testChild();
        tg.testForEach();
    }
}
