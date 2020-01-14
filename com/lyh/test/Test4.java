package com.lyh.test;

public class Test4 {
    /*1. 定义类 Test4
    2. 定义 main方法
    3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
    4. 定义两个int类型变量b1和b2,分别赋值12,13,判断变量是否为奇数,拼接输出结果 */
    public static void main(String[] args) {
        int a1=10;
        int a2=11;
        boolean a3=a1%2==0?true:false;
        boolean a4=a2%2==0?true:false;
        System.out.println("10是偶数？"+a3);
        System.out.println("11是偶数？"+a4);
        int b1=12;
        int b2=13;
        boolean b3=b1%2!=0?true:false;
        boolean b4=b2%2!=0?true:false;
        System.out.println("12是奇数？"+b3);
        System.out.println("13是奇数？"+b4);

    }
}
