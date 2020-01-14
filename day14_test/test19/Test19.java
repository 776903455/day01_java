package day14_test.test19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test19 {
    /*小米科技包含2个班级：Java基础班，Java就业班
    Java基础班
      001 李晨
      002 范冰冰
      Java就业班
      001 马云
      002 马化腾 使用HashMap集合存储以上班级的学生信息，并完成以下两个需求
    1.使用keySet和增强for遍历出里面的元素 2.使用entrySet和迭代器遍历出里面的元素
*/
    public static void main(String[] args) {
        HashMap<String,HashMap<String,String>> hashMap=new HashMap<>();
        HashMap<String,String> hashMap0=new HashMap<>();
        HashMap<String,String> hashMap1=new HashMap<>();
        hashMap0.put("001","李晨");
        hashMap0.put("002","范冰冰");
        hashMap1.put("001","马云");
        hashMap1.put("002","马化腾");
        hashMap.put("java基础班",hashMap0);
        hashMap.put("java就业班",hashMap1);
        System.out.println("增强for");
        Set<String> key = hashMap.keySet();
        for (String s1:key){
            System.out.println(s1);
            for(String s2:hashMap.get(s1).keySet()){
                System.out.println(s2+" "+hashMap.get(s1).get(s2));
            }
        }

        System.out.println("entry方法");
        Set<Map.Entry<String, HashMap<String, String>>> entries = hashMap.entrySet();
        for (Map.Entry<String, HashMap<String, String>> s3:entries){
           /* System.out.println(s3);*/
            HashMap<String, String> value = s3.getValue();
            System.out.println(s3.getKey());
            Set<Map.Entry<String,String>> entry = value.entrySet();
            for(Map.Entry<String,String> str:entry){
                System.out.println(str);
            }

//               for (Map.Entry<String,String> s4:hashMap.get(entries).entrySet()){
//                   System.out.println(s4);
//               }
        }

    }
}
