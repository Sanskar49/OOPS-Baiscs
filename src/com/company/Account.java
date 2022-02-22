package com.company;

public abstract class Account {

    //name of the Account Holder
    private String name;

    //DOB of the Account Holder
    private String dob;

    //Name of the bank
    private String bankName;

    //Account No. of the personnel
    private int accountNumber;

    //Balance in the account
    protected double balance;

    //Default constructor. When objects are created without any params, default constructor is always called
    // at the beginning.
    public Account() {

    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    //parameterized constructor
    public Account(String name, String dob, String bankName, int accountNumber){
        this.name = name;
        this.dob = dob;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        //balance is ought to be 0 in the beginning.
        balance = 0;
    }



    //Getters.
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getBankName() {
        return bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //amount is the value to be deposited or withdrawn.

    //abstract methods with its implementation body in another class.
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract boolean transfer(double amount);
    public abstract void currentBalance(double balance);
    public abstract void bankStatement(String name, String bankName, double balance);
}
