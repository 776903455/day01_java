import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();



    }
}
