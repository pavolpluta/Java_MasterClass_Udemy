package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
//	 BankAccount account = new BankAccount();
//
//     System.out.println(account.getCustomerName());
//
//     account.deposit(150);
//	 account.deposit(20);
//	 account.withdraw(10.28);
//	 //System.out.println(account.getBalance());
//
//     account.withdraw(160);

     VipCustomer vip = new VipCustomer();
        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmail());
    }
}
