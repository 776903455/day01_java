package demo;

import day03_test.demo.Demo;
import org.junit.Test;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CheckQQ {

    @Test
    public  void checkClient(){

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Socket socket=null;
                BufferedWriter fw=null;
                BufferedReader fr=null;
                try {
                    socket =new Socket("192.168.1.103",10086);
                   OutputStream out= socket.getOutputStream();
                     fw=new BufferedWriter(new OutputStreamWriter(out));
                     fr=new BufferedReader(new InputStreamReader(System.in));
                     while (true){

                         String inString=fr.readLine();
                         fw.write(inString);
                         fw.flush();
                         if("886".equals(inString)){
                          Demo2.zy();
                         }

                     }


                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(socket!=null) {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    if(fw!=null) {
                        try {
                            fw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    if(fr!=null) {
                        try {
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }
        });
        t1.start();
    }

    @Test
    public  void checkService(){

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                ServerSocket serverSocket=null;
                BufferedReader br=null;
                BufferedWriter bw=null;
                try {
                    serverSocket =new ServerSocket(10086);
                    Socket s=serverSocket.accept();
                    InputStream is=s.getInputStream();
                    br=new BufferedReader(new InputStreamReader(is));

                    while (true){
                        System.out.println("客户端："+br.readLine());


                        if("886".equals(br.readLine())){
                            Demo2.zy();
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        t2.start();
    }


}
