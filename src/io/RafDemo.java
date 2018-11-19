package io;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-08 18:05
 **/
public class RafDemo {
    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if(!demo.exists())
            demo.mkdir();
        File file = new File(demo,"raf.dat");
        if (!file.exists())
            file.createNewFile();

        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //指针的位置
        System.out.println(raf.getFilePointer());
        raf.write('A'); //write只写一个字节
        System.out.println(raf.getFilePointer());
        raf.write('B');

        int i= 0x7fffffff; //4个字节，一个字节8位
        //用write方法每次只能写一个字节，如果把I写进去，就要写4次
        raf.write(i>>> 24);//高8位
        raf.write(i>>> 16);
        raf.write(i>>> 8);
        raf.write(i);//高8位
        System.out.println(raf.getFilePointer());

        //可直接写一个int
        raf.writeInt(i);

        //写中文汉字
        String s ="中";
        byte[] gbk = s.getBytes("gbk");
        raf.write(gbk);
        System.out.println(raf.length());

        //读文件，必须把指针移到头部
        raf.seek(0);
        //一次性读取,把文件中的内容都读到字节数组中
        byte[] buf = new byte[(int)raf.length()];
        raf.read(buf);
        System.out.println(Arrays.toString(buf));
        String s1 = new String(buf);

        for (byte b : buf) {
            System.out.println(Integer.toHexString(b & 0xff) + " ");
        }
        raf.close();
    }
}

