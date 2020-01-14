package day10_test.test4;

public class Test4 {
    /*模拟工人挑苹果*/
    public static void main(String[] args) {
        Apple a1=new Apple(5,"黄色");
        Apple a2=new Apple(3,"红色");
        Worker worker=new Worker();
        System.out.println("挑选大的：");
         Apple apple1= worker.pickApple(new Compare(),a1,a2);
        System.out.println(apple1.getSize()+"-"+apple1.getColor());


        System.out.println("挑红的：");
        Apple apple=worker.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor())?a1:a2;
            }
        },a1,a2);

        System.out.println(apple.getSize()+"-"+apple.getColor());

    }
}
