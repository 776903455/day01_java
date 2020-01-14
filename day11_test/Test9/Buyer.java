package day11_test.Test9;

import java.util.ArrayList;

public class Buyer {

    private static ArrayList<Product> productArrayList=new ArrayList<Product>();

    public static void addProduct(Product product){

        productArrayList.add(product);

    }

    public static ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public static void setProductArrayList(ArrayList<Product> productArrayList) {
        Buyer.productArrayList = productArrayList;
    }


}
