package day6_test;

public class Student {

    private String sId;
    private String name;
    private double height;

    public Student(String sId, String name, double height) {
        this.sId = sId;
        this.name = name;
        this.height = height;
    }


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
