package demo;

import java.util.Random;
import java.util.Scanner;

public class Play {
    public  static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sj = random.nextInt(100);
        int count = 5;
        System.out.println("请输入你要猜的数");
        while (true) {
            int cai = scanner.nextInt();

            if (cai > sj) {
                System.out.println("你猜的数太大了,你还有" + count + "次机会");
            } else if (cai < sj) {
                System.out.println("你猜的数太小了,你还有" + count + "次机会");
            } else {
                System.out.println("恭喜你，猜对了,是否继续玩y/n");
                String continu=scanner.next();
                if("y".equalsIgnoreCase(continu)){
                    guessGame();
                }else {
                    break;
                }
            }


            if (count == 0) {
                break;
            }
            count--;
        }

    }
}
