package day05_test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test7 {


    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String date1=sdf.format(date);
        Book b1=new Book("No0003","javaWeb实战","isbn387648797524",58.8,date1);
        Book b2=new Book("No0001","PHP实战","isbn387648797525",48.8,date1);
        Book b3=new Book("No0002","C实战","isbn387648797526",38.8,date1);

        double d=b1.getPrice()>b2.getPrice()?b1.getPrice():b2.getPrice();
        double d1=d>b3.getPrice()?d:b3.getPrice();
        if(d1==b1.getPrice()){
            b1.showBook();
        }else if(d1==b2.getPrice()){
            b2.showBook();
        }else {
            b3.showBook();
        }


    }
}
