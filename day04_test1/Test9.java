package day04_test1;

public class Test9 {

    /*打印一副扑克牌*/
    public static void main(String[] args) {

        String[] str={"♠","♥","♣","♦"};
        String[] str1={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str1.length;j++){
                System.out.print(str[i]+str1[j]);
            }
            System.out.println();
        }
    }
}
