package day15_demo.demo5;

public class Demo5 {

    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi("豆沙包",1);
        Customer customer=new Customer(baoZi);
        Product product=new Product(baoZi);
        Thread t1=new Thread(customer);
        Thread t2=new Thread(product);
        t1.start();
        t2.start();

    }
}
