package day10_demo;

import org.junit.Test;


public class Demo1 {
    public static void main(String[] args) {
        Demo2.Demo3 nbl=new Demo2().new Demo3();
        nbl.jump();
        Demo2 demo2=new Demo2();
        Demo2.Demo3 nbl1=demo2.new Demo3();
       demo2.live=false;
        nbl1.jump();

    }

}
class  Demo2{
   private   String str="我是外部类";
   public  boolean live=true;
        private  void ww(){
            System.out.println("我是外部类");
        }


    class  Demo3{
        public   int num=3;

        public void jump(){
            if(live) {
                System.out.println("心脏在跳动");
                ww();

            }else {
                System.out.println("心脏不跳了");
            }
        }
    }
}