package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Login {
    public static void login(String username, String password) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Properties properties =new Properties();
        properties.load(new FileReader(new File("d:\\新建文件夹\\regist.txt")));
        String value=properties.getProperty(username);
        System.out.println(value);
        if (properties.getProperty(username)!=null && value.equalsIgnoreCase(password)) {
            System.out.println("欢迎回来：" + username + ",请选择你要进行的操作");
            System.out.println("1:玩猜数小游戏");
            System.out.println("2:");
            System.out.println("5:退出");
            int num3 = scanner.nextInt();
            if (num3 == 1) {
               Play.guessGame();
            }else if(num3==2){

            }
            else if(num3==5){
                System.exit(0);
            }
        }else{
            System.out.println("用户名或密码错误");
            Demo2.zy();
        }

    }
}
