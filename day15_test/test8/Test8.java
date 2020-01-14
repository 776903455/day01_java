package day15_test.test8;

public class Test8 {
    /*写一个卖票的程序，
1. 写一个类，该类继承Thread，定义一个变量记录总票数。
2. 开启四个卖票窗口(开始四个线程),同时执行卖票的程序。
要求每卖一张票在控制台输出：当前窗口为：窗口a卖了一张票，剩余票数为19。其中窗口a为线程的名字。 */
    public static void main(String[] args) {

        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        MyThread m4=new MyThread();
        m1.setName("窗口1");
        m2.setName("窗口2");
        m3.setName("窗口3");
        m4.setName("窗口4");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
