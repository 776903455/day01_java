package day05_test;

import java.util.Date;

public class Book {

    private String bId;
    private String name;
    private String isbn;
    private Double price;
    private String showDate;

    public Book(){}

    public Book(String bId, String name, String isbn, Double price, String showDate) {
        this.bId = bId;
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.showDate = showDate;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void showBook(){
        System.out.println("最贵的书是"+bId+","+name+","+isbn+","+price+","+showDate);
    }
}
