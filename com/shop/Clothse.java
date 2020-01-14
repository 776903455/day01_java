package com.shop;

import java.io.Serializable;

public class Clothse extends Product  implements Serializable {
    public Clothse() {
    }

    public Clothse(String name, double price) {
        super(name, price);
    }

}
