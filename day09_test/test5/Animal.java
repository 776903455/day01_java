package day09_test.test5;

public abstract class Animal {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal() {
    }

    protected Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void eat();
}
