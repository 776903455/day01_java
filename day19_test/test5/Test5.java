package day19_test.test5;

import java.io.*;

public class Test5 {

/*����һ�ַ��������Ұ�Java����
�����ַ������浽��ǰ��Ŀ��Ŀ¼�µ�a.txt�ļ��С�
Ҫ��ʹ��gbk���뱣�档 ע�⣺idea��Ĭ�ϱ�����utf-8��
���Կ���ͨ��?le->settings->?le encodings����Ϊgbk��ʽ��
�����a.txt�ļ��� ���Ľ��������롣 */

    public static void main(String[] args) throws IOException {
        File file=new File("d:\\test\\g.txt");
        FileOutputStream fos=new FileOutputStream(file);
        OutputStreamWriter ow=new OutputStreamWriter(fos,"GBK");
        ow.write("�Ұ�java");
        ow.flush();
        ow.close();
    }
}
