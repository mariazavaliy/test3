package com.company;

public abstract class Car {
    public String model;
    public String color;
    public int speed;

    public void gas (int addSpeed) {
        System.out.println("gas " + addSpeed );
    }
    public void brake (int tormoz) {
        System.out.println("brake " + tormoz );
    }
    public abstract void description ();
}
