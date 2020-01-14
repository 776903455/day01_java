package day18_test.test9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test9 {

    /*从控制台循环接收用户录入的学生信息，
    输入格式为：学号-学生名字 将学生信息保存到C盘下面的stu.txt文件中，
    一个学生信息占据一行数据。当用户输入end时停止输入。 * 要求使用字节输出流写出数据*/

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生信息,格式为：学号-学生名字");
        FileOutputStream fos=new FileOutputStream("d:\\test\\stu.txt",true);
        while (true){
           String student =scanner.next();
           if("end".equals(student)){
               System.out.println("录入学生信息成功");
               break;
           }else {
                fos.write(student.getBytes());
                fos.write("\r\n".getBytes());
           }
        }

        fos.close();
    }
}
