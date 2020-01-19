package day20_test.test8.shop;

import java.util.Scanner;

public class Zhuye {

    public static void main(String[] args) {
        zhuye();
    }

    public static void zhuye(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("==================网上购物商城==================");
        System.out.println("1:进入商城");
        System.out.println("2:会员登录");
        System.out.println("3:注册会员");
        System.out.println("4:管理员登录");
        System.out.println("5:退出系统");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                Shopping.showShop();
                break;
            case 2:
                ToLogin.login();
                break;
            case 3:
                ToRegister.register();
                break;
            case 4:
                Admin.adminLogin();
            case 5:
                System.exit(0);
        }


    }
}
