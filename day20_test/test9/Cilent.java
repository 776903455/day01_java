package day20_test.test9;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.Socket;
import java.util.Date;

public class Cilent {
    static {
        System.out.println("客户端启动，开始连接...");
    }

    public static void main(String[] args) {

        Socket s = null;
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;

        try {
            s = new Socket("127.0.0.1", 7878);
            bos = new BufferedOutputStream(new FileOutputStream("d:\\test1\\" + new Date().getTime() + ".png"));
            bis = new BufferedInputStream(s.getInputStream());
            byte[] bys = new byte[1024 * 100];
            int len = 0;
            while (true) {
                len = bis.read(bys);
                if (len == -1) {
                    break;
                }
                bos.write(bys, 0, len);

            }

            bis.close();
            s = new Socket("127.0.0.1", 7878);
            InputStream is=s.getInputStream();
            byte[] by = new byte[1024];
            int len1 = is.read(by);

            String line = new String(by, 0, len1);
            System.out.println(line);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
