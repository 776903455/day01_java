package day11_test.Test9;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        JM();
    }

    public static void JM(){
        ArrayList<Product> productArrayList=new ArrayList<>();
        Product product=new Product("p001","少林核桃",15.5,"斤");
        Product product1=new Product("p002","尚康饼干",14.5,"包");
        Product product2=new Product("p003","移动硬盘",345.0,"个");
        Product product3=new Product("p004","高清无码",199.0,"G");
        productArrayList.add(product);
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        Scanner scanner=new Scanner(System.in);
        System.out.println("---------------欢迎使用超市购物系统---------------");
        System.out.println("1:购买商品");
        System.out.println("2：打印小票");
        System.out.println("3：退出系统");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                SuperMarket.buyProduct(productArrayList);
                break;
            case 2:
                SuperMarket.printReceipt();
            case 3:
                System.out.println("感谢你使用超市购物系统，欢迎下次光临");
                System.exit(0);
                break;
        }
    }
}
