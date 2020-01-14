package day15_demo.demo1;

public class MyThread extends  Thread {

    Ticket ticket=new Ticket();
    private int num=0;

    public  MyThread(Ticket ticket){
        this.ticket=ticket;
    }

    @Override
    public void run() {

        while (true){
            synchronized (ticket){
                if(ticket.getNum()<1){break;}
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket.getNum()+"张票");
                 num = ticket.getNum();
                 ticket.setNum(--num);
            }

        }
    }
}
