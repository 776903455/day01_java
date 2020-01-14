package day14_test.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    /*往一个Map集合中添加若干元素.获取Map中的所有value,
    并使用增强for和迭代器遍历输出每个value */

    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("杨康","穆念慈");
        map.put("陈玄风","梅超风");

      Set<String > set=  map.keySet();

        System.out.println("增强for");
        for(String s:set){
            System.out.println(map.get(s));
        }
        System.out.println("迭代器");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
           /* System.out.println(iterator.next());*/
            System.out.println(map.get(iterator.next()));
        }
    }
}
