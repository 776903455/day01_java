package day15_test.test6;

public class MyRunable implements Runnable {

    private  static  Integer shuibei=100;
    private static  Object obj=new Object();
    @Override
    public void run() {


            while (true) {
                synchronized (obj) {
                if (shuibei <1) {
                    System.out.println("水杯卖完了");
                    break;
                }
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + shuibei + "个杯子，总共还剩" + (--shuibei) + "个");
            }

        }
    }
}
