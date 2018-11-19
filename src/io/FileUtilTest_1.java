package io;

import java.io.File;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-08 17:27
 **/
public class FileUtilTest_1 {
    public static void main(String[] args) throws IOException {
        FileUtils.listDirectory(new File("C:\\Users\\Administrator\\IdeaProjects\\HelloWOrld\\src\\io"));
    }
}
