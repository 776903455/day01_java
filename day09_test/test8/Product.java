package day09_test.test8;

public class Product {
    private  String pId;
    private String pName;
    private double price;

    public Product() {
    }

    public Product(String pId, String pName, double price) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                '}';
    }
}
