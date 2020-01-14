package day16_test.test3;

import java.util.concurrent.*;

public class Test3 {

    /*
    * 1. 使用线程池,分别开启三条线程,生成10个1到100的随机数,
    * 然后计算他们的平均数, 最后计算这三个平均数的平 均数.(使用Callable)
    * */
    public static void main(String[] args) throws Exception {
        ExecutorService executor= Executors.newFixedThreadPool(3);

        Integer sum=0;
        for (int i = 0; i < 3; i++) {
            MyCallable myCallable=new MyCallable();
            Future<Integer> submit = executor.submit(myCallable);

            sum+=submit.get();

        }
        System.out.println("三个线程调用后的平均分："+sum/3);
        executor.shutdown();
    }
}
