package day14_test.test21;

import java.util.*;

public class Test21 {
    /*有四种水果(苹果，香蕉，西瓜，橘子)
     1. 给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复。
      2. 根据商品号查询对应的商品。 如果查不到输出：
    “查无此商品” 如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”*/
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String[] str={"苹果","香蕉","西瓜","橘子"};
        for (int i = 0; i < str.length; i++) {
                map.put(getrandom(),str[i]);
        }
        System.out.println(map);

        System.out.println("1:根据商品号查询商品：");
        String line = scanner.next();
        if("1".equals(line)){
           over: while (true) {
                System.out.println("请输入商品号：");
                String sph = scanner.next();
                Set<String> key = map.keySet();
                for (String s : key) {
                    if (!sph.equals(s)) {
                        System.out.println("查无此商品");
                        break;
                    } else {
                        System.out.println(map.get(sph));
                        break over;
                    }
                }

            }
        }

    }

    /*产生随机的8位数商品号*/
    public static String getrandom(){
        Random random=new Random();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < 8; i++) {
            int i1 = random.nextInt(10);
            stringBuffer.append(i1);
        }
        return stringBuffer.toString();

    }
}
