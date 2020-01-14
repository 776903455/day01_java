package day14_test.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {

    /*每位学生（姓名，年龄）都有自己的家庭住址。
    那么，既然有对应关系，则将学生对象和家庭住址存储到Map集合 中。
    家庭住址作为键, 学生作为值。并使用keySet和entrySet方式遍历Map集合 */

    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        hashMap.put("广州",new Student("杨过",18));
        hashMap.put("深圳",new Student("郭靖",36));
        hashMap.put("佛山",new Student("杨康",20));
        hashMap.put("香港",new Student("陈玄风",30));

        System.out.println("keySet方法");
        Set<String> set = hashMap.keySet();
        for(String s:set){
            System.out.println(s+"--"+hashMap.get(s));
        }

        System.out.println("entrySet方法");
        Set<Map.Entry<String,Student>> entry=hashMap.entrySet();
        for(Map.Entry<String,Student> entry1:entry){
            System.out.println(entry1);
        }

    }

}
