package day15_test.test3;

public class Test3 {
    /*1. 请编写程序，分别打印主线程的名称和子线程的名称。
    要求使用两种方式实现：
    第一种方式：继承Thread类。
    第二种方法：实现Runnable接口。 */
    public static void main(String[] args) {

      /*
        System.out.println("--------------Thread-----------------");
       Thread.currentThread().setName("我是老大主线程");
        System.out.println("主线程的名称-"+Thread.currentThread().getName());
        MyThread myThread=new MyThread();
        myThread.setName("我是老二子线程");
        myThread.start();*/

        System.out.println("--------------Runnable-----------------");

        System.out.println("主线程名称-"+Thread.currentThread().getName());
            MyRunnable m1=new MyRunnable();
            Thread t1=new Thread(m1);

            t1.start();

    }
}
