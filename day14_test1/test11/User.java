package day14_test1.test11;

public class User {
    private String name;
    private DebitCard debitCard=new DebitCard();

    public User(String name, DebitCard debitCard) {
        this.name = name;
        this.debitCard = debitCard;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DebitCard borrowBooks(DebitCard debitCard,double userMoney) throws MoneyException {
        debitCard.setMoney(debitCard.getMoney()-userMoney);
        return debitCard;
    }
}
