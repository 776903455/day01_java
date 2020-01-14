package day03_test.demo;

public class Demo {

    public static void main(String[] args) {

        k:
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if (j==3){
                    System.out.println("j"+j);
                    break k;
//                    return;
                }
            }

            System.out.println("i"+i);
        }
    }
}
