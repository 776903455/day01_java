package day6_test;

public class Test2 {

    /*1. 创建Random对象
    2. 使用for循环,循环5次
    3. 在for循环中使用Rnadom类的nextInt方法获取大于等于1小于等于10之间的随机整数
    4. 在for循环中输出这个随机数 */
    public static void main(String[] args) {


        int num =0;
        for(int i=0;i<5;i++){
            num =(int)(Math.random()*10)+1;
            System.out.println(num);
        }
    }
}
