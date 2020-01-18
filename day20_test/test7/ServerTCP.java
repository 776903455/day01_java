package day20_test.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTCP {

    /*将文件上传到指定IP的主机
     TCP的服务端可以接受多个客户端的连接
     TCP的客户端上传文件到服务器端 文件保存到 c:/java/file 文件下，
     文件名随机生成，只要不出现文件覆盖即可。

    服务器端需要反馈上传状态(成功或失败)给客户端。 */

    static {
        System.out.println("服务端启动，等待连接...");
    }
    public static void main(String[] args) {


            new Thread(()->{

                try {
                    ServerSocket ss=new ServerSocket(10078);
                while (true) {
                    Socket s = ss.accept();
                    BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\test1\\" + new Date().getTime() + ".png"));
                    byte[] bys = new byte[1024];
                    int len = 0;
                    while ((len = bis.read(bys)) != -1) {

                        bos.write(bys, 0, len);
                        bos.flush();
                    }

                    OutputStream os = s.getOutputStream();
                    os.write("上传成功".getBytes());
                    os.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            }).start();

    }
}
