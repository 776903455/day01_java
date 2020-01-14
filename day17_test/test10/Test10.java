package day17_test.test10;

public class Test10 {
    /*求整数n的阶乘(n <=10)*/
    public static void main(String[] args) {

        int num=10;
        int chen = getChen(num);
        System.out.println(chen);
    }

    private static int getChen(int num) {
        if(num==1){
            return 1;
        }
        return num*getChen(num-1);
    }
}
