package com.shop;

import demo.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Shopping {
    static Map<String, Product> map = null;
    static Scanner scanner = new Scanner(System.in);
   static ArrayList<Map<String,Product>> arrayList=new ArrayList<>();

    public static void showShop() {

        System.out.println("1：商品分类");
        System.out.println("2：购买商品");
        System.out.println("3：我的商城");
        System.out.println("4：退出");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                shopSort();
                break;
            case 2:
                shopSort();
            case 3:
                ToLogin.login();
                break;
            case 4:
                Zhuye.zhuye();
                break;
        }
    }

    public static void shopSort() {
        System.out.println("1:女装男装");
        System.out.println("2:鞋类箱包");
        System.out.println("3:护肤彩妆");
        System.out.println("4:手机数码");
        System.out.println("5:返回主页");

        int num = scanner.nextInt();
        switch (num) {
            case 1:
                showClothse();
                break;
            case 2:
                showXie();
                break;
            case 3:
                showCosmetic();
                break;
            case 4:
                Digital();
                break;
            case 5:
                showShop();
        }


    }

    public static void showClothse() {
        System.out.println("女装男装:");
        String path = "D:\\shop\\xie.txt";
        arrayList = readProduct(path);
        for(Map<String,Product> maplist:arrayList){
            Set<String> key =maplist.keySet();
            for(String s:key){
                Product p1=maplist.get(s);
                System.out.println(p1.getName()+"-"+p1.getPrice());
            }
        }
        arrayList.clear();
        System.out.println("按1返回");
        int num=scanner.nextInt();
        if(num==1){
            shopSort();
        }
    }

    public static void showXie() {
        System.out.println("鞋类箱包:");
        String path = "D:\\shop\\clother.txt";
        arrayList = readProduct(path);
        System.out.println("list"+arrayList);
        arrayList.clear();
        System.out.println("按1返回");
        int num=scanner.nextInt();
        if(num==1){
            shopSort();
        }
    }

    public static void showCosmetic() {
        System.out.println("护肤彩妆:");
        String path = "D:\\shop\\cosmetic.txt";
        arrayList = readProduct(path);
        System.out.println("list"+arrayList);
        arrayList.clear();
        System.out.println("按1返回");
        int num=scanner.nextInt();
        if(num==1){
            shopSort();
        }
    }

    public static void Digital() {
        System.out.println("手机数码:");
        String path = "D:\\shop\\digital.txt";
        arrayList = readProduct(path);
        System.out.println("list"+arrayList);
        arrayList.clear();
        System.out.println("按1返回");

        int num=scanner.nextInt();
        if(num==1){
            shopSort();
        }
    }

    public static ArrayList<Map<String,Product>> readProduct(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        map=new HashMap<>();
        try {
            fis = new FileInputStream(path);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);
                map=(Map<String, Product>)ois.readObject();
                arrayList.add(map);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return arrayList;
    }

}
