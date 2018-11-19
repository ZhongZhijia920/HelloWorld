package imooc.Internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: HelloWOrld
 * @description:ʹ��URL��ȡҳ������
 * @create: 2018-11-16 17:09
 **/
public class Test_03 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            //ͨ��URL��openStream������ȡURL��������ʾ��Դ���ֽ�������
            InputStream is = url.openStream();//�ֽ�������
            InputStreamReader isr = new InputStreamReader(is,"utf-8");//�ַ�������
            //Ϊ�ַ���������ӻ���
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();//��ȡ����
            while(data!=null){
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
