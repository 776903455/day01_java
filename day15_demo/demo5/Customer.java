package day15_demo.demo5;

import java.util.Random;

public class Customer implements Runnable {
    private BaoZi baoZi=new BaoZi();
    public Customer(BaoZi baoZi){
        this.baoZi=baoZi;
    }

    @Override
    public void run() {

        while (true){
            synchronized (baoZi){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (baoZi.getFlge()!=0){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("xxx正在吃"+baoZi.getName());
                if(baoZi.getKc()>=5) {
                    baoZi.setKc(baoZi.getKc() - 1);
                    System.out.println("当前库存为" + (baoZi.getKc()));
                    baoZi.setFlge(1);
                    baoZi.notify();
                }
                else {
                    System.out.println("排队中。。。");
                    baoZi.setFlge(1);
                    baoZi.notify();
                }
            }
        }

    }
}
