package com.bank_app;

public class BankAccount {
    final private double checkingOpeningDeposit;
    final private double savingsOpeningDeposit;
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        this.checkingBalance += checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;
        System.out.println("Successfully open new account. Current checking balance is " + this.checkingBalance + " and current savings balance is " + this.savingsBalance);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void withdrawFromChecking(double withdrawAmount) {
        if (this.checkingBalance < withdrawAmount) {
            System.out.print("Not enough balance. ");
            if (this.checkingBalance + this.savingsBalance >= withdrawAmount) {
                System.out.println("Need to do a balance transfer in order to proceed with the withdrawal");
            }
        } else {
            this.checkingBalance -= withdrawAmount;
            System.out.println("Successfully withdrew " + withdrawAmount + " from checking account. Remaining balance is " + this.checkingBalance);
        }
    }

    public void withdrawFromSavings(double withdrawAmount) {
        if (this.savingsBalance < withdrawAmount) {
            System.out.print("Not enough balance. ");
            if (this.checkingBalance + this.savingsBalance >= withdrawAmount) {
                System.out.println("Need to do a balance transfer in order to proceed with the withdrawal");
            }
        } else {
            this.savingsBalance -= withdrawAmount;
            System.out.println("Successfully withdrew " + withdrawAmount + " from savings account. Remaining balance is " + this.savingsBalance);
        }
    }

    public void transferToChecking(double transferAmount) {
        if (this.savingsBalance < transferAmount) {
            System.out.println("Insufficient funds");
        } else {
            this.checkingBalance += transferAmount;
            this.savingsBalance -= transferAmount;
            System.out.println("Successfully transfer " + transferAmount + ". Current balance of checking account is " + this.checkingBalance + " and savings account is " + this.savingsBalance);
        }
    }

    public void transferToSavings(double transferAmount) {
        if (this.checkingBalance < transferAmount) {
            System.out.println("Insufficient funds");
        } else {
            this.checkingBalance -= transferAmount;
            this.savingsBalance += transferAmount;
            System.out.println("Successfully transfer " + transferAmount + ". Current balance of checking account is " + this.checkingBalance + " and savings account is " + this.savingsBalance);
        }
    }

    public void depositToChecking(double depositAmount) {
        this.checkingBalance += depositAmount;
        System.out.println("Successfully deposit " + depositAmount + ". Current balance of checking account is " + this.checkingBalance);
    }

    public void depositToSavings(double depositAmount) {
        this.savingsBalance += depositAmount;
        System.out.println("Successfully deposit " + depositAmount + ". Current balance of savings account is " + this.savingsBalance);
    }
}
