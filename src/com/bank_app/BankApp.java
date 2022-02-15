package com.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(250, 500);
        customerAcct.withdrawFromChecking(400);
        customerAcct.withdrawFromSavings(100);
        customerAcct.transferToChecking(300);
        customerAcct.transferToSavings(10000);
        customerAcct.depositToChecking(5000);
        customerAcct.depositToSavings(12000);
    }
}
