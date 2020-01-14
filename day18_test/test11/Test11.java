package day18_test.test11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {

    /*在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
        定义一个方法统计test.txt文件中指定字符出现的次数。
    比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次*/
    public static void main(String[] args) throws IOException {

        char ch='5';
        printNum(ch);
    }

    private static void printNum(char ch) throws IOException {
        FileInputStream fis=new FileInputStream("d:\\test\\test.txt");
        int nmnber=0;
        int len=0;

        while ((len=fis.read())!=-1){
          //  System.out.print((char)len);
            if((char)len==ch){

                nmnber++;
            }

        }

        System.out.println("a出现的次数："+nmnber);

    }

}
