package day20_demo.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) {
        System.out.println("连接服务端中，请稍等...。。");
        try {
            Socket s=new Socket("localhost",10086);
            OutputStream os = s.getOutputStream();
            os.write("TCP,你好啊".getBytes());

            InputStream is = s.getInputStream();
            byte[] bys=new byte[1024];
            int len=is.read(bys);
            System.out.println(new String(bys,0,len));

            is.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
