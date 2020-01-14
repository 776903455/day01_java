package day14_test1.test12;

import java.util.Random;
import java.util.Scanner;

public class Test12 {
    /*开启一个线程执行任务：
    随机获得10个100到1000的整数并将10个整数相加求和，将求和结果输出*/
    public static void main(String[] args) {

      /* Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                int  sum=0;
                for (int i = 0; i < 10; i++) {
                    sum+=sjInt();
                    System.out.print(sjInt()+"  ");
                }
                System.out.println();
                System.out.println(sum);
            }

        });
       t1.start();*/

      new Thread(()->{
         int sum=0;
          for (int i = 0; i < 10; i++) {
              sum+=sjInt();
          }
          System.out.println(sum);
      }).start();

    }
    public static  int sjInt(){
        Random random=new Random();
       int num= random.nextInt(1000)+100;
       return num;
    }
}
