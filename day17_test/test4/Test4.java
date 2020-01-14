package day17_test.test4;

import java.io.File;

public class Test4 {

    /*在C盘下创建一个名为ccc的文件夹，要求如下：
     1.ccc文件夹中要求包含bbb子文件夹
        2.bbb子文件夹要求包含aaa文件夹 */

    public static void main(String[] args) {

        File file=new File("d:\\ccc\\bbb\\aaa");
        boolean mkdirs = file.mkdirs();
        if (mkdirs==true){
            System.out.println("创建成功");
        }else {
            System.out.println("文件已存在");
        }
    }
}
