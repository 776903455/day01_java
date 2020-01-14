package day14_test.test11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test11 {
    /*利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
    如用户输入字符串:"helloworld java",
    程序输出结果：h(1)e(1)l(3)o(2)w(1)r(1)d(1)j(1)a(2)v(1)
    注：输出结果不要求顺序一致 */

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        HashMap<Character,Integer> hashMap=new HashMap<>();
        System.out.println("请输入一个字符串:");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer value = hashMap.get(chars[i]);

            if(value==null){
                hashMap.put(chars[i],1);
            }
            else {
                hashMap.put(chars[i],value+1);
            }

        }
        hashMap.remove(' ');

      /*  System.out.println(hashMap);*/
        StringBuffer stringBuffer=new StringBuffer();
        Set<Character> keySet = hashMap.keySet();
        for (Character c:keySet){
            Integer value=hashMap.get(c);
            stringBuffer= stringBuffer.append(c).append("(").append(value).append(")");

        }
        System.out.print(stringBuffer);
    }
}
