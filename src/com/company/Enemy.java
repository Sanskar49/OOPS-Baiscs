package com.company;

public class Enemy {
    //If we did not use getters and setters, we could have not accessed health variable in the main.
    private int health;

     int getHealth() {
        return health;
    }
     void setHealth(int x) {
        this.health = x;
    }

    public  void Talk() {
        System.out.println("I am an animal you see");
    }
}
