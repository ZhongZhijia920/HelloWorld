package imooc.Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: HelloWOrld
 * @description:�������ˣ�ʵ�ֻ���UDP���û���½
 * @create: 2018-11-16 20:23
 **/
public class UDP_Server {
    public static void main(String[] args)throws IOException {
        /**
         * ���ܿͻ��˷��͵�����
         */
        //1.������������DatagramSocket��ָ���˿�
        DatagramSocket socket = new DatagramSocket(8800);
        //2.�������ݱ������ڽ��տͻ��˷��͵�����
        byte[] data = new byte[1024];//�����ֽ����飬ָ�����ܵ����ݰ��Ĵ�С
        DatagramPacket packet = new DatagramPacket(data,data.length);
        //3.���ܿͻ��˷��͵�����
        System.out.println("*******���������Ѿ��������ȴ��ͻ��˷�������*********");
        socket.receive(packet);//�˷����ڽ��ܵ����ݰ�ǰ����������״̬
        //4.��ȡ����
        String info = new String(data,0,packet.getLength());
        System.out.println("���Ƿ��������ͻ���˵����:"+info);

        /**
         * ��ͻ�����Ӧ����
         */
        //1.����ͻ��˵ĵ�ַ���˿ںš�����
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] data2 = "��ӭ����".getBytes();
        //2.�������ݰ���������Ӧ��������Ϣ
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);
        //3.��Ӧ�ͻ���
        socket.send(packet2);
        //4.�ر���Դ
        socket.close();
    }
}
