package day10_test.test2;

public class Teacher {


    private String name;
    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Student dm(Student student){
           return student;
    }
}
