package day21_test.test9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test9 {

    /*有一个用于记录程序运行次数的属性文件，运行次数保存在一个count属性中，当到达指定次数3次时，则提示:"程序使 用次数已满，
    请续费"*/

    private static  Properties properties=new Properties();
    public static void main(String[] args) throws IOException {

        game();
    }

    public static void game() throws IOException {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(100)+1;

        FileInputStream fis=new FileInputStream("D:\\java_space\\day01_java\\src\\day21_test\\test9\\game.properties");
        properties.load(fis);
        Set<String> key = properties.stringPropertyNames();
        for (String s:key){
         if("count".equals(s)){
             String count = properties.getProperty("count");
             if("null".equals(count)) {
                savecount(s,"0");
                 break;
             }
         }
        }

        int count=Integer.valueOf(properties.getProperty("count"));
        System.out.println("-------------猜数小游戏--------------");
        System.out.println("请输入你要猜的数：");
        while (true){

            int num1 = scanner.nextInt();
            if(num>num1){
                System.out.println("你猜的数太小了");
           /*  count++;
                savecount("count",String.valueOf(count));*/
                continue;
            }else if(num<num1){
                System.out.println("你猜的数太大了");
               /* System.out.println("你猜的数太小了，你还有"+(3-count)+"次机会");
                count++;*/
                continue;
            }else{
                count++;
                savecount("count",String.valueOf(count));
                System.out.println("恭喜你，才对了,你还有"+(3-count)+"次试玩机会");
                System.out.println("是否继续：yes/no");
                String next = scanner.next();
                if("yes".equals(next)){
                    if(count>=3){
                        System.out.println("游戏结束，请充值");
                        break;
                    }
                    num=random.nextInt(100)+1;
                    System.out.println("请输入你要猜的数：");
                    continue;
                }else {

                    System.out.println("游戏结束");
                    break;
                }
            }
        }

    }


    public static  void savecount(String key,String value) throws IOException {
        String str =(String) properties.setProperty(key, value);
        properties.store(new FileOutputStream("D:\\java_space\\day01_java\\src\\day21_test\\test9\\game.properties"), str);

    }

}
