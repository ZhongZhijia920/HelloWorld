package io;

import java.io.*;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 19:29
 **/
public class BrAndBWOrPw_Demo {

    public static void main(String[] args) throws IOException {
        //���ļ����ж�д����
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("d:\\javaio\\imooc_src.txt")));
//        BufferedWriter bw =new BufferedWriter(
//                new OutputStreamWriter(               //OutputStreamWriter�ַ���
//                        new FileOutputStream("d:\\javaio\\imooc_233.txt")));//FileOutputStream�ֽ���
        PrintWriter pw = new PrintWriter("d:\\javaio\\imooc_src1.txt");
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);//һ�ζ�һ�У�������ʶ����
//            bw.write(line);
//            //����д�����в���
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
