package day20_test.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTCP {

    static {
        System.out.println("服务端启动，等待连接");
    }
    public static void main(String[] args) {

        ServerSocket ss=null;
        BufferedWriter bw=null;
        BufferedReader br=null;
        Socket s=null;
        String line=null;
        Scanner scanner=new Scanner(System.in);

            try {
                ss = new ServerSocket(10087);
               over: while (true) {
                    s = ss.accept();
                    br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

                    while ((line = br.readLine()) != null) {
                        if("exit".equals(line)){
                            break over;
                        }
                        System.out.println(line);

                        String next = scanner.next();
                        bw.write(next);
                        bw.newLine();
                        bw.flush();
                        break;
                     }
                 }
            } catch (IOException e) {


            }finally {
                try {
                    br.close();
                    bw.close();
                    ss.close();
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
