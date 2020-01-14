package day05_test;

public class Student {

    private  int age;
    private String name;
    private String content;

    public  Student(){}
    public Student(int age, String name, String content) {
        this.age = age;
        this.name = name;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭");
    }
    public void study(){
        System.out.println("年龄为"+age+"的"+name+"正在专心致志听着"+content+"知识。。。");
    }
}
