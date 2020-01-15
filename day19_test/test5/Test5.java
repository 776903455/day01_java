package day19_test.test5;

import java.io.*;

public class Test5 {

/*现有一字符串：”我爱Java”。
将该字符串保存到当前项目根目录下的a.txt文件中。
要求：使用gbk编码保存。 注意：idea的默认编码是utf-8，
所以可以通过?le->settings->?le encodings设置为gbk格式，
否则打开a.txt文件看 到的将会是乱码。 */

    public static void main(String[] args) throws IOException {
        File file=new File("d:\\test\\g.txt");
        FileOutputStream fos=new FileOutputStream(file);
        OutputStreamWriter ow=new OutputStreamWriter(fos,"GBK");
        ow.write("我爱java");
        ow.flush();
        ow.close();
    }
}
