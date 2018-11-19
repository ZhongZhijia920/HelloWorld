package io;

import java.io.*;

/**
 * @program: HelloWOrld
 * @description:实现了文本文件的拷贝
 * @create: 2018-11-13 16:40
 **/
public class TestRWCharStream {
    public static void main(String[] args) {
        try {

            //File file = new File("d:\\javaio\\a.txt");

            FileInputStream fis = new FileInputStream("d:\\javaio\\a.txt");
            FileOutputStream fos = new FileOutputStream("d:\\javaio\\a_new.txt");
            InputStreamReader isr = new InputStreamReader(fis,"gbk");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
            char input[] = new char[100];
            int l=0;
            while((l= isr.read(input))!=-1){
                //System.out.println(new String(input,0,l));
                String inputString = new String(input,0,l);
                osw.write(input,0,l);
            }
            isr.close();
            fis.close();
            osw.close();
            fos.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
