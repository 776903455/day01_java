package com.shop;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Admin {
    static  Scanner scanner =new Scanner(System.in);
    static Map<String ,Product> map=new HashMap<>();
    public static void adminLogin(){


        System.out.println("请输入管理员账户");
        String adminuser=scanner.next();
        System.out.println("请输入管理员密码");
        String adminpsw=scanner.next();
        if("admin".equals(adminuser)&&"123".equals(adminpsw)){
            adminJM();
        }
    }

    private static void adminJM() {
        System.out.println("1:进入商城");
        System.out.println("2:添加商品");
        System.out.println("3:退出");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                Shopping.showShop();
                break;
            case 2:
                addShops();
                break;
            case 3:
                Zhuye.zhuye();
                break;
        }
    }

    private static void addShops() {
        System.out.println("请选择你要添加的商品类型：");
        System.out.println("1:女装男装");
        System.out.println("2:鞋类箱包");
        System.out.println("3:护肤彩妆");
        System.out.println("4:手机数码");
        System.out.println("5:退出");
        int num1=scanner.nextInt();
        Clothse clothse=null;
        Xie xie=null;
        Cosmetic cosmetic=null;
        Digital digital=null;
        if(num1==1){
            clothse=new Clothse();
            System.out.println("请输入商品名称：");
            String clothseName=scanner.next();
            System.out.println("请输入商品价格：");
            double clothsePrice=scanner.nextDouble();
            clothse.setName(clothseName);
             clothse.setPrice(clothsePrice);
             map.put("女装男装",clothse);
             String path="D:\\shop\\clother.txt";
            System.out.println(map);
            writeShops(map,path);
            map.clear();
            addShops();


        }else if (num1==2){
            System.out.println("请输入商品名称：");
            String xieName=scanner.next();
            System.out.println("请输入商品价格：");
            double xiePrice=scanner.nextDouble();
            xie=new Xie(xieName,xiePrice);
            map.put("鞋类箱包",xie);
            String path="D:\\shop\\xie.txt";
            writeShops(map,path);
            map.clear();
            addShops();


        }else if(num1==3){
            System.out.println("请输入商品名称：");
            String cosmeticName=scanner.next();
            System.out.println("请输入商品价格：");
            double cosmeticPrice=scanner.nextDouble();
            cosmetic=new Cosmetic(cosmeticName,cosmeticPrice);
            map.put("护肤彩妆",cosmetic);
            String path="D:\\shop\\cosmetic.txt";
            writeShops(map,path);
            map.clear();
            addShops();


        }else if(num1==4){
            System.out.println("请输入商品名称：");
            String digitalName=scanner.next();
            System.out.println("请输入商品价格：");
            double digitalPrice=scanner.nextDouble();
            digital=new Digital(digitalName,digitalPrice);
            map.put("手机数码",digital);
            String path="D:\\shop\\digital.txt";
            writeShops(map,path);
            map.clear();
            addShops();

        }else if(num1==5){
            adminJM();
        }
    }


    public static void writeShops(Map<String,Product> mapshop,String path){
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {

            System.out.println("mapshop="+mapshop);
            fos=new FileOutputStream(path,true);
            oos=new ObjectOutputStream(fos);
            oos.writeObject(mapshop);
            oos.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
