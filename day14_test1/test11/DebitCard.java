package day14_test1.test11;

import day09_test.test7.Money;

public class DebitCard {
    private String id;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String id, double money) {
        this.id = id;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) throws MoneyException {
        this.money = money;
        if(money<0){
            throw  new MoneyException("你的余额不足");
        }
    }


}
