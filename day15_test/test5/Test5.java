package day15_test.test5;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test5 {
    /*1. 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
    这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
    随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名。
    */
    public static void main(String[] args) throws ExecutionException, InterruptedException {



       ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int i = 1; i <=10; i++) {
            Thread.sleep(500);
            MyRunable myRunable=new MyRunable(String.valueOf(i));
            executorService.submit(myRunable);
        }

        executorService.shutdown();


    }

}
