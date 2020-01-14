package day10_demo;


public class Demo3 {

    public static void main(String[] args) {
        Person person= new Person();
        person.tes1();
    }
}
class  Person{
    private int age;
    private String name="lyh";
    public  void tes1(){

        class  Student{
            public  void fun1(){
                System.out.println("我是局部内部类"+name);
            }
        }

        Student student=new Student();
        student.fun1();

    }




}