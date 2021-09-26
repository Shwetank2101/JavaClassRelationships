package com.Bank;

public class Account {
    int balance = 0;
    int compoundinterest = 0;

    public displayBalance(int balance){
        System.out.println("Balance: "+balance);
    }

    public creditMoney(int money){
        balance+=money;
    }

    public debitMoney(int money){
        balance-=money;
    }

    public
}
