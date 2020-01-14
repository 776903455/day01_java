package day11_test.test6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    /*使用代码计算你活了多少天*/
    public static void main(String[] args) throws ParseException {
        /*获取从1970到出生日期的好陌生*/
        String birthday="1996-9-10";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);
        long bm=birthdayDate.getTime();
        /*获取从1970到当前时间的毫秒数*/
        long nm=new Date().getTime();

        /*获取你活了多久的毫秒数*/
        long live=nm-bm;

        long life=live/1000/3600/24;
        System.out.println("你活了"+life+"天");
    }
}
