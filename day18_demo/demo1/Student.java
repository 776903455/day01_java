package day18_demo.demo1;

public class Student {
    private String name;
    private Integer age;

    public Student(String name) {
        this.name = name;
    }
    private Student(String name,Integer num) {
        this.name = name;
        this.age=num;
    }

   /* public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public Student() {
    }

    public void eat(){
        System.out.println("eat");
    }

    public void eat(int a){
        System.out.println("eat"+a);
    }

    protected  void play(){
        System.out.println("play");
    }

    void look(){}

    private void run(){}

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
}
