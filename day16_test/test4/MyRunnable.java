package day16_test.test4;

public class MyRunnable implements Runnable {
    private  int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public MyRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        int sum=1;
        for (int i = 1; i <=n; i++) {
            sum*=i;
        }
        System.out.println(Thread.currentThread()+","+n+"的阶乘"+sum);
    }
}
