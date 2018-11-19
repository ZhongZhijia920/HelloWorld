package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-12 10:54
 **/
public class FileOutDemo_1 {
    public static void main(String[] args) throws IOException {
        //如果该文件不存在，则直接创建；如果存在，则删除后创建
        FileOutputStream out = new FileOutputStream("demo/out.dat", true);
        out.write('A');//A字节的低八位
        out.write('B');
        int a = 10;//write只能写八位，写一个int需要写4次每次8位
        out.write(a>>>24);
        out.write(a>>>16);
        out.write(a>>>8);
        out.write(a);

        byte[] gbk = "中国".getBytes("gbk");
        out.write(gbk);
        out.close();

        IOUtil.pringHex("demo/out.dat");
    }
}
