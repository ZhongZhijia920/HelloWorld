package io;

import java.io.*;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 20:08
 **/
public class ObjectSeriaDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "demo/obj.dat";
//        //1.��������л�
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(file));
        Student stu = new Student("10001","����",20);
        oos.writeObject(stu);
        oos.flush();
        oos.close();

        //�����л�
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(file));
        Student stu1 = (Student)ois.readObject();
        System.out.println(stu1);
        ois.close();
    }
}
