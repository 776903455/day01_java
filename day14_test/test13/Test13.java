package day14_test.test13;

import com.shop.Zhuye;

import java.util.HashMap;
import java.util.Scanner;

public class Test13 {
    /*键盘录入一个字符串,分别统计出其中英文字母、空格、数字和
    其它字符的数量,输出结果:”其他=1, 空格=2, 字母 =12, 数字=6”*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        HashMap<String ,Integer> hashMap=new HashMap<>();
    /*    String eng="[a_zA_Z]";*/
        String number="[0-9]";
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        char[] ch = line.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>'a'&&ch[i]<'z'){
                countingKey(hashMap,"英文");
            }else if(String.valueOf(ch[i]).matches(number)){
                countingKey(hashMap,"数字");
            }else if (String.valueOf(ch[i]).equals(" ")){
                countingKey(hashMap,"空格");
            }else {
                countingKey(hashMap,"其他");
            }

        }
        System.out.println(hashMap);

    }

    public static  void countingKey(HashMap<String,Integer> map,String s){
        Integer value = map.get(s);
        if(value==null){
            map.put(s,1);
        }else {
            map.put(s,value+1);

        }
    }

}
