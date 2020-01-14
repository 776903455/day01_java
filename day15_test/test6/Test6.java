package day15_test.test6;

public class Test6 {
    /*1. 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，
    并且分别统计卖了多少。请用线程进行模 拟并设置线程名称用来代表售出途径，
    再将信息打印出来。

    比如（实体店卖出第1个，总共剩余n个..） */
    public static void main(String[] args) {
        MyRunable my1=new MyRunable();
        MyRunable my2=new MyRunable();
        Thread t1=new Thread(my1,"实体店");
        Thread t2=new Thread(my2,"网店");
        t1.start();
        t2.start();

    }
}
