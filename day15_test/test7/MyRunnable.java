package day15_test.test7;

public class MyRunnable implements   Runnable {
    private static int picket=80;
    private static Object object=new Object();

    @Override
    public void run() {
       while (true){
           synchronized (object) {
               if(picket<1){
                   System.out.println("没座位了");
                   break;
               }
               System.out.println(Thread.currentThread().getName()+"上车---还剩"+(picket-1)+"个座位");
               picket--;
           }

       }

    }
}
