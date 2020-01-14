package day04_test;

public class Test7 {

    /*定义round方法，接收一位小数，实现四舍五入运算，并返回结果。 */
    public static void main(String[] args) {
        System.out.println("10.1->"+round(10.1));
        System.out.println("10.2->"+round(10.2));
        System.out.println("10.6->"+round(10.6));
        System.out.println("10.9->"+round(10.5));

    }

    private static int round(double num) {

        int num1=(int)(num+0.5);
        return num1;




    }
}
