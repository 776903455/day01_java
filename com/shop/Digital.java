package com.shop;

import java.io.Serializable;

public class Digital extends Product implements Serializable {
    public Digital() {
    }

    public Digital(String name, double price) {
        super(name, price);
    }
}
