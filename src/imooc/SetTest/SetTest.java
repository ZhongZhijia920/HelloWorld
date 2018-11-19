package imooc.SetTest;

import imooc.collection.map.Course;
import imooc.collection.map.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-10-07 17:45
 **/

public class SetTest {
    public List<Course> coursesToSelect;

    private Scanner console;

    public Student student;
    public  SetTest(){
        coursesToSelect = new ArrayList<Course>();
        console = new Scanner(System.in);
    }

    public void testAdd(){
    //创建一个课程对象，通过add方法添加到备选课程List中
        //List中 两个add方法的使用
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
//        System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course) coursesToSelect.get(0);


        Course[] course = {new Course("3","离散数学"),new Course("4","汇编")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course)coursesToSelect.get(2);
        Course temp4 = (Course)coursesToSelect.get(3);


        Course[] course2 = {new Course("5","高等数学"),new Course("6","英语")};
        coursesToSelect.addAll(2,Arrays.asList(course2));
        Course temp5 = (Course)coursesToSelect.get(2);
        Course temp6 = (Course)coursesToSelect.get(3);

    }
    /**
     * 测试循环遍历
     */
    public void testForEach(){
        for(Course cr : coursesToSelect){
            System.out.println(cr.id + ":" + cr.name);
        }
    }
     public void testForEachForSet(Student  student){
         for (Course cr : student.courses){
             System.out.println("选择了课程：" + cr.id + ":" + cr.name);
         }
    }

    /**
     * 测试list的contains方法
     */
    public void testListContains(){
        //取得备选课程序列的第0个元素
        Course course = coursesToSelect.get(0);
        //打印输出coursesToSelect是否包含course对象
        System.out.println("取得课程：" + course.name);
        System.out.println("备选课程中是否包含该课程："+course.name+","+
                coursesToSelect.contains(course));
        //提示输入课程名称
        System.out.println("请输入课程名称");
        String name = console.next();
        //创建一个新的课程对象，ID和名称，与course对象相同
        Course course2= new Course();
        course2.name = name;
        System.out.println("新课程：" + course2.name);
        System.out.println("备选课程中是否包含该课程："+course2.name+","+
                coursesToSelect.contains(course2));
        //通过indexOf方法来取得某元素的索引位置
        if(coursesToSelect.contains(course2))
            System.out.println("课程：" + course2.name + "的索引位置为：" +
                    coursesToSelect.indexOf(course2));
    }
    //创建学生对象并且选课
    public void creatStudentAddCourse(){
        student = new Student("1" , "小明");
        System.out.println("欢迎学生：" + student.name + "选课！");

        //创建一个Scanner对象，用来接收从键盘输入的课程ID
        Scanner console = new Scanner(System.in);

        for (int i = 0;i < 3;i++){
            System.out.println("请输入课程ID");
            String courseID = console.next();
            for (Course cr : coursesToSelect){
                if (cr.id.equals(courseID)){
                    student.courses.add(cr);
                    /**
                     * Set添加对象，无论添加多少次，
                     * 最终只会保留一个该对象（的引用)
                     * 并且，保留的是第一次添加的那个
                     */
                }
            }
        }
    }

    /**
     * 测试Set的contains方法
     * @param
     */
    public void testSetContains(){
        //提示输入课程名称
        System.out.println("请输入学生已选的课程名称：");
        String name = console.next();
        //创建一个新的课程对象，ID和名称，与course对象相同
        Course course2= new Course();
        course2.name = name;
        System.out.println("新课程：" + course2.name);
        System.out.println("备选课程中是否包含该课程："+course2.name+","+
                student.courses.contains(course2));
    }


    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testListContains();
        st.testForEach();
//        st.creatStudentAddCourse();
//        st.testSetContains();
 //       st.testForEachForSet(student);
//       打印输出学生所选课程！
    }
}
