package com.statefarm;

public class Application {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        EmailFormatter.formatted(args);
        BankAccount tom = new BankAccount();
        tom.deposit(100);
        tom.withdraw(25);
        tom.balance();
        tom.isOverDrawn();
    }

}

