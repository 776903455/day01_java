package day14_test.test15;

import java.util.HashMap;
import java.util.Scanner;

public class Test15 {
    /*键盘录入语句英语,统计每个单词出现的次数。
    1. 录入格式如：If you wantto change your fate I think you must come to the dark horse to learnjava (用空 格间隔)
    2. 打印格式如：

    to=3
    think=1
    you=2
     …
  */
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一句英文");
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        for (int i = 0; i < s.length; i++) {
            Integer value = map.get(s[i]);
            if(value==null){
                map.put(s[i],1);
            }else {
                map.put(s[i],value+1);
            }
        }
        System.out.println(map);
    }
}
