package com.shop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ToLogin {
    static ArrayList<User> userlist=new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void login() {
        /*登录功能*/
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();


        FileInputStream fs = null;
        ObjectInputStream ois = null;
        try {
            String path = "D:\\shop\\user.txt";
            fs = new FileInputStream(path);
            while (fs.available()>0) {
                ois = new ObjectInputStream(fs);
                User user=(User) ois.readObject();
                userlist.add(user);
            }

            k:for(User user:userlist){
                if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
                    userJM(username);
                    break k;
                }else{
                    System.out.println("用户名或密码错误，请重新登录");
                    login();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*会员界面*/
    public static void userJM(String username){
        System.out.println("欢迎回来"+username);
        System.out.println("1:进入商城");
        System.out.println("2:查看购物车");
        System.out.println("3:退出");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                Shopping.showShop();
                break;
            case 2:
                break;
            case 3:
                Zhuye.zhuye();
                break;
        }


    }
}





