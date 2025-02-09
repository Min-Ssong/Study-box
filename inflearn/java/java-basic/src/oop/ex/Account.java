package oop.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if( balance < amount ){
            System.out.println("lack of balance");
            System.out.println("balance : " + balance);
        } else {
            balance -= amount;
        }
    }
}
