package day12_test.test7;

public class Test7 {
    /*自定义一个泛型接口Inter ,包含show(E e)抽象方法. 使用以下两种方式创建实现类
    1. 定义实现类时确定泛型的类型
    2. 定义实现类时不确定泛型的类型
    然后创建实现类对象并调用show方法*/
    public static void main(String[] args) {
        Imple1 imple1=new Imple1();
  /*      imple1.show(123);*/
        imple1.show("123");
        Imple2<Integer> imple2=new Imple2();
        imple2.show(123);
      /*  imple2.show("123");*/
    }
}
