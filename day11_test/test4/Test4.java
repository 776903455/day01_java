package day11_test.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    /*把你的生日字符串（格式：1992-10-20）转换为对应的日期对象*/
    public static void main(String[] args) throws ParseException {
        String s1="1992-10-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(s1);
        System.out.println(birthdayDate);
    }
}
