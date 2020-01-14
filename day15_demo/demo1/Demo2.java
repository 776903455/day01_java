package day15_demo.demo1;

import java.util.concurrent.locks.ReentrantLock;

public class Demo2 {

    public static void main(String[] args) {
        Buyticket buy=new Buyticket();
        Thread t1=new Thread(buy,"南站");
        Thread t2=new Thread(buy,"北站");
        Thread t3=new Thread(buy,"西站");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Buyticket implements Runnable{
 private  static int ticket=100;
/*private static Object obj=new Object();*/
    ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            lock.lock();
                if (ticket < 1) {
                    System.out.println("票卖完了");
                    lock.unlock();
                    break;
                }
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;

               lock.unlock();
            }
        }
    }

