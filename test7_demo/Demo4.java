package test7_demo;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        s1 = s1.replace("[", "");
        String[] s2 = s1.split("name=");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i < s2.length; i++) {
            System.out.println(s2[i]);
            int startIndex = s2[i].indexOf(",");
            String s3 = s2[i].substring(0, startIndex);
            arrayList.add(s3);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

      /*  for (int i = 0; i <s2.length-1 ; i++) {
            System.out.println(s2[i]);
            int startIndex=s2[i+1].indexOf(",");
            String s3=s2[i+1].substring(0,startIndex);
            System.out.println(s3);
        }

    }*/
    }
}
