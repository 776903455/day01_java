package day08_test.test6;

public abstract class Animal {
    private int age;
    private String name;
    private String color;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void eat();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
