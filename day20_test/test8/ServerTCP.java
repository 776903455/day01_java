package day20_test.test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class ServerTCP {

    /*1. 服务端可以接收多个用户的请求连接。
    2. 客户端登录发送用户名和密码，格式： jack=123456 用户名和密码通过键盘录入。
    3. 服务器端接收到用户名和密码之后，查询本地用来存储注册信息的文件
    判断用户名是否存在，如果用户名存在，则判断密码是否正确，如果密码不正确，
    则提示客端户密码错 误，如果密码正确，则提示客户端登录成功。
    如果用户名不存在，则使用接收到的用户名和密码注册一个账号，
    注册成功则提示客户端注册成功。注册失败则提示客户端注册失败*/

    static {
        System.out.println("服务端启动,等待连接...");
    }
    public static void main(String[] args) {

        new Thread(()->{
            Socket s=null;
            ServerSocket ss=null;
            BufferedWriter bw=null;
            BufferedReader br=null;
            String line=null;
            try {
                ss=new ServerSocket(10001);
                while (true){

                    s=ss.accept();
                    System.out.println("连接成功...");
                    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                    bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

                    while((line=br.readLine())!=null){
                        System.out.println("客户端传过来的用户数据："+line);
                        /*调用校验方法*/
                        String checkinfo=checkUser(line);
                        /*回写客户端信息*/
                        bw.write(checkinfo);
                        bw.newLine();
                        bw.flush();
                        break;
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    s.close();
                    ss.close();
                    bw.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();


    }

    private static String  checkUser(String line) throws IOException {

        /*读取本地存储注册信息*，判断有无次用户*/
        String[] user=line.split("=");

        /*返回校验信息*/
        String checkinfo=null;

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("D:\\java_space\\day01_java\\src\\day20_test\\test8\\userInfo.properties");
        p.load(fis);
        Set<String> key= p.stringPropertyNames();
        for(String username:key){
            /*如果用户名存在，则校验用户密码*/


            if(username.equals(user[0])){
                System.out.println(p.getProperty(username)+"="+user[0]);
                if(p.getProperty(username).equals(user[1])){
                    checkinfo="登录成功";
                    break;
                }else {
                    checkinfo="密码错误";
                    break;
                }

            }else{
                /*否则叫创建一个新的用户，并保存到注册信息文件中*/
                FileOutputStream fos=new FileOutputStream("D:\\java_space\\day01_java\\src\\day20_test\\test8\\userInfo.properties");
                String str = (String) p.setProperty(user[0], user[1]);
                p.store(fos,str);
                checkinfo="注册成功";
                continue;
            }
        }


        return checkinfo;
    }

}
