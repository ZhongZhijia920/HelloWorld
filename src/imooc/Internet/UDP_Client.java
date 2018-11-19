package imooc.Internet;

import java.io.IOException;
import java.net.*;

/**
 * @program: HelloWOrld
 * @description:�ͻ���
 * @create: 2018-11-16 20:29
 **/
public class UDP_Client {
    public static void main(String[] args) throws IOException {
        /**
         * ��������˷�������
         */
        //1.����������ĵ�ַ���˿ںš�����
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data="�û���:admin;����:123".getBytes();
        //2.�������ݰ����������͵�������Ϣ
        DatagramPacket packet = new DatagramPacket(data, data.length,address , port);
        //3.����DatagramSocket����
        DatagramSocket socket = new DatagramSocket();
        //4.��������˷������ݱ�
        socket.send(packet);

        /**
         * ���ܷ���������Ӧ������
         */
        //1.�������ݱ������ڽ��ܷ���������Ӧ������
        byte[] data2=new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
        //2.���ܷ�������Ӧ������
        socket.receive(packet2);
        //3.��ȡ����
        String reply =new String(data2, 0, packet2.getLength());
        System.out.println("���ǿͻ��ˣ�������˵:"+reply);
        //4.�ر���Դ
        socket.close();
    }
}
