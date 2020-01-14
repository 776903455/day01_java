package day05_test;

public class Dog {

    private int age;
    private String name;

    public Dog(){}

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMsg(){
        System.out.println("狗的姓名为："+name+",年龄为"+age);
    }
}
