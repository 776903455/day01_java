package day20_demo.demo;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

    public static void main(String[] args) {

        System.out.println("服务的启动，等待连接.....");
        try {
            ServerSocket ss=new ServerSocket(10086);
            Socket s=ss.accept();
            InputStream is = s.getInputStream();
            byte[] bys=new byte[1024];
            int len=0;
            len=is.read(bys);
            System.out.println(new String(bys,0,len));

            OutputStream os = s.getOutputStream();
            os.write("我很好，谢谢你".getBytes());
            os.close();
            is.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
