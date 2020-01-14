package day08_test.test5;

public class Teacher extends  Person {

    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }
    public Teacher(){}


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println(getName()+"讲授了"+subject+"课");
    }
}
