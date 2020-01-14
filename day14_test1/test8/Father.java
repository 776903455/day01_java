package day14_test1.test8;

public class Father {
    public void eat() throws ToothPainException {
        System.out.println("吃到一块石子");
       throw new ToothPainException("牙疼异常");
    }
    public void drunk()  {
        System.out.println("喝什么都没问题");
    }
}
