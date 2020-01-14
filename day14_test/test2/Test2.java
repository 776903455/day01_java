package day14_test.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    /*往一个Map集合中添加若干元素.获取Map中的所有key,
     并使用增强for和迭代器遍历输出每个key */
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"老马");
        map.put(2,"中马");
        map.put(3,"小马");
        map.put(4,"老巴");


        Set<Integer> integers = map.keySet();

        System.out.println("增强for");
        for (Integer integer:integers){
            System.out.println(integer);
        }

        System.out.println("迭代器");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
