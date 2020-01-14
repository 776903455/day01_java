package day07_test;

import java.util.Scanner;

public class Test7 {

    /*用户输入一个“QQ号码”，判断这个QQ号码是否正确 定义checkQQ (String qq)方法,checkQQ
    方法内实现验 证QQ号码是否正确 验证规则：
     1. 必须是5—12位数字
     2. 首位不能是0
*/

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的QQ号码:");
        String qq=scanner.next();
        boolean flag=CheakQQ(qq);
        System.out.println(flag);
    }

    private static boolean CheakQQ(String qq) {
        boolean flag=false;
        char[] ch=qq.toCharArray();
        String rgx="[0-9]{5,12}";
        if(qq.matches(rgx)) {
            for (int i = 0; i < ch.length; i++) {

                if (ch[0] != '0') {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}
