package day03_test;


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score=scanner.nextInt();
        if(score<0||score>100){
            System.out.println("你输入的成绩有误");
        }else if(score<60){
            System.out.println("不及格");
        }else if(score>=60&&score<70){
            System.out.println("及格");
        }else if(score>=70&&score<80){
            System.out.println("良");
        }else  if(score>=80&&score<90){
            System.out.println("好");
        }else{
            System.out.println("优秀");
        }


    }
}
