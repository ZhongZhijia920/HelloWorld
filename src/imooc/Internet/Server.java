package imooc.Internet;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: HelloWOrld
 * @description:����TCPЭ���Socketͨ�ţ�ʵ���û���½
 * �����
 * @create: 2018-11-16 19:02
 **/
public class Server {
    public static void main(String[] args) {
        //1.����һ����������Socket����ServerSocket,
        //ָ���󶨵Ķ˿ڣ����������˿�
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket =null;
            //��¼�ͻ��˵�����
            int count = 0;
            System.out.println("*****�����������������ȴ��ͻ��˵�����*****");
            //ѭ�������ȴ��ͻ��˵�����
            while (true){
                //2.����accept()������ʼ�������ȴ��ͻ��˵�����
                socket=serverSocket.accept();
                //����һ���µ��߳�
                ServerThread serverThread=new ServerThread(socket);
                //�����߳�
                serverThread.start();
                count++;//ͳ�ƿͻ��˵�����
                System.out.println("�ͻ��˵�����:"+count);
                InetAddress address=socket.getInetAddress();

                System.out.println("��ǰ�ͻ��˵�IP: " +address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
