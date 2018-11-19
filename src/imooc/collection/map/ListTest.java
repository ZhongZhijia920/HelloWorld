package imooc.collection.map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
* 备选课程类
* */
public class ListTest {
    /*
    * 存放备选课程的List
    * */
    public List coursesToSelect;

    public ListTest(){
        this.coursesToSelect = new ArrayList();
    }

    /**
     * 用于往coursesToSelect中添加课程
     */
    public void testAdd(){
        //创建一个课程对象，通过add方法添加到备选课程List中
        //List中 两个add方法的使用
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

        Course[] course = {new Course("3","离散数学"),new Course("4","汇编")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course)coursesToSelect.get(2);
        Course temp4 = (Course)coursesToSelect.get(3);
        System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + ";"
        + temp4.id + ":" + temp4.name);

        Course[] course2 = {new Course("5","高等数学"),new Course("6","英语")};
        coursesToSelect.addAll(2,Arrays.asList(course2));
        Course temp5 = (Course)coursesToSelect.get(2);
        Course temp6 = (Course)coursesToSelect.get(3);
        System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + ";"
                + temp6.id + ":" + temp6.name);
    }

    /**
     * 取得List中元素的方法
     * @param
     */
    public void testGet(){
        int size = coursesToSelect.size();
        System.out.println("有如下课程待选：");
        for (int i=0; i<size ; i++){
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程:" + cr.id + ":" + cr.name);
        }
    }

    /**
     * 通过迭代器遍历List
     * @param
     */
    public void testIterator(){
        Iterator it = coursesToSelect.iterator();
        System.out.println("有如下课程待选(通过迭代器)：");
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程(通过迭代器):" + cr.id + ":" + cr.name);
        }
    }

    /**
     * 通过for each快速访问集合
     * @param
     */
    public void testForEach(){
        System.out.println("有如下课程待选(通过ForEach)：");
        for(Object obj:coursesToSelect){
            Course cr = (Course)obj;
            System.out.println("课程(有如下课程待选(通过ForEach)):" + cr.id + ":" + cr.name);
        }
    }
    /*
     * @Description //TODO 修改List中元素
     * @Date 16:53 2018/10/7
     * @Param
     * @return
     **/
    public void testModify(){
        coursesToSelect.set(4,new Course("7","毛概"));
    }

    /**
     * 删除List中元素
     */
    public void testRemove(){
        Course cr = (Course) coursesToSelect.get(4);
        System.out.println("即将删除位置4和5上的课程");
        Course[] courses = {(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
        coursesToSelect.removeAll(Arrays.asList(courses)); //索引位置也可
        System.out.println("成功删除课程！");
        testForEach();
    }
    public static void main(String[] args) {
        ListTest It = new ListTest();
        It.testAdd();
        It.testGet();
        It.testIterator();
        //测速modify
        It.testModify();
        It.testRemove();
    }
}
