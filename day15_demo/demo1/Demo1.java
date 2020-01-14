package day15_demo.demo1;

public class Demo1 {

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

      Thread t2=new Thread(new Runnable() {
          @Override
          public void run() {

              for (int i = 0; i < 100; i++) {
                  System.out.println(i);
                  if (i==15){
                      try {
                          t1.join();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }

              }
          }
      });
      t2.start();


    }
}
