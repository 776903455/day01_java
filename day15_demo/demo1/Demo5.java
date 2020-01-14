package day15_demo.demo1;

public class Demo5 {
    public static void main(String[] args) {

        Ticket ticket=new Ticket("GT9527",100);
        MyThread myThread=new MyThread(ticket);
        MyThread myThread2=new MyThread(ticket);
        myThread.setName("广州南");
        myThread2.setName("中山北");
        myThread.start();
        myThread2.start();
    }
}
