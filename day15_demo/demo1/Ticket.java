package day15_demo.demo1;


public class Ticket {
    private   String name;
    private   int num;

    public Ticket() {
    }

    public Ticket(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
