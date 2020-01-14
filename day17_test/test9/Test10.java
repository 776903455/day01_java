package day17_test.test9;

public class Test10 {

    /*求1到n的和(n>=100 &&n<=200)*/
    public static void main(String[] args) {
        int num=100;
        int getsum = getsum(num);
        System.out.println(getsum);

}

    private static int getsum(int num) {

        if(num==200){
            return 200;
        }
        return num+getsum(num+1);
    }
}
