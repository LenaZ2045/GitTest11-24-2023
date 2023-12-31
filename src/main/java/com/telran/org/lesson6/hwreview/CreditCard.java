package com.telran.org.lesson6.hwreview;

public class CreditCard {
    private int amount;
    private String currency;

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public CreditCard(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

}
