package day16_test.test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    /* 使用线程池：一个线程计算10! ，一个线程计算5!， 一个线程计算8!
     打印在那个线程执行的和执行结果.(使用 Runnable) */
    public static void main(String[] args) {
       ExecutorService executorService= Executors.newFixedThreadPool(3);

       executorService.submit(new MyRunnable(10));
       executorService.submit(new MyRunnable(8));
       executorService.submit(new MyRunnable(5));
       executorService.shutdown();
    }
}
