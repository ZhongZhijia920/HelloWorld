package io;

import java.io.File;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-08 17:20
 **/

//列出File的一些常用操作，如遍历、过滤
public class FileUtils {
    /**
     * 列出指定目录下（包括子目录）的所有文件
     * @param dir
     * @throws IOException
     */
    public static void listDirectory(File dir)throws IOException{
        if(!dir.exists()){
            throw new IllegalArgumentException("目录：" + dir + "不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir + "不是目录");
        }
//        //返回的是字符串数组，只有子的名称，不包含子目录下的名称
//        String[] filenames = dir.list();
//        for (String string:filenames) {
//            System.out.println(string);
//        }
        //如果要遍历子目录下的内容，就需要构造File对象，递归操作,
        //File提供了直接返回File对象的api
        File[] files = dir.listFiles(); //返回的是直接子目录（文件）的抽象
        if(files!=null && files.length > 0){
            for (File file : files) {
                if(file.isDirectory()){
                    //递归
                    listDirectory(file);
                }else {
                    System.out.println(file);
                }
            }
            
        }
    }
}
