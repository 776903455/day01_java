package day14_test1.test9;

public class Person {
    private String name;
    private int blood;

    public Person() {
    }

    public Person(String name, int blood) throws BloodException {
        this.name = name;
        this.blood = blood;
       setBlood(blood);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) throws BloodException {
        this.blood = blood;
        if(blood<0) {
            throw new BloodException("血量不能为负数");
        }
    }
}
