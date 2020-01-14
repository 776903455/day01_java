package day03_test;

public class Test3 {
    public static void main(String[] args) {

        int sum=0;
        for(int i=1;i<=100;i++){

            if(i%3==0&&i%5==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("100以内既是3又是5的倍数的数字之和："+sum);
    }
}
