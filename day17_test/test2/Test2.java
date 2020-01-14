package day17_test.test2;

import java.io.File;
import java.io.IOException;

public class Test2 {
    /*
    * 1. 使用绝对路径创建对象关联到c盘的a.txt。
    *
    * 2. 通过文件对象方法判断文件是否存在。
    * 3. 不存在则调用创建文件的方法创建文件
    * */

    public static void main(String[] args) throws IOException {

        File file=new File("d:\\a.txt");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }
    }
}
