package com.company;

public class Actor extends Person {
    public Actor(String name, String color, int number_of_eyes, int deubt_year) {
        this.name = name;
        this.color = color;
        this.number_of_eyes = number_of_eyes;
        this.debut_year = deubt_year;

    }

    public String toString() {
        return "The person " + name + " is an Actor. He is " + color + " in color, has " + number_of_eyes + " eyes and debut in " + debut_year;
    }

}
