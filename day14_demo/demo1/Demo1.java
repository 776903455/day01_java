package day14_demo.demo1;

import javax.swing.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {

    public static void main(String[] args) {
         B b=new B();
        new Thread(){
            @Override
            public void run(){
            b.products();
            }
        }.start();

        new Thread(){
            @Override
    public void run(){
        b.comsutor();
    }

}.start();
        }


}
class B{
    boolean flag=false;
    ReentrantLock lock=new ReentrantLock();
    Condition c1;
    Condition c2;
    public B(){
        c1=lock.newCondition();
        c2=lock.newCondition();
    }

    public  void comsutor(){
        for (int i = 1; i < 100; i++) {
        lock.lock();
                while (flag==false){
                    try {
                      c1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("第"+i+"个客人：老板来个包子");
             flag=false;
             c2.signal();
             lock.unlock();



        }
    }

    public void products(){

        for (int i = 1; i <100 ; i++) {
        lock.lock();

                while (flag==true){
                    try {
                       c2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("老板正在努力做第"+i+"个包子");
                flag=true;
               c1.signal();
               lock.unlock();


        }

    }

}

/*class A{
    boolean flag=false;

    public  void comsutor(){
        for (int i = 1; i < 100; i++) {
            synchronized (Object.class){

                while (flag==false){
                    try {
                        Object.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("第"+i+"个客人：老板来个包子");
                flag=false;
                Object.class.notify();
            }

        }
    }

    public void products(){

        for (int i = 1; i <100 ; i++) {
            synchronized (Object.class){

                while (flag==true){
                    try {
                        Object.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("老板正在努力做第"+i+"个包子");
                flag=true;
                Object.class.notify();

            }
        }

    }

}*/
