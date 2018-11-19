package imooc.Internet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: HelloWOrld
 * @description:URL���÷���
 * @create: 2018-11-16 17:01
 **/
public class URL_Test {
    public static void main(String[] args) {
        //����URLʵ��
        try {
            URL imooc = new URL("http://www.imooc.com");
            //?���ʾ������#���ʾê��
            URL url = new URL(imooc,"/index.html?username=tom#test");
            System.out.println("Э��:"+url.getProtocol());
            System.out.println("����:"+url.getHost());
            //���δָ���˿ںţ���ʹ��Ĭ�ϵĶ˿ںţ���ʱgetPort��������Ϊ-1
            System.out.println("�˿�"+url.getPort());
            System.out.println("�ļ�·��:"+url.getPath());
            System.out.println("�ļ���:"+url.getFile());
            System.out.println("���·��:"+url.getRef());
            System.out.println("��ѯ�ַ���:"+url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
