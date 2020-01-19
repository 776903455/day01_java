package day20_test.test8.shop;

import java.io.Serializable;

public class Cosmetic extends Product implements Serializable {
    public Cosmetic() {
    }

    public Cosmetic(String name, double price) {
        super(name, price);
    }
}
