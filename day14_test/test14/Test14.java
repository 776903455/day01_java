package day14_test.test14;

import java.util.ArrayList;
import java.util.HashMap;

public class Test14 {
    /*定义一个List集合,泛型为String类型。统计整个集合中所有字符（注意，不是字符串）的个数。
    例如:集合中 有”abc”、”bcd”两个元素,程序最终输出结果为:“a = 1,b = 2,c = 2,d = 1”
    */
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        arrayList.add("abc");
        arrayList.add("bcd");
        for(String s:arrayList){
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                Integer value = hashMap.get(ch[i]);
                if(value==null){
                    hashMap.put(ch[i],1);
                }else {
                    hashMap.put(ch[i],value+1);
                }

            }
        }
        System.out.println(hashMap);

    }
}
