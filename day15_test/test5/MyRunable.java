package day15_test.test5;

public class MyRunable implements Runnable {
    private String name;

    public MyRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
       Thread.currentThread().setName(name);
        System.out.println("0101,我是"+Thread.currentThread().getName()+"号，准备过洞");

    }
}
