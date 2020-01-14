package day14_test.test5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    /*Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”
    张柏 芝”.使用Entry方式迭代出Map集合中的元素 */
    public static void main(String[] args) {
        HashMap<String,String> map1 =new HashMap<>();
        map1.put("邓超","孙俪");
        map1.put("李晨","范冰冰");
        map1.put("刘德华","柳岩");
        map1.put("黄晓明","Baby");
        map1.put("谢霆锋","张柏芝");
//        Set<Map.Entry<String, String>> entries = map1.entrySet();

        Set<Map.Entry<String ,String >> entries=map1.entrySet();

        System.out.println("for方法");
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry);
        }

        System.out.println("迭代器方法");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
