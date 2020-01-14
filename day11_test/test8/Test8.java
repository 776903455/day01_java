package day11_test.test8;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) throws ParseException {
        /*使用SimpleDateFormat类把2016-12-18转换为2016年12月18日*/
        String s="2016-12-18";
      /*  Date date=new Date();*/
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        /* System.out.println(sdf.parse(s));*/
        sdf.applyPattern("2016年12月18日");
        String format = sdf.format(date);
        System.out.println(format);


    }



}
