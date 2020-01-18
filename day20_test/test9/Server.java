package day20_test.test9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    /*编写一个TCP的服务端，可以接受多个客户端的连接，当接收到用户的连接请求以后，就要把一张图片传回给客户端*/

    static {
        System.out.println("服务端启动，等待连接...");
    }
    public static void main(String[] args) {

        ServerSocket ss=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        Socket s=null;

        try {
            ss=new ServerSocket(7878);
            while (true){
                s=ss.accept();
                System.out.println("连接成功...");
                bis=new BufferedInputStream(new FileInputStream("d:\\test\\a.png"));
                bos=new BufferedOutputStream(s.getOutputStream());
                byte[] bys=new byte[1024];
                int len=0;
                while((len=bis.read(bys))!=-1){
                    bos.write(bys,0,len);
                    bos.flush();
                }

                bos.close();
                s=ss.accept();
                OutputStream os=s.getOutputStream();
                os.write("下载成功".getBytes());
                os.flush();
                os.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                s.close();
                bis.close();
                bos.close();
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
