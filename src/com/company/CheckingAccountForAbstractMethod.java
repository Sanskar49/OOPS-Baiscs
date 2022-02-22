package com.company;

public class CheckingAccountForAbstractMethod extends Account {


        //Default constructor. When objects are created without any params, default constructor is always called
        // at the beginning.
        public CheckingAccountForAbstractMethod() {
            super();
        }


        public CheckingAccountForAbstractMethod(String name, String dob, String bankName, int accountNumber){
          super(accountNumber);
        }

        //Override annotation because this class extends Account class and it needs to override its
        //abstract methods.
    @Override
    public void deposit(double amount) {
            //If the amount to add would be greater than 0, then only add the amount to the remaining balance.
            if(amount>0){
                balance += amount;
                System.out.println("Current balance is :{} " + balance);
            }
            else {
                System.out.println("Negative or 0 amount cannot be deposited into your account");
            }

    }

    @Override
    public void withdraw(double amount) {
            if(amount>0){
                if(balance<=amount){
                    System.out.println("Remaining balance is less than the amount you want to withdraw.");
                }
                else {
                    balance -= amount;
                    System.out.println("Current balance is :{}" + balance);
                }
            }
            else {
                System.out.println("Negative or 0 amount cannot be withdrawn from your account");
            }
        }

    @Override
    public boolean transfer(double amount) {
        double newBalance = balance - amount;
        if(newBalance > 0) {
            balance = newBalance;
        }
        return newBalance>0;
    }

    @Override
    public void currentBalance(double balance) {
            System.out.println("Your current balance is :{}" +balance);
        }

    @Override
    public void bankStatement(String name, String bankName, double balance){
            System.out.println("Dear " + name + "sir " + "You are getting this message from " + bankName + " And we would like to inform you that you have "+ balance + " remaining in your account");
    }


}
