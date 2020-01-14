package day05_test;

public class Teacher {

    private int age;
    private String name;
    private String content;

    public Teacher(){}


    public Teacher(int age, String name, String content) {
        this.age = age;
        this.name = name;
        this.content = content;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭");
    }

    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋讲着"+content+"知识。。。");
    }
}
