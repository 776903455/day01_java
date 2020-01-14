package day17_test.test3;

import java.io.File;

public class Test3 {
    /*
    * 1. 创建文件对象指定路径为c:/bbb
    * 2. 调用文件对象创建文件夹的方法*/

    public static void main(String[] args) {
        File file=new File("c:\\bbb");
        boolean mkdir = file.mkdir();
        if (mkdir==true){
            System.out.println("创建成功");
        }else {
            System.out.println("文件已存在");
        }
    }
}
