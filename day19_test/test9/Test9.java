package day19_test.test9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws FileNotFoundException {
      /*从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String next = scanner.next();
        PrintStream ps=new PrintStream("d.txt");
        System.setOut(ps);
        System.out.println(next);


    }
}
