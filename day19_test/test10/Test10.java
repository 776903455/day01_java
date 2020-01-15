package day19_test.test10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test10 {

    /*项目根路径下有text.txt文件，内容如下：

     我爱小米科技

     123456 利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
      123456

     我爱小米科技*/

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\test\\test.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\test\\test1.txt"));
        ArrayList<String> arrayList =new ArrayList<>();
        String line=null;
        while ((line=br.readLine())!=null){
            arrayList.add(line);
        }

        Collections.reverse(arrayList);
        for(String s:arrayList){
            System.out.println(s);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();

    }
}
