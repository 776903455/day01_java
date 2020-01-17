package day20_test.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {

    /*使用TCP协议实现客户端和服务端互相发送消息。
    客户端发送一条消息，服务器读取之后，返回一条消息给客户端，客户端读取服务器返回的消息之后，
    又发送一条 消息…循环执行，直到输入exit。
      1. 消息内容通过键盘输入
      2. 要求服务器端和客户端都使用字符流的方式发送和接收数据。
      使用BuﬀeredReader方法readLine()读取一行数据。 使用BuﬀeredWriter方法write("字符串的数据")发送数据。*/

        static{
            System.out.println("客户端启动，开始连接...");
        }

    public static void main(String[] args) {

        BufferedWriter bw = null;
        Socket s = null;
        BufferedReader br=null;
        String line;
        ServerSocket ss=null;
        Scanner scanner = new Scanner(System.in);

            try {

               /* bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                br=new BufferedReader(new InputStreamReader(s.getInputStream()));*/

                while (true) {
                    s = new Socket("127.0.0.1", 10087);
                    String next = scanner.next();
                    bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                    if ("exit".equals(next)) {
                        break;
                    }

                    while(next!=null) {
                        bw.write(next);
                        bw.newLine();
                        bw.flush();


                        line = br.readLine();
                        System.out.println(line);
                        break;
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bw.close();
                    br.close();
                    s.close();
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }


