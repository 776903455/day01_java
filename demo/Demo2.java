package demo;

import org.junit.Test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Demo2 {


    public static void main(String[] args) throws IOException {

      zy();
    }


    public static void zy() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选则你要进行的操作");
        System.out.println("1:登录");
        System.out.println("2:注册");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("请输入用户名");
                String username = scanner.next();
                System.out.println("密码");
                String password = scanner.next();
                Login.login(username, password);
                break;
            case 2:
                Register.register();
                break;
        }
    }





}

