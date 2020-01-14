package day15_demo.demo6;

public class Demo2 {
    public static void main(String[] args) {
        Show show=new Show();
        new Thread(()->{
            try {
                show.showA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                show.showB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}

class Show{
    private static boolean flag=true;

    public static void showA() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (flag != true) {
                    Object.class.wait();
                }
                System.out.println("谁是250");
                flag=false;
                Object.class.notify();
            }
        }
    }

    public static void showB() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (flag != false) {
                    Object.class.wait();
                }
                System.out.println("我是250");
                flag=true;
                Object.class.notify();
            }
        }
    }

}
