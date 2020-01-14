package day15_demo.demo4;

public class Demo1 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    synchronized (Object.class){
                        System.out.println(i);
                        try {
                            Object.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    synchronized (Object.class) {
                        Object.class.notify();
                    }
                }

            }
        }).start();
    }
}
