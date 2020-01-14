package day14_test.test17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test17 {
    /*使用键盘循环录入：书名,价格 创建一个Map集合，key存储书名，value存储书的价格.
    录入以下5本书数据: {Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2}
     要求：
        1. 删除集合中的C++这本书
        2. Java的这本书涨价为38.5元
        3. 使用keySet和entrySet两种不同方式对集合遍历输出*/
    public static void main(String[] args) {
        HashMap<String ,Double> hashMap=new HashMap<>();



        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"本书的的名称和价格");
            String line = scanner.next();
            String[] split = line.split("=");
            hashMap.put(split[0],Double.parseDouble(split[1]));
        }

        hashMap.remove("C++");
        hashMap.put("Java",38.5);

        Set<String> key = hashMap.keySet();
        for(String s:key){
            Double value = hashMap.get(s);
            System.out.println(s+"-"+value);
        }


        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for (Map.Entry<String,Double> map:entries){
            System.out.println(map);
        }


    }
}
