package io;

import java.io.*;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-13 11:14
 **/
public class DosDemo {
    public static void main(String[] args)throws IOException {
        String file = "demo/dos.dat";
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(file));
        dos.writeInt(10);
        dos.writeInt(-10);
        dos.writeLong(10l);
        dos.writeDouble(10.5);
        //采用uft-8编码写出
        dos.writeUTF("中国");
        //采用uft-16be编码写出
        dos.writeChars("中国");
        dos.close();
        IOUtil.pringHex(file);
    }
}
