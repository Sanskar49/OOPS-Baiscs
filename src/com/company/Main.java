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

        DummyClass obj = new DummyClass();
        DummyClass obj1 = new DummyClass();
        obj.setValues(2,5);
        obj1.setValues(3,6);
        obj.Area();
        obj1.Area();
        //Not created any object of SomStatic but still able to access its properties because of static keywords.
        SomStatic.Tell();
        System.out.println("The count is so " + SomStatic.count);
        classA superobj = new classA();

        superobj.showij();
        classB subobj = new classB();
        subobj.sum();
        Actor ac1 = new Actor("Amitabh", "Brown" , 2 , 1965);
        String ans = ac1.toString();
        System.out.println(ans);
        //This is for implementing one interface but have to define methods of another interface which the first one had extended.
        subobj.meth1();
        subobj.meth3();
        //One class is implementing two interfaces which could work like multiple inheritance.
        Minheritence m = new Minheritence();
        m.eat();
        m.travel();

        Account first = new Account("Sujal","10/22/1999","SBI",22005237) {
            @Override
            public void deposit(double amount) {

            }

            @Override
            public void withdraw(double amount) {

            }

            @Override
            public boolean transfer(double amount) {
                return false;
            }

            @Override
            public void currentBalance(double balance) {

            }

            @Override
            public void bankStatement(String name, String bankName, double balance) {

            }
        };

        Account second = new Account("Rashi","19/1/1997","ICICI",22006247) {
            @Override
            public void deposit(double amount) {

            }

            @Override
            public void withdraw(double amount) {

            }

            @Override
            public boolean transfer(double amount) {
                return false;
            }

            @Override
            public void currentBalance(double balance) {

            }

            @Override
            public void bankStatement(String name, String bankName, double balance) {

            }
        };
        //depositing money on account of Sujal
        first.deposit(500);

        //depositing money on acoount of Rasi
        second.deposit(200);

        double transferAmount = 200;

        //transfer part of the money from the account of Sujal to the account of Rashi
        boolean result = first.transfer(transferAmount);
        if(result) {
            second.deposit(transferAmount);
        }
        //withdraw part of the received money from the account of Rashi
        second.withdraw(transferAmount);

        //print bank statement of Sujal's account
        first.bankStatement("Sujal","SBI",300);

        //current Balance of Rashi's bank account.
        second.currentBalance(200);






    }
}
