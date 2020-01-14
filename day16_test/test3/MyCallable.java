package day16_test.test3;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random=new Random();
        int sum=0;
        for (int i = 0; i < 10; i++) {
          int num=  random.nextInt(100)+1;
           sum+=num;
        }
        int avg=sum/10;
        System.out.println(Thread.currentThread().getName()+",sum="+sum+",avg="+avg);
        return avg;
    }
}
