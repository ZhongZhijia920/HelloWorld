package imooc.Internet;

import javax.xml.soap.SOAPConnection;
import java.io.*;
import java.net.Socket;

/**
 * @program: HelloWOrld
 * @description:客户端
 * @create: 2018-11-16 19:02
 **/
public class Client {
    public static void main(String[] args) {
        try {
            //1.创建客户端Socket,指定服务器地址和端口
            Socket socket = new Socket("localhost",8888);//或者IP地址
            //2.获取输出流，向服务器端发送信息
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);//打印流
            pw.write("用户名:tom;密码：456");
            pw.flush();

            socket.shutdownOutput();//关闭输出流
            //3.获取输入流，并读取服务端的响应信息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info=br.readLine())!=null){
                System.out.println("我是客户端，服务器说:"+ info);
            }
            //4.关闭资源
            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
