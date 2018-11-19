package io;

import java.io.File;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 12:42
 **/
public class Bis_Bos_test {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            IOUtil.copyFileByBuffer(new File("d:\\javaio\\1.mp3"),
                    new File("d:\\javaio\\2.mp3"));
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
