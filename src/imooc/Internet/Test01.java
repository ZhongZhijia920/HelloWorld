package imooc.Internet;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @program: HelloWOrld
 * @description:InetAddress��
 * @create: 2018-11-16 16:38
 **/
public class Test01 {
    public static void main(String[] args) {
        //��ȡ������InetAddressʵ��
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("������"+address.getHostName());
            System.out.println("IP��ַ:"+address.getHostAddress());
            byte[] bytes = address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ
            System.out.println("�ֽ�������ʽ��IP:"+ Arrays.toString(bytes));
            System.out.println(address);

            //������������ȡInetAddressʵ��
            //InetAddress address2 = InetAddress.getByName("SC-201707061543");
            InetAddress address2 = InetAddress.getByName("192.168.1.100");
            System.out.println("������"+address2.getHostName());
            System.out.println("IP��ַ:"+address2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
