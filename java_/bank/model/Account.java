 package java_.bank.model;

 import java_.bank.service.BankOperations;

 public abstract class Account implements BankOperations{
    
    private int accountNumber;
    private String accountHolderName;

    private double balance;

    public Account (int accountNumber , String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    

    //getter function to get ac
    public int getaccountNumber(){
        return accountNumber;
    }

    
    //getter for ac name
    public String getaccountHolderName(){
        return accountHolderName;
    }


    //getter for deposit amount
    public void deposit(double amount){

        balance += amount;
        System.out.println("Amount deposited Successfully");
    }


    //abstract method
    public abstract void withdraw (double amount);

 }