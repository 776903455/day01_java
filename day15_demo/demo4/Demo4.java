package day15_demo.demo4;

public class Demo4 {
    public static void main(String[] args) {
        String s1="s1";
        String s2="s2";
        new Thread(()->{
            synchronized (s1){
                System.out.println(Thread.currentThread().getName()+"hello");
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+"world");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (s2){
                System.out.println(Thread.currentThread().getName()+"hello1");
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName()+"world1");
                }
            }
        }).start();
    }
}
