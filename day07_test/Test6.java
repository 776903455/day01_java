package day07_test;

import java.util.Scanner;

public class Test6 {
    /*，将键盘录入的字符串中敏感字符过滤掉，并测试
    1. 定义一个String变量mgc,保存敏感词: "奥巴马"
   2. 创建Scanner对象
   3. 提示用户输入一个字符串
   4. 使用Random的next方法录入一个字符串
   5. 使用replace方法,将键盘输入字符串中的敏感词替换成"*"
   6. 打印出替换后的字符串 */

    public static void main(String[] args) {

        String mgc="奥巴马";
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=scanner.next();
        String str1=str.replace(mgc,"*");
        System.out.println(str1);

    }
}
