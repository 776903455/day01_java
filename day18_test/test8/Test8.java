package day18_test.test8;

import java.io.*;
import java.util.Scanner;

public class Test8 {

    /*请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
    可以输入多条信息，每条信息存储一行。当用户输 入：”886”时，程序结束。 */
    public static void main(String[] args) throws IOException {
       Scanner scanner=new Scanner(System.in);
        System.out.println("请输入信息");
       FileWriter fw=new FileWriter("d:\\test\\Info.txt",true);
        while (true){
            String next = scanner.next();
            if(next.equals("886"))
            {
                break;
            }else {
                fw.write(next);
                fw.write("\r\n");
                fw.flush();


            }

        }

        fw.close();


    }
}
