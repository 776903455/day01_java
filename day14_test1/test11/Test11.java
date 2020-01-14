package day14_test1.test11;

import java.util.Scanner;

public class Test11 {

    /*请使用代码描述:
     每一张借记卡(DebitCard)都有账号(accountNumber)和余额(money);
     余额永远不能为负数
    要求：当借记卡的余额为负数的时候需要抛出自定的异常 */
    public static void main(String[] args) throws MoneyException {
        DebitCard user1DebitCard=new DebitCard("10086",100);
        User user1=new User("lyh",user1DebitCard);
        Scanner scanner=new Scanner(System.in);


        while (true) {
            System.out.println("1:借书");
            System.out.println("2:退出");
            String next = scanner.next();
            switch (next) {
                case "1":

                    DebitCard debitCard = user1.borrowBooks(user1DebitCard, 20);
                    System.out.println(user1.getName()+"你的余额还剩"+debitCard.getMoney()+"元");
                    if(debitCard.getMoney()<0){break;}
                case "2":
                    break;

            }

        }

       /* if(next.equals("1")) {
          over : while (true);
            {
                DebitCard debitCard = user1.borrowBooks(user1DebitCard, 20);
                if(debitCard.getMoney()<0){}
            }
        }*/
    }
}
