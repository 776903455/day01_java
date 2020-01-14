package day09_test.test2;

public interface A {
    void showA();
    default  void showB(){
        System.out.println("BBBBBBBB");
    }

}
