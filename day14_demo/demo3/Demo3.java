package day14_demo.demo3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3 {

    public static void main(String[] args) {
        shows s=new shows();
        new Thread(() -> {
            try {
                s.show1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                s.show2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


class shows{
    int count=1;
    ReentrantLock lock =new ReentrantLock();
    Condition c1;
    Condition c2;
    public  shows(){
        c1=lock.newCondition();
        c2=lock.newCondition();
    }
    public void show1() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
           lock.lock();
                while (count!=1){
                   c1.await();
                }
                Thread.sleep(10);
                System.out.println("拳打南山敬老院");
                count=2;
                c2.signal();
                lock.unlock();


        }
    }

    public  void show2() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
          lock.lock();
                while (count != 2) {
                 c2.await();
                }
                Thread.sleep(10);
                System.out.println("脚踢北海幼儿园");
                count=1;
                c1.signal();
                lock.unlock();

            }
        }
    }


/*
class shows{
    int count=1;
    public void show1() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class){
                while (count!=1){
                 Object.class.wait();
                }
                Thread.sleep(10);
                System.out.println("拳打南山敬老院");
                count=2;
                Object.class.notify();
            }
        }
    }

    public  void show2() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (count != 2) {
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.println("脚踢北海幼儿园");
                count=1;
               Object.class.notify();
            }
        }
    }
}
*/
