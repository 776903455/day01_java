package day03_test;

public class Test6 {
    public static void main(String[] args) {

        int bai,shi,ge;
        for(int i=100;i<1000;i++){
            bai=i/100;
            shi=i%100/10;
            ge=i%10;
            if((bai*bai*bai)+(shi*shi*shi)+(ge*ge*ge)==i){
                System.out.println(i);
            }
        }

    }
}
