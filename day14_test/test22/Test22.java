package day14_test.test22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test22 {
    /*完成课上斗地主洗牌发牌案例(牌需要排序)*/
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] arr1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10","J","Q","K","A"};
        String[] arr2 = {"♠", "♣", "♥", "♦"};
        Integer num = 2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                String newStr = arr1[i].concat(arr2[j]);
                map.put(num, newStr);
                num++;
            }
        }
        map.put(0, "大王");
        map.put(1, "小王");

        Set<Integer> keySet = map.keySet();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(keySet);
        Collections.shuffle(arrayList);

        ArrayList<Integer> qwe = new ArrayList<>();
        ArrayList<Integer> asd = new ArrayList<>();
        ArrayList<Integer> zxc = new ArrayList<>();
        ArrayList<Integer> dp = new ArrayList<>();

        for (int i = 0; i < map.size(); i++) {
            if (i < map.size() - 3) {
                if (i % 3 == 0) {
                    qwe.add(arrayList.get(i));
                } else if (i % 3 == 1) {
                    asd.add(arrayList.get(i));
                } else if (i % 3 == 2) {
                    zxc.add(arrayList.get(i));
                }
            }else {
                dp.add(arrayList.get(i));
            }
        }
        Collections.sort(qwe);
        Collections.sort(asd);
        Collections.sort(zxc);
        Collections.sort(dp);

    ArrayList<String> lyh=new ArrayList<>();
    ArrayList<String> xjq=new ArrayList<>();
    ArrayList<String> wxq=new ArrayList<>();
    ArrayList<String> zdp=new ArrayList<>();

        System.out.println("lyh的牌：");
        sortPai(qwe,lyh,map);
        System.out.println("xjq的牌：");
        sortPai(asd,xjq,map);
        System.out.println("wxq的牌：");
        sortPai(zxc,wxq,map);
        System.out.println("dp的牌：");
        sortPai(dp,zdp,map);




    }
    public static void sortPai(ArrayList<Integer> arrayList1,ArrayList<String> arrayList2,HashMap<Integer,String> map){

        for(Integer integer:arrayList1){
            arrayList2.add(map.get(integer));
        }
        System.out.println(arrayList2);
    }
}