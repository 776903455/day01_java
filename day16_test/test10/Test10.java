package day16_test.test10;

public class Test10 {
    /*1. 使用等待唤醒,实现一个线程给共享对象Person的属性(姓名,性别)赋值,
    一个线程打印共享对象的属性要求赋值>打印->赋值->打印 ... 不允许出现人妖. */
    public static void main(String[] args) {
        Shows shows=new Shows();
        new Thread(){
            @Override
            public void run(){
                try {
                    shows.setPerson();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                try {
                    shows.getPerson();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


}

class Shows{
    Person person=new Person();
    boolean flag=true;
    private static Object obj=new Object();
    public  void setPerson() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (obj){
                while (flag!=true){
                    obj.wait();
                }
                Thread.sleep(20);
                System.out.println("赋值：");
                person.setName("孙悟空"+i+"号");
                person.setSex("男");
                flag=false;
                obj.notify();
            }
        }
    }

    public void getPerson() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (obj){
                while (flag!=false){
                    obj.wait();
                }
                Thread.sleep(20);
                System.out.println("打印："+person.getName()+"-"+person.getSex());
                flag=true;
                obj.notify();
            }
        }
    }

}
