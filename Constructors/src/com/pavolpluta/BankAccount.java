package com.pavolpluta;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //calling second constructor from this empty constructor
    public BankAccount(){
        this("00000",0.00,"Default name","Default email", "+421 948 000 000");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double money){
        if (money > 0){
            this.balance += money;
            System.out.println(money + "$ has been deposited to the account.");
            System.out.println(this.balance + "$ on the account.");
        }else{
            System.out.println("Incorrect number.");
        }

    }

    public void withdraw(double money){
        if(this.balance > 0){
           if (this.balance - money < 0){
               System.out.println("Only " + this.balance + "$ available. Withdrawal not processed.");
           }else{
               this.balance -= money;
               System.out.println(money + "$ withdrawn, " + this.balance + "$ left on the account.");
           }

        }else{
            System.out.println("Empty account!");
        }
    }
}
