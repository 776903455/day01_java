package day16_test.test7;

public class Test7 {
    /*1. 给定一个计算器 Calculator 接口，内含抽象方法 calc(减法)，其功能是可以将两个数字进行相减，并返回差 值。
     */
    public static void main(String[] args) {

        invokeCalc(130,120,(int a,int b)->{

           return a-b;
        });


        invokeCalc(130,120,(a,b)-> a-b);

    }

    public static void invokeCalc(int a,int b,Calcuator calcuator){
        int result=calcuator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
