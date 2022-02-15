package com.bank_app;

public class BankApp {
    public static void main(String[] args){
        BankAccount customerAcct = new BankAccount(250, 500);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
    }
}
