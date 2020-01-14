package day05_test;

import java.util.Calendar;

public class Test6 {
    /*定义一个日期MyDate类。*/
    public static void main(String[] args) {


       Calendar calendar= Calendar.getInstance();


       int year=calendar.get(Calendar.YEAR);
       int month=calendar.get(Calendar.MONTH)+1;
       int day=calendar.get(Calendar.DAY_OF_MONTH);


       MyDate myDate =new MyDate(year,month,day);
       myDate.showDate();
       myDate.isBi();
    }
}
