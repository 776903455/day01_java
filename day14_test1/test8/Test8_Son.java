package day14_test1.test8;

import org.junit.Test;

public class Test8_Son extends Father {

 /*   @Test*/
   /*  1. 方法重写，子类只能抛比父类小的异常(父类所抛异常或父类所抛异常的子类)*/
   /* @Override
    public void eat() throws  BigToothPainException{

    }*/

   /* @Override
    public void eat() throws FrontToothPainExcption{

    }*/


    /*   a. 重写方法不能抛出与父类平级的其他异常*/
   /* @Test
    @Override
    public void eat() throws TonguePainException {
        super.eat();
    }*/

/*  b. 重写方法不能抛出比父类高级的异常*/
    /*@Override
    public void eat() throws PainExecption {
        super.eat();
    }*/

    /*c. 重写方法: 可以抛出和父类同样的异常*/
   /* @Override
    public void eat() throws ToothPainException {
        super.eat();
    }*/

   /* d. 重写方法: 可以抛出父类抛出异常的子类异常.*/

   /* @Override
    public void eat() throws BigToothPainException {

    }*/

   /*e. 重写方法: 可以抛出多个 "父类抛出异常的子类异常".*/
    /*@Override
    public void eat() throws BigToothPainException,FrontToothPainExcption {

    }*/

    /* 2.方法重写，父类没有抛异常，子类重写父类方法也不能抛异常?*/
//    a.父类不抛出异常,子类也不能抛出异常


    /*@Override
    public void drunk() throws BigToothPainException{
        super.drunk();
    }*/

    /*b.如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛.*/

//    @Test
//    @Override
//    public void drunk()  {
//        try {
//
//            System.out.println("喝到了100°的水");
//            throw new TonguePainException();
//        }catch (TonguePainException t){
//            t.printStackTrace();
//        }
//    }
}
