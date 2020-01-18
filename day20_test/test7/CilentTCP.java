package day20_test.test7;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;

public class CilentTCP {
    static {
        System.out.println("客户端启动，开始连接...");
    }

    public static void main(String[] args) {

        Socket s=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
             s=new Socket("127.0.0.1",10078);
            bis =new BufferedInputStream(new FileInputStream("d:\\test\\a.png"));

             bos =new BufferedOutputStream(s.getOutputStream());
            byte[] bys =new byte[1024];
            int len=0;
            while ((len=bis.read(bys))!=-1){
                bos.write(bys,0,len);
                bos.flush();
            }

            s.shutdownOutput();
            InputStream is=s.getInputStream();
            byte[] bys1=new byte[1024];
            int len1 =is.read(bys1);
            System.out.println(new String(bys1,0,len1));




        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
