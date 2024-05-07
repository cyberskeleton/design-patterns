package com.customs;

public class Auto {
    int age;
    String model;
    boolean damage;
    int mileage;

    public Auto(int age, boolean damage, int mileage, String model) {
        this.age = age;
        this.damage = damage;
        this.mileage = mileage;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public boolean isDamage() {
        return damage;
    }

    public int getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }
}
