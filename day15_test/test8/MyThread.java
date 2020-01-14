package day15_test.test8;

public class MyThread extends Thread {
    private static int ticket=100;
    private static  Object object=new Object();

    @Override
    public void run() {
       while (true){
           synchronized (object){
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if(ticket<1){
                   System.out.println("票买完了");
                   break;
               }
               System.out.println(Thread.currentThread().getName()+"卖了1张票还剩"+(ticket-1)+"张票");
               ticket--;
           }

       }

    }
}
