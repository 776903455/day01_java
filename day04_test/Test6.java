package day04_test;

public class Test6 {

    /*定义printX方法，打印任意行的图形。 */
    public static void main(String[] args) {
        printX();
    }

    private static void printX() {

        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i==j||(i+j==11)){
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
