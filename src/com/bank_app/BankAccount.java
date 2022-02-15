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
        System.out.println("Successfully open new account. Current checking balance is " + this.checkingBalance + " and current savings balance is " + this.savingsBalance);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void withdrawFromChecking(double withdrawAmount){
        if(this.checkingBalance < withdrawAmount){
            System.out.println("Not enough balance");
            if(this.checkingBalance + this.savingsBalance >= withdrawAmount){
                System.out.println("Need to do a balance transfer in order to proceed with the withdrawal");
            }
        } else{
            this.checkingBalance -= withdrawAmount;
            System.out.println("Successfully withdrew " + withdrawAmount + " from checking account. Remaining balance is " + this.checkingBalance);
        }
    }
    public void withdrawFromSavings(double withdrawAmount){
        if(this.savingsBalance < withdrawAmount){
            System.out.println("Not enough balance");
            if(this.checkingBalance + this.savingsBalance >= withdrawAmount){
                System.out.println("Need to do a balance transfer in order to proceed with the withdrawal");
            }
        } else{
            this.savingsBalance -= withdrawAmount;
            System.out.println("Successfully withdrew " + withdrawAmount + " from savings account. Remaining balance is " + this.savingsBalance);
        }
    }
}
