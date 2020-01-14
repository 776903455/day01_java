package day18_test.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test12 {
//    请写一个程序判断文件中是否有"lisi"这样的键存在，如果有修改其对应的值为：100


    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("d:\\test\\score.txt");
        properties.load(fis);
        String lisi = properties.getProperty("lisi");
        if(lisi!=null) {
            String lisi1 = (String) properties.setProperty("lisi", "100");
            properties.store(new FileOutputStream("d:\\test\\score.txt"), lisi1);
        }

    }
}
