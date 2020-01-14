package day14_test1.test10;

import java.util.Scanner;

public class Test10 {
    /*1.写一个方法实现用户登陆，传入用户名和密码
    2.如果用户名错误，就抛出自定义登陆异常(LoginException)，异常信息为用户名不存在。
    3.如果密码错了就也抛出登陆异常,异常信息为密码错误
     4.如果用户名和密码都对了,输出: 欢迎xxx 说明：正确用户名和密码都是admin */
    public static void main(String[] args) throws LoginException {
        login();
    }

    public static void login() throws LoginException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        if("admin".equals(username)){
            System.out.println("请输入密码：");
            String psw=scanner.next();
            if("admin".equals(psw)){
                System.out.println("欢迎"+username);
            }else {
                throw new LoginException("密码错误");
            }

        }else {
            throw new LoginException("用户名不存在");
        }
    }
}
