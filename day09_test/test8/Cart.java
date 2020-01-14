package day09_test.test8;

import java.util.ArrayList;

public class Cart {


    private double sumMoney;
    private double zksumMoney;
    private ArrayList<Product> arrayList =new ArrayList<>();

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public ArrayList<Product> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public Cart(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public Cart() {
    }

    public void addProduct(ArrayList<Product> arrayList){
        System.out.println("=============添加商品==========");
        for(int i=0;i<arrayList.size();i++){
            System.out.println("加入"+arrayList.get(i).getpName()+"成功");
        }
    }

    public void lookProduct(ArrayList<Product> arrayList){
        System.out.println("=============打印商品==========");
        System.out.println("你选购的商品为：");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getpId()+","+arrayList.get(i).getpName()+","+arrayList.get(i).getPrice());
        }
    }


    public void showPrice(ArrayList<Product> arrayList){
        System.out.println("--------------");
        for(int i=0;i<arrayList.size();i++){
            sumMoney+=arrayList.get(i).getPrice();
            if(i<arrayList.size()-1) {
                zksumMoney = zksumMoney + (arrayList.get(i).getPrice() * 0.88);
            }else {
                zksumMoney=zksumMoney+ arrayList.get(i).getPrice();
            }

        }
        System.out.println("原价为："+sumMoney);
        System.out.println("折扣价为："+zksumMoney);
    }
}
