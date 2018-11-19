package imooc.Internet;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @program: HelloWOrld
 * @description:InetAddress类
 * @create: 2018-11-16 16:38
 **/
public class Test01 {
    public static void main(String[] args) {
        //获取本机的InetAddress实例
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("计算名"+address.getHostName());
            System.out.println("IP地址:"+address.getHostAddress());
            byte[] bytes = address.getAddress();//获取字节数组形式的IP地址
            System.out.println("字节数组形式的IP:"+ Arrays.toString(bytes));
            System.out.println(address);

            //根据主机名获取InetAddress实例
            //InetAddress address2 = InetAddress.getByName("SC-201707061543");
            InetAddress address2 = InetAddress.getByName("192.168.1.100");
            System.out.println("计算名"+address2.getHostName());
            System.out.println("IP地址:"+address2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
