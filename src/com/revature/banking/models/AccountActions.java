package com.revature.banking.models;

public class AccountActions {

    private double balance;
    private String email;
    private Integer deposit;
    private Integer withdraw;

    public AccountActions(double balance, String email, Integer deposit, Integer withdraw){
        this.balance = balance;
        this.email = email;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public void Deposit (double deposit){
        this.balance +=deposit;
        System.out.println("Deposit Complete New Balance is"+this.balance);
    }

    public void Withdraw(double Withdraw){
        if(this.balance - Withdraw < 0){
            System.out.println("Transaction Failed due to Insufficient Funds");
        }else {
            this.balance -=Withdraw;
            System.out.println("Withdraw Complete New Balance is "+this.balance);
        }
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }
    public Integer getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Integer withdraw) {
        this.withdraw = withdraw;
    }
}
