package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 19:09
 **/
public class FrAndFwDemo {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("d:\\javaio\\imooc_src.txt");
//      FileWriter fw = new FileWriter("d:\\javaio\\imooc2.txt");重写
        FileWriter fw = new FileWriter("d:\\javaio\\imooc2.txt",true); //true就是追加
        char [] buffer = new char[2056];
        int c;
        while((c=fr.read(buffer,0,buffer.length))!=-1){
            fw.write(buffer,0,c);
            fw.flush();
        }
        fw.close();
        fr.close();
    }







}
