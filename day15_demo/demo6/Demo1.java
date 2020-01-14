package day15_demo.demo6;

public class Demo1 {
    public static void main(String[] args) {
        SS show=new SS();
        new Thread(()->{
            SS.showA();
        }).start();


        new Thread(()->{
            SS.showB();
        }).start();

    }
}
class SS{

    private static Object A=new Object();
    private static Object B=new Object();

    public static void showA(){
        synchronized (A){
            System.out.println("我是A锁");
            synchronized (B){
                System.out.println("我是A中的B锁");
            }
        }

    }

    public static void showB(){
        synchronized (B){
            System.out.println("我是B锁");
            synchronized (A){
                System.out.println("我是B中的A🔒");
            }
        }

    }

}
