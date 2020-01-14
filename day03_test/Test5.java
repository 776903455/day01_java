package day03_test;

public class Test5 {

    public static void main(String[] args) {

        for(int i=1;i<=15;i++){
            if(i%3!=0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}
