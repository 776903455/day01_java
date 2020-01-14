package day12_test.test13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Test13 {
    /*1. 完成课堂斗地主案例
    2. 增加需求：哪个玩家拿到大王，就需要拿底牌
     */
    public static void main(String[] args) {
        ArrayList<String> pai=new ArrayList<>();
        String[] hs={"♠","♣","♥","♦"};
        String[] ds={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i <hs.length ; i++) {
            for (int j = 0; j <ds.length ; j++) {
                pai.add(hs[i].concat(ds[j]));
            }
        }
        pai.add("小王");
        pai.add("大王");

        Random random=new Random();
        int index=0;
        for (int i = 0; i <pai.size() ; i++) {
            index=random.nextInt(pai.size());
            String temp=pai.get(i);
            pai.set(i,pai.get(index));
            pai.set(index,temp);
        }



        ArrayList<String> lyh=new ArrayList<>();
        ArrayList<String> xjq=new ArrayList<>();
        ArrayList<String> wxq=new ArrayList<>();
        ArrayList<String> dp=new ArrayList<>();

        for (int i = 0; i < pai.size(); i++) {
            if(i>pai.size()-4){
                dp.add(pai.get(i));
            }else {
                if (i % 3 == 0) {
                    lyh.add(pai.get(i));
                } else if (i % 3 == 1) {
                    xjq.add(pai.get(i));
                } else if (i % 3 == 2) {
                    wxq.add(pai.get(i));
                }
            }
        }


        sort("dp",dp,dp);
        sort("lyh",lyh,dp);
        sort("xjq",xjq,dp);
        sort("wxq",wxq,dp);


    }

    public static  void  sort(String name,ArrayList<String> arrayList,ArrayList<String> dp){
        if (arrayList.contains("大王")&&arrayList!=dp){
            arrayList.addAll(dp);
        }
        System.out.print(name+"的牌：");
        for (String  s:arrayList){
            System.out.print(s);
        }

        if(arrayList.size()==17){
            System.out.println("   不抢");
        }else if (arrayList.size()==20){
            System.out.println("   抢地主");
        }else {
            System.out.println("   谁要抢我");
        }


        System.out.println();
    }
}
