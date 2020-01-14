package day15_demo.demo5;

import java.util.Random;

public class Product implements Runnable {
    private BaoZi baoZi=new BaoZi();
    SJNumber sjNumber=new SJNumber();
    public Product(BaoZi baoZi){
        this.baoZi=baoZi;
    }
    @Override
    public void run() {
       /* Random random=new Random();*/


        while (true){
            int num = SJNumber.getNumber1();
            sjNumber.setNum1(num);
            /* int num= random.nextInt(6)+5;*/
            synchronized (baoZi){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while (baoZi.getFlge()!=1){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("老板正在做"+baoZi.getName());
                if(baoZi.getKc()<num){
                    baoZi.setKc(baoZi.getKc()+1);
                    System.out.println("当前库存为"+(baoZi.getKc()));
                }else {
                    System.out.println("包子够了，开始卖包子。。。");
                    baoZi.setFlge(0);
                    baoZi.notify();
                }
            }

        }

    }
}
