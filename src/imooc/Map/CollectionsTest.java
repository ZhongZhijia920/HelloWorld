package imooc.Map;

import com.sun.org.apache.xerces.internal.xs.StringList;
import imooc.collection.map.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
* 将要完成：
 * 1.通过Collections.sort()方法，对Integer泛型的List进行排序
 * 2.对String泛型的List进行排序；
 * 3.对其它类型泛型的List进行排序，以Students为例
 **/
public class CollectionsTest {
    /**
     *1.通过Collections.sort()方法，对Integer泛型的List进行排序
     * 创建一个Inter泛型的List，插入10个100以内不重复随机整数，
     * 调用Collections,sort()方法对其进行排序
     */
    public void testSort1(){
        List<Integer> integerList = new ArrayList<Integer>();
        //插入10个100以内不重复随机整数
        Random random = new Random();
        Integer k;
        for(int i = 0 ; i<10 ; i++){
            do {
                k = random.nextInt(100);
            }while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加整数:" + k);
        }
        System.out.println("----------------排序前-------------");
        for (Integer integer: integerList) {
            System.out.println("元素：" + integer);
        }
        //排序
        Collections.sort(integerList);
        System.out.println("----------------排序后--------------");
        for (Integer integer: integerList) {
            System.out.println("元素：" + integer);
        }
    }

    /**
     * 2.对String泛型的List进行排序；
     * 创建String泛型的List,添加3个乱序的String元素，
     * 调用sort方法，再次输出排序后的顺序
     */
    public void testSort2(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("lenovo");
        System.out.println("---------------排序前-------------");
        for (String string:stringList) {
            System.out.println("元素：" + string);
        }
        Collections.sort(stringList);
        System.out.println("---------------排序后-------------");
        for (String string:stringList) {
            System.out.println("元素：" + string);
        }
    }

    /**
     * 1.创建完List<String>之后，往其中添加十条随机字符串
     * 2.每条字符串的长度为10以内的随机整数
     * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
     * 每条随机字符串不可重复
     */
    public void testSort3(){
        List<String> stringList = new ArrayList<String>();
        Random random = new Random();

        for (int i = 0 ; i < 10;){
            int length = random.nextInt(10);
            StringBuilder str = new StringBuilder();
            for (int j = 0 ; j <length ; ){
                int temp = random.nextInt(123);
                if((temp >= 48) && (temp <= 57)){
                    char ch = (char) temp;
                    str.append(ch);
                    j++;
                }else if((temp >= 65) && (temp <= 90)){
                    char ch = (char) temp;
                    str.append(ch);
                    j++;
                }else if(temp >= 97){
                    char ch = (char) temp;
                    str.append(ch);
                    j++;
                }else
                    continue;
            }
            if(stringList.contains(str.toString())){
                continue;
            }else {
                stringList.add(str.toString());
                i++;
            }
        }

        System.out.println("---------------排序前-------------");
        for (String string:stringList) {
            System.out.println("元素：" + string);
        }
        Collections.sort(stringList);
        System.out.println("---------------排序后-------------");
        for (String string:stringList) {
            System.out.println("元素：" + string);
        }
    }

    /**
     *3.对其它类型泛型的List进行排序，以Students为例
     */
    public void testSort4() {
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();
        studentList.add(new Student(random.nextInt(1000) + "", "Mike"));
        studentList.add(new Student(random.nextInt(1000) + "", "Angela"));
        studentList.add(new Student(random.nextInt(1000) + "", "Lucy"));
        studentList.add(new Student(10000 + "", "Beyonce"));


        System.out.println("---------------排序前-------------");
        for(Student student : studentList){
            System.out.println("学生：" + student.id + "姓名：" +student.name);
        }
        Collections.sort(studentList);
        System.out.println("---------------排序后-------------");
        for(Student student : studentList){
            System.out.println("学生：" + student.id + "姓名：" +student.name);
        }
        System.out.println("--------------------按照姓名排序后---------------");
        Collections.sort(studentList,new StudentComparator());
        for(Student student : studentList){
            System.out.println("学生：" + student.id + "姓名：" +student.name);
        }
    }


    public static void main(String[] args) {
        CollectionsTest ct = new CollectionsTest();
//        ct.testSort1();
//        ct.testSort3();
        ct.testSort4();
    }
}
