package io;

import java.io.File;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:测试IOUtil中copyFile
 * @create: 2018-11-13 11:06
 **/
public class IOUtilTest_2 {
    public static void main(String[] args) {
        try {
            IOUtil.copyFile(new File("d:\\javaio\\imooc_src.txt"),new
                    File("d:\\javaio\\imooc_dest.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
