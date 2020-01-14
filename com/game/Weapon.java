package com.game;

public class Weapon {
    private String name;
    private int weaponHurt;

    public Weapon() {
    }

    public Weapon(String name, int weaponHurt) {
        this.name = name;
        this.weaponHurt = weaponHurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeaponHurt() {
        return weaponHurt;
    }

    public void setWeaponHurt(int weaponHurt) {
        this.weaponHurt = weaponHurt;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weaponHurt=" + weaponHurt +
                '}';
    }
}
