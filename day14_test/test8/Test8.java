package day14_test.test8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
    /*使用键盘录入5个学生信息,录入格式为:”姓名,年龄”.
    将这5个学生信息存入Map集合中,key是姓名,value是年龄 */

    public static void main(String[] args) {
        HashMap<String ,Integer> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int i=1;
        while (true){
            if(i>5){break;}
            System.out.println("请输入第"+i+"个学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入第"+i+"个学生的年龄：");
            Integer age = scanner.nextInt();
            hashMap.put(name,age);
            i++;

        }

        System.out.println("姓名\t\t"+"年龄");
        Set<String> strings = hashMap.keySet();
        for(String s:strings){
            Integer value=hashMap.get(s);
            System.out.println(s+"\t\t"+value);
        }
    }
}
