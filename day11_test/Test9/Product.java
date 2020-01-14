package day11_test.Test9;

public class Product {
    private String pid;
    private String pname;
    private Double price;
    private String units;
    private  Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Product(String pid, String pname, double price, String units) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.units = units;
    }

    public Product() {
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", units='" + units + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
