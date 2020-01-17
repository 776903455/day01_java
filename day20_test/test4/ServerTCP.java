package day20_test.test4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    /*  /*在项目下创建TCP 服务器端 端口号为8888
    1：等待客户端连接 如果有客户端连接 获取到客户端对象。
    2：获取到客户端对象之后读取数据客户端传送数据并输出到控制台。 */

    public static void main(String[] args) {

        System.out.println("服务端启动，等待连接...");

        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            byte[] bys=new byte[1024];
            int len=is.read(bys);
            System.out.println(new String(bys,0,len));

            /*回复*/
            OutputStream os = s.getOutputStream();
            os.write("收到".getBytes());

            os.close();
            is.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
