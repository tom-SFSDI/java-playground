package com.statefarm;

class BankAccount {
    int total = 0;
    public int deposit(long cents) {
        total += cents;
        System.out.println(total);
        return total;
    }

    public int withdraw(long cents) {
        total -= cents;
        System.out.println(total);
        return total;
    }
    public int balance() {
        return total;
    }

    public boolean isOverDrawn() {
        if (total > 0) {
            return false;
        } else {
            return true;
        }
    }
}


