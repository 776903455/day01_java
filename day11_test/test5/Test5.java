package day11_test.test5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    /*代码计算500天后是几几年几月几日*/
    public static void main(String[] args) {

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(Calendar.DATE,500);

        Date time = calendar.getTime();
        String format = sdf.format(time);
        System.out.println(format);

    }
}
