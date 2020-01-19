package day20_test.test8.game;

public class Armour {
    private  String name;
    private int portect;

    public Armour(String name, int portect) {
        this.name = name;
        this.portect = portect;
    }

    public Armour() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPortect() {
        return portect;
    }

    public void setPortect(int portect) {
        this.portect = portect;
    }

    @Override
    public String toString() {
        return "Armour{" +
                "name='" + name + '\'' +
                ", portect=" + portect +
                '}';
    }
}
