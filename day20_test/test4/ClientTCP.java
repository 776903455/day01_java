package day20_test.test4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {

    public static void main(String[] args) {

        System.out.println("客户端启动，开始连接....");
        try {
            Socket s=new Socket("localhost",8888);
            OutputStream os = s.getOutputStream();
            os.write("数据收到没".getBytes());

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
