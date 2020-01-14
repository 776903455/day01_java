package com.lyh.test;

import java.util.Scanner;

public class Test7 {
    /*1. 定义类 Test7
    2. 定义 main方法
    3. 定义add方法,打印两个变量的和
    4. 定义sub方法,打印两个变量的差
    5. 定义mul方法,打印两个变量的积
    6. 定义div方法,打印两个变量的商
    7. 定义remain方法,打印两个变量的余数
     8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法*/

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2=scanner.nextInt();
        add(num1,num2);
        sub(num1,num2);
        mul(num1,num2);
        div(num1,num2);
        remain(num1,num2);

    }

    /*定义add方法,打印两个变量的和*/
    private static void add(int num1, int num2) {
        System.out.println("两数的和："+(num1+num2));

    }
    /*定义sub方法,打印两个变量的差*/
    private static void sub(int num1, int num2) {
        System.out.println("两数的差："+(num1-num2));

    }

    /*定义mul方法,打印两个变量的积*/

    private static void mul(int num1, int num2) {
        System.out.println("两数的积："+num1*num2);
    }

    /*定义div方法,打印两个变量的商*/
    private static void div(int num1, int num2) {
        System.out.println("两数的商："+num1/num2);
    }

    /*定义remain方法,打印两个变量的余数*/
    private static void remain(int num1, int num2) {
        System.out.println("两数的余数"+num1%num2);
    }

}
