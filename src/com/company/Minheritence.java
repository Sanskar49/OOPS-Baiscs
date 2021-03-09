package com.company;

interface Animal {
    void eat();
}
interface Travel {
    void travel();
}

public class Minheritence implements Animal,Travel {
    @Override
    public void eat() {
        System.out.println("Animal always eat alot");
    }

    @Override
    public void travel() {
        System.out.println("I like to travel alot");
    }
}
