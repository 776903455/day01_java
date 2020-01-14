package day17_test.test11;

import javax.security.sasl.SaslServer;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {

    /*键盘录入一个文件路径，根据文件路径创建File对象
    如果输入的文件路径对应的文件不存在，则创建该文件。
    如果输入的文件路径对应的文件已经存在了，则获得文件大小并输出*/

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件路径格式为d:\\xxx\\xxx");
        String path = scanner.next();
        File file=new File(path);
        if(file.exists()){
            System.out.println("文件大小："+file.length());
        }else {
            file.createNewFile();
            System.out.println("文件创建成功");
        }
    }
}
