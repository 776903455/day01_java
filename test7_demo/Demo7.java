package test7_demo;

import java.util.ArrayList;
import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {

        int num=50;
        int money=1000;
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i <num-1 ; i++) {

            Random random=new Random();
            int yu=random.nextInt(money/num*2)+1;
            arrayList.add(yu);
            money=money-yu;

        }
        arrayList.add(money);
        int sum=0;
        for(Integer i:arrayList){
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);


 /*       for (int i = 0; i <5 ; i++) {
                    while (num > 0) {
                        switch (i) {
                            case 1:
                                Random random = new Random();
                                int sj = random.nextInt(5);
                                System.out.println(arrayList.get(sj));
                                arrayList.remove(sj);
                                num--;
                                break;
                            case 2:
                                Random random1 = new Random();
                                int sj1 = random1.nextInt(5);
                                System.out.println(arrayList.get(sj1));
                                arrayList.remove(sj1);
                                num--;
                                break;
                            case 3:
                                Random random2 = new Random();
                                int sj2 = random2.nextInt(5);
                                System.out.println(arrayList.get(sj2));
                                arrayList.remove(sj2);
                                num--;
                                break;
                            case 4:
                                Random random3 = new Random();
                                int sj3 = random3.nextInt(5);
                                System.out.println(arrayList.get(sj3));
                                arrayList.remove(sj3);
                                num--;
                                break;
                            case 5:
                                Random random4 = new Random();
                                int sj4 = random4.nextInt(5);
                                System.out.println(arrayList.get(sj4));
                                arrayList.remove(sj4);
                                num--;
                                break;

                        }
            }
        }*/

    }
}
