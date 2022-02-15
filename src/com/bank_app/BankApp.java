package com.bank_app;

public class BankApp {
    public static void main(String[] args){
        BankAccount customerAcct = new BankAccount(250, 500);
        customerAcct.withdrawFromChecking(400);
        customerAcct.withdrawFromSavings(100);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
    }
}
