package day07_test;

import java.util.ArrayList;

public class Test10 {

    public static void main(String[] args) {
        String s1 = "[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        s1 = s1.replace("[", "");
        String[] s2 = s1.split("name=");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i < s2.length; i++) {

            int startIndex = s2[i].indexOf(",");
            String s3 = s2[i].substring(0, startIndex);
            arrayList.add(s3);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
        }



}
