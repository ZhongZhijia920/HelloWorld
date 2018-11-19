package io;

import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-11 22:27
 **/
public class IOUTest1 {
    public static void main(String[] args) {
        try {
            IOUtil.printHexByByteArray("C:\\Users\\Administrator\\IdeaProjects\\HelloWOrld\\src\\io\\FileDemo.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
