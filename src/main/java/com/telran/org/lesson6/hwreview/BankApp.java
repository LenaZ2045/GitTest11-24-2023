package com.telran.org.lesson6.hwreview;

public class BankApp {
    public static void main(String[] args) {
//        CreditCard card = new CreditCard(1000, "EUR");
        CreditCard creditCard = new CreditCard(1000,"EUR");
        CreditCard usd = new CreditCard(1000, "USD");
        CreditCard creditCard1 = new CreditCard(500, "CAD");
        checkCurrency(creditCard);
        checkCurrency(usd);
//        checkCurrency(creditCard1);
    }

    private static void checkCurrency(CreditCard card) {
        if ("EUR".equals(card.getCurrency())) {
            System.out.println("YES - exchange EUR currency");
        } else {
            System.out.println("NO - exchange other currency");
        }
    }
}

