package day04_test;

import java.util.Scanner;

public class Test8 {
    /*温度转换：摄氏度与华氏度的相互转换。 */
    public static void main(String[] args) {

        System.out.println("温度转换：摄氏度与华氏度的相互转换");

        System.out.println("请选择要转换的温度：");
        System.out.println("1:华氏度转摄氏度");
        System.out.println("2:摄氏度转华氏度");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();

        switch (i){
            case 1:
                System.out.println("请输入华氏度：");
               double hua= scanner.nextDouble();
               double wen=(hua-32)/(9.0/5);
                System.out.println("华氏度="+hua+"-"+"摄氏度="+wen);
                break;
            case 2:
                System.out.println("请输入摄氏度：");
                double wen1= scanner.nextDouble();
                double hua1=wen1*(9.0/5)+32;
                System.out.println("摄氏度="+wen1+"-"+"华氏度="+hua1);
                break;
        }

    }
}
