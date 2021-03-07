package com.company;

public class Main {

    public static void main(String[] args) {
        Enemy en = new Enemy();
        //Example of Abstraction.
        //You only care about the method being implemented and not really care about the implementation.
        en.Talk();

        Vampire vm = new Vampire();
        Wolf wf = new Wolf();
        //Example of Inheritance
        //You never made a function Talk inside vampire class but you were still able to access the Talk method.
        //Mind you for the example of polymorphism, you might wanna overwrite the Talk method inside the vampire class
        //so it negates what you wrote just above.
        vm.Talk();
        //Polymorphism makes your decision in run time so when you overwrite the function Talk() in its respective classes
        //you get the result

        Enemy[] enemies = {vm,wf};
        enemies[0].Talk();
        enemies[1].Talk();
        //It decides at run time what it needs to print out.
        vm.setHealth(25);
        int a = vm.getHealth();
        System.out.println("After using the getter and setter, my health is "+ a);


    }
}
