package day14_test.test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    /*Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰",
    "刘德华"->"柳岩", “黄晓明”->” Baby”,
    “谢霆锋”->”张柏 芝”.使用keySet方式迭代出Map集合中的元素 */

    public static void main(String[] args) {

        HashMap<String,String> map =new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");


        Set<String> set=map.keySet();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value=map.get(key);
            System.out.println(key+"--"+value);

        }

    }
}
