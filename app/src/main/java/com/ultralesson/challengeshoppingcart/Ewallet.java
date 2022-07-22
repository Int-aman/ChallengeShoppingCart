package com.ultralesson.challengeshoppingcart;

@SuppressWarnings("ALL")
public class Ewallet {
    private String ewalletHolder;
    private double balance;

    public Ewallet(int balance,String ewalletHolder){
        this.balance = balance;
        this.ewalletHolder = ewalletHolder;
    }
    //getters and setters
    public String getEwalletHolder() {
        return ewalletHolder;
    }

    public void setEwalletHolder(String ewalletHolder) {
        this.ewalletHolder = ewalletHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
