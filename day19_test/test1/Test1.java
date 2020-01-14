package day19_test.test1;

import java.io.*;

public class Test1 {
    /*利用高效字节输出流往C盘下的d.txt文件输出一个字节数。 */

    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\test\\1.txt"));
        bos.write(97);
        bos.close();

    }
}
