package io;

import java.io.*;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 19:29
 **/
public class BrAndBWOrPw_Demo {

    public static void main(String[] args) throws IOException {
        //对文件进行读写操作
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("d:\\javaio\\imooc_src.txt")));
//        BufferedWriter bw =new BufferedWriter(
//                new OutputStreamWriter(               //OutputStreamWriter字符流
//                        new FileOutputStream("d:\\javaio\\imooc_233.txt")));//FileOutputStream字节流
        PrintWriter pw = new PrintWriter("d:\\javaio\\imooc_src1.txt");
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);//一次读一行，并不能识别换行
//            bw.write(line);
//            //单独写出换行操作
//            bw.newLine();
//            bw.flush();
            pw.println(line);
            pw.flush();
        }
        br.close();
//        bw.close();
        pw.close();
    }

}
