package day19_test.test4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    /*分析以下需求，并用代码实现
        实现一个验证码小程序，要求如下：
        1. 在项目根目录下新建一个文件：data.txt，键盘录入3个字符串验证码，并存入data.txt中，
        要求一个验证码占 一行；
        2. 键盘录入一个需要被校验的验证码，
        如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存 在控制台提示验证失*/

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\test\\data.txt"));
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个验证码：");
        for (int i = 0; i < 3; i++) {
            String next = scanner.next();
            bw.write(next);
            bw.newLine();
            bw.flush();
        }
        System.out.println("请选择操作：");
        System.out.println("1:验证码校验");
        int i = scanner.nextInt();
        if(i==1){
            checkYZM();
        }
        bw.close();

    }

    private static void checkYZM() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\test\\data.txt"));
        ArrayList<String> arrayList=new ArrayList<>();

        String line=null;
        while ((line=br.readLine())!=null){
            arrayList.add(line);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入验证码：");
        String check = scanner.next();

            if(arrayList.contains(check)){
                System.out.println("校验成功");

            }else {
                System.out.println("验证失败");

       }


    }


}
