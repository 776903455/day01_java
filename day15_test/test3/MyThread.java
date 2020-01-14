package day15_test.test3;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("子线程的名称-"+Thread.currentThread().getName());
    }
}
