package day15_demo.demo5;

import java.util.Random;

public class SJNumber {
    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public static  int getNumber1(){
        Random random=new Random();
        int num= random.nextInt(6)+5;
        return num;
    }
}
