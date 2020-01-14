package day15_demo.demo2;

public class Demo2 {

    public static void main(String[] args) {
        Show show = new Show();
        new Thread(() -> {
            try {
                show.showA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                show.showB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class Show{

    private int num=1;

    public   void showA() throws InterruptedException {
        for (int i = 1; i <= 52; i++) {
        synchronized (Object.class) {

            if(num%3!=0) {
                System.out.println(i);
                num++;
            }else {
                Thread.sleep(1000);
            }


            }

        }

    }

    public  void showB() throws InterruptedException {
        char c=65;

                 for (int i = 0; i < 26; i++) {
            synchronized (Object.class){
                     if(num%3==0) {
                         System.out.println(c);
                         c++;
                         num++;
                     }
                     Thread.sleep(1000);


            }
        }
    }
}



/*class Show{
          *//*  private   boolean flag=true;*//*
    private int num=1;

            public   void showA() throws InterruptedException {
                for (int i = 1; i <= 52; i++) {
                    synchronized (Object.class) {
                        while (num%3==0) {
                            Object.class.wait();
                        }
                        System.out.println(i);
                        num++;
                        Object.class.notify();
                    }
                }

                }

             public  void showB() throws InterruptedException {
                char c=65;

                 for (int i = 0; i < 26; i++) {
                     synchronized (Object.class){
                         while (num%3!=0){
                             Object.class.wait();
                         }

                         System.out.println(c);
                         c++;
                         num++;
                         Object.class.notify();
                     }
                 }
            }
        }*/
