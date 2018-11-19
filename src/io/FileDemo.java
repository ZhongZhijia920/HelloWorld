package io;

import java.io.File;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-08 17:07
 **/
public class FileDemo {
    public static void main(String[] args) {
        //了解构造函数的情况，查帮助。
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\HelloWOrld\\src");
        if(!file.exists())
            //是否是一个目录
            file.mkdir();
        else
            file.delete();
        //是否是一个目录
        System.out.println(file.isDirectory());
        //是否是一个文件
        System.out.println(file.isFile());

    }
}
