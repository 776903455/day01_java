package day16_test.test9;

import java.util.*;

public class Test9 {
    /*1. 使用lambda表达式对List，Set，Map集合进行遍历。*/
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        Map<Integer,String> map=new HashMap<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("014");
        set.add("123");
        set.add("456");
        set.add("789");
        set.add("014");
        map.put(1,"asd");
        map.put(2,"dgfg");
        map.put(3,"azxcsd");
        map.put(4,"qwe");

        System.out.println("list:");
        list.stream().forEach(n->{
            System.out.println(n);
        });

        System.out.println("set:");
        set.stream().forEach(n->{
            System.out.println(n);
        });

        System.out.println("map:");
        Set<Integer> key=map.keySet();
        key.stream().forEach(n->{
            System.out.println("key:"+n+",value:"+map.get(n));
        });
    }
}
