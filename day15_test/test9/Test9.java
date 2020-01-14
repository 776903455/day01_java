package day15_test.test9;

public class Test9 {
    /*1. 开启三个线程，分别执行以下三个运算，并将运算结果输出到控制台。
    一个线程计算10! 一个线程计算5! 一个线程计算8! */
    public static void main(String[] args) {

        new Thread(()->{
            int num=1;
            for (int i = 1; i <=10; i++) {
                num*=i;
            }
            System.out.println("计算10！"+num);
        }).start();
        new Thread(()->{
            int num=1;
            for (int i = 1; i <=5; i++) {
                num*=i;
            }
            System.out.println("计算5！"+num);
        }).start();
        new Thread(()->{
            int num=1;
            for (int i = 1; i <=8; i++) {
                num*=i;
            }
            System.out.println("计算8！"+num);
        }).start();
    }
}
