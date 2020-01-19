package day20_test.test8.shop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ToRegister {

    static Scanner scanner =new Scanner(System.in);
   /* *//*将用户信息封装到一个list集合中*//*
    private  static  ArrayList<User> userList=new ArrayList<>();*/
    /*创建一个User对象*/
    static User user =new User();
    /*用户注册*/
    public static  void register(){
        System.out.println("请输入用户名：");
        String username=scanner.next();
        user.setUsername(username);
        System.out.println("请输入密码：");
        String password=scanner.next();
        user.setPassword(password);
        System.out.println("请输入手机号");
        String phone=scanner.next();
        user.setPhone(phone);
        save(user);

    }

    /*将用户信息保存到本地硬盘*/
    private static void save(User user){

        FileOutputStream fw=null;
        ObjectOutputStream os=null;
        try {
            File file=new File("D:\\shop\\user.txt");
            fw=new FileOutputStream(file,true);
            os=new ObjectOutputStream(fw);

            os.writeObject(user);



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
