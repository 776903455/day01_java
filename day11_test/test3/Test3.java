package day11_test.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
/*឴获取当前的日期，并把这个日期转换为指定格式的字符串 如：2088-08-08 08:08:08 */
public static void main(String[] args) {

    Date date=new Date();
    System.out.println(date);
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    String date1 = sdf.format(date);
    System.out.println(date1);
}
}
