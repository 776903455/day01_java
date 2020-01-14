package day6_test;

import java.util.Scanner;

public class Test1 {
    /*1. 创建Scanner对象
    2. 输出提示:"请输入第一个数据："
    3. 使用Scanner对象接收第一个键盘录入的数据,赋值给int类型的变量a
    4. 输出提示:"请输入第二个数据："
    5. 使用Scanner对象接收第二个键盘录入的数据,赋值给int类型的变量b
    6. 输出提示:"请输入第三个数据："
    7. 使用Scanner对象接收第三个键盘录入的数据,赋值给int类型的变量c
    8. 定义int类型变量temp,保存a和b比较后的较大值
    9. 定义int类型变量max,保存temp和c比较后的较大值
    10. 输出最大值max */

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数");
        int b=scanner.nextInt();
        System.out.println("请输入第三个数");
        int c=scanner.nextInt();
        int temp = a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值为："+max);

    }
}
