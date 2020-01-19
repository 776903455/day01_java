package day20_test.test8;

import com.shop.Zhuye;
import day20_test.test8.game.MainJM;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class CilentTCP {
    public static void main(String[] args) {
        Socket s=null;
        BufferedWriter bw=null;
        BufferedReader br=null;
        String info=null;
        try {
         s =new Socket("localhost",10001);
         Scanner scanner=new Scanner(System.in);
            System.out.println("请输入用户名和密码格式为xxxx=xxx：");
            String user=scanner.next();
            bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            bw.write(user);
            bw.newLine();
            bw.flush();

            /*读取服务端传回的信息*/
            info= br.readLine();
            System.out.println(info);
            if("登录成功".equals(info)){
                String[] users=user.split("=");
                System.out.println("欢迎回来，"+users[0]);
                System.out.println("1:play_game");
                System.out.println("2:shop");
                int num = scanner.nextInt();
                switch (num){
                    case  1:
                        MainJM.JM();
                        break;
                    case 2:
                        Zhuye.zhuye();
                        break;
                        default:
                            break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
