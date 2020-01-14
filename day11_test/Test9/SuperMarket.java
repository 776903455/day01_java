package day11_test.Test9;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
    public static void buyProduct(ArrayList<Product> products){
        ArrayList<String> buyerArrayList=new ArrayList<>();
        String s1="p00[0-9][-][0-9]{0,3}";
        System.out.println("-------------------------------");
        System.out.println("            商品列表");
        System.out.println("商品id\t\t\t名称\t\t\t\t单价\t\t\t计价单位");
        for(Product pros:products){
            System.out.println(pros.getPid()+"\t\t\t"+pros.getPname()+"\t\t\t"+pros.getPrice()+"\t\t\t"+pros.getUnits());
        }
        System.out.println("------------------------------");
        System.out.println("请输入你要购买的商品项（输入格式为：商品id-购买数量），输入end表示结束");
        Scanner scanner =new Scanner(System.in);

        while(true){
            String buyPros=scanner.next();
            if("end".equals(buyPros)){
                break;
            }else  if (!buyPros.matches(s1))
            {
                System.out.println("你输入的姿势不对，请换个姿势再继续。。。");

            }else if ((int)buyPros.charAt(3)<49||(int)buyPros.charAt(3)>52){
                System.out.println("你输入的商品id不存在，请重新输入");
            }else {
                buyerArrayList.add(buyPros);
            }


        }

        for (int i = 0; i <buyerArrayList.size() ; i++) {
            String[] str =buyerArrayList.get(i).split("-");

            for (int j = 0; j <products.size() ; j++) {
                if(str[0].equals(products.get(j).getPid())){

                    products.get(j).setNumber(Integer.parseInt(str[1]));
//                    products=new ArrayList<Product>();
//                    products.get(j).setNumber(Integer.parseInt(str[1]));
                    Buyer.addProduct(products.get(j));

                }
            }
        }


        Demo1.JM();

    }

    public static void printReceipt(){
        int number=0;
        double sumPrice=0;
        ArrayList<Product> products=new ArrayList<>();

        System.out.println("欢迎光临");
        if(Buyer.getProductArrayList().size()==0){
            System.out.println("请先购买商品");
            Demo1.JM();
        }

        System.out.println("名称\t\t\t\t售价\t\t\t\t数量\t\t\t\t金额");
            for (int i = 0; i < Buyer.getProductArrayList().size() ; i++) {
                /* for (int j = 1; j < Buyer.getProductArrayList().size()-i; j++) {
                    *//*System.out.println(Buyer.getProductArrayList().get(0)+"--"+Buyer.getProductArrayList().get(1));*//*
                    if(Buyer.getProductArrayList().get(i).getPname().equals(Buyer.getProductArrayList().get(j).getPname())){
                        System.out.println((Buyer.getProductArrayList().get(i).getNumber()+"---"+Buyer.getProductArrayList().get(j).getNumber()));
                        Buyer.getProductArrayList().get(i).setNumber(Buyer.getProductArrayList().get(i).getNumber()+Buyer.getProductArrayList().get(j).getNumber());
                        products.add(Buyer.getProductArrayList().get(i));
                        Buyer.getProductArrayList().remove(i);
                        i--;
                    }else {
                        products.add(Buyer.getProductArrayList().get(i));
                    }
                    System.out.println("pro="+products);
                    }
                    */
                    System.out.println(Buyer.getProductArrayList().get(i).getPname() + "\t\t\t" +
                            Buyer.getProductArrayList().get(i).getPrice() + "\t\t\t" +
                            Buyer.getProductArrayList().get(i).getNumber() + "\t\t\t\t" +
                            (Buyer.getProductArrayList().get(i).getNumber() * Buyer.getProductArrayList().get(i).getPrice()));
                    number += Buyer.getProductArrayList().get(i).getNumber();
                    sumPrice += (Buyer.getProductArrayList().get(i).getNumber() * Buyer.getProductArrayList().get(i).getPrice());

            }

     /*   for (int i = 0; i <products.size() ; i++) {
            System.out.println(products.get(i).getPname() + "\t\t\t" +
                    products.get(i).getPrice() + "\t\t\t" +
                    products.get(i).getNumber() + "\t\t\t\t" +
                    (products.get(i).getNumber() * products.get(i).getPrice()));
            number += products.get(i).getNumber();
            sumPrice += (products.get(i).getNumber() * products.get(i).getPrice());
        }*/

        System.out.println("-----------------------------");
        System.out.println( Buyer.getProductArrayList().size()+"项商品");
        System.out.println( "共计:"+number+"件");
        System.out.println( "总价:"+sumPrice);
        Demo1.JM();
    }
}
