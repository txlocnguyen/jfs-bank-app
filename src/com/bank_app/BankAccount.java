package com.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    final private double checkingOpeningDeposit;
    final private double savingsOpeningDeposit;
    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit){
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        this.checkingBalance += checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
}
