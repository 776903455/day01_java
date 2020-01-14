package day08_test.test4;

public class  C extends B {
    public int numc=30;

    @Override
    void showB() {
        System.out.println("B中的numb："+numb);
    }
    @Override
    void showA() {
        System.out.println("A中的numa："+numa);
    }

    public void showC(){
        System.out.println("C中的numc:"+numc);
    }
}
