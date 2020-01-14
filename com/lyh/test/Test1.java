package com.lyh.test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入长：");
        int chang =scanner.nextInt();
        System.out.println("请输入宽：");
        int kuang =scanner.nextInt();
        System.out.println("长方形的面积为：");
        System.out.println(chang*kuang);
        System.out.println("长方形的周长为：");
        System.out.println((chang+kuang)*2);
    }
}
