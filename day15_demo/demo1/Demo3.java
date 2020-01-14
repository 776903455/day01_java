package day15_demo.demo1;

public class Demo3 {
    public static void main(String[] args) {

        Thread t1=new Thread("关羽"){
            @Override
            public void run(){

                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };

        Thread t2=new Thread("张飞"){
            @Override
            public void run(){

                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
        for (int i = 0; i < 50; i++) {
            System.out.println("刘备"+i);
        }
        t1.setPriority(6);
        t2.setPriority(7);
        t1.setDaemon(true);
        t2.setDaemon(true);


        t1.start();
        t2.start();
    }
}
