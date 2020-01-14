package day10_test.test2;

public class Student {

    private String name;
    private String status;

    public Student(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
