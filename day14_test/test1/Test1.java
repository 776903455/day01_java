package day14_test.test1;

import java.util.HashMap;

public class Test1 {
    /*练习Map集合的常用方法: put, get, remove */
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("put方法");
        map.put(1,"老马");
        map.put(2,"中马");
        map.put(3,"小马");
        System.out.println(map);

        System.out.println("get方法");
        System.out.println(map.get(2));

        System.out.println("remove方法");
        System.out.println(map.remove(3));
        System.out.println(map);
    }

}
