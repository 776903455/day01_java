package day18_test.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class Test12 {
//    请写一个程序判断文件中是否有"lisi"这样的键存在，如果有修改其对应的值为：100


    public static void main(String[] args) throws IOException {

        Properties p=new Properties();
        p.load(new FileInputStream("d:\\test\\score.txt"));
        Set<String> set= p.stringPropertyNames();
        ArrayList<String> arrayList=new ArrayList<>();
        for (String s :set){
            if("lisi".equals(s)){
                String ss=(String) p.setProperty(s,"80");
                p.store(new FileOutputStream("d:\\test\\score.txt"),ss);
                break;
            }
        }

    }
}
