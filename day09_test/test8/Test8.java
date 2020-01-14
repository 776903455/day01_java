package day09_test.test8;

import java.util.ArrayList;

public class Test8 {
    /*模拟各种商品添加到购物车，电子商品打8.8折优惠，展示所有商品信息。 */

    public static void main(String[] args) {
        Cart cart =new Cart();
        Product bjb=new Electronic("g10000","笔记本",10000);
        Product sj=new Electronic("g10001","手机",5000);
        Product pg=new Fruit("g20000","苹果",50);
        cart.getArrayList().add(bjb);
        cart.getArrayList().add(sj);
        cart.getArrayList().add(pg);
        cart.addProduct(cart.getArrayList());
        cart.lookProduct(cart.getArrayList());
        cart.showPrice(cart.getArrayList());



    }

}
