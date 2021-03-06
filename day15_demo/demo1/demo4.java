package day15_demo.demo1;

public class demo4 {
    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1："+i);
                }
            }
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 100; i++) {
                if(i==10) {
                    Thread.yield();
                }
                System.out.println("线程2："+i);
            }
        });

        t1.start();
        t2.start();
    }
}
