package com.shop;

import java.io.Serializable;

public class Xie extends Product implements Serializable {
    public Xie() {
    }

    public Xie(String name, double price) {
        super(name, price);
    }
}
