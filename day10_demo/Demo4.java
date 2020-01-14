package day10_demo;

import java.util.ArrayList;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        int num=5;
        double money=500;
        ArrayList<Integer> arrayList = sendRed(num, money);
        for(Integer i:arrayList){
            System.out.println(i);
        }
    }

    private static ArrayList<Integer> sendRed(int num, double money) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int sj=0;

        for (int i = 1; i <num ; i++) {
            Random random=new Random();
            sj= random.nextInt((int)((money/num-i)*2));
            arrayList.add(sj);
            money-=sj;

        }

        arrayList.add((int) money);
        return  arrayList;
    }
}
