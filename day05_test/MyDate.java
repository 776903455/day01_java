package day05_test;

public class MyDate {
    private  int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void  showDate(){
        System.out.println("现在日期"+year+"年"+month+"月"+day+"日");
    }

    public void isBi(){

        /*int ge =year%10;
        int shi=year%1000%100/10;*/

        /*实际年判断是否为闰年*/
        if(year%100==0&&year%400==0){
            System.out.println(year+"是闰年");
        }else if(year%100!=0&&year%4==0){
            /*普通年判断是否为闰年*/
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }



    }
}
