package imooc.Internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: HelloWOrld
 * @description:使用URL读取页面内容
 * @create: 2018-11-16 17:09
 **/
public class Test_03 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            //通过URL的openStream方法获取URL对象所表示资源的字节输入流
            InputStream is = url.openStream();//字节输入流
            InputStreamReader isr = new InputStreamReader(is,"utf-8");//字符输入流
            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();//读取数据
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
