package imooc.Internet;

import sun.awt.OSInfo;
import sun.awt.windows.ThemeReader;

import java.io.*;
import java.net.Socket;

/**
 * @program: HelloWOrld
 * @description:�������̴߳�����
 * @create: 2018-11-16 19:49
 **/
public class ServerThread extends Thread {
    //�ͱ��߳���ص�Socket
    Socket socket = null;
    public ServerThread(Socket socket){
        this.socket = socket;
    }

    //�߳�ִ�еĲ�������Ӧ�ͻ��˵�����
    public void run() {
        //��ȡ������������ȡ�ͻ�����Ϣ
        InputStream is = null;//�ֽ�������
        InputStreamReader isr = null;
        BufferedReader br = null;
        //��ȡ���������Ӧ�ͻ��˵�����
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            is = socket.getInputStream();
            isr = new InputStreamReader(is);//���ֽ���ת��Ϊ�ַ���
            br = new BufferedReader(isr);//���ַ�����ӻ���
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("���Ƿ��������ͻ���˵:" + info);
            }
            socket.shutdownInput();//�ر�������

            //��ȡ���������Ӧ�ͻ��˵�����
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("��ӭ��");
            pw.flush();//ˢ�»���
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //�ر���Դ
                if(pw!=null)
                    pw.close();
                if(os!=null)
                    os.close();
                if(br!=null)
                    br.close();
                if(isr!=null)
                    isr.close();
                if(is!=null)
                    is.close();
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
