package day6_test;

public class Worker {

    private  String wId;
    private  String name;
    private int age;

    public Worker(){}
    public Worker(String wId, String name, int age) {
        this.wId = wId;
        this.name = name;
        this.age = age;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("最高年龄worker对象：");

    }
}
