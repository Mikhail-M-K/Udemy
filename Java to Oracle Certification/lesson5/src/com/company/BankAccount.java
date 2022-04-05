package com.company;

public class BankAccount {
        int id;
        double balance;
        String name;

    double replAcc(String name, double dollars) {
        dollars += 20;
        System.out.println(name + ", replenishment of the bank account for 20. Balance: " + dollars);
        return balance;
    }
    double withAcc(String name, double dollars) {
        dollars -= 15;
        System.out.println(name + ", withdrawal from a bank account for 15. Balance: " + dollars);
        return balance;
    }
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name="Vova";
        MyAccount.balance = 10.07;

        YourAccount.id = 2;
        YourAccount.name="Nikolay";
        YourAccount.balance = 180.07;

        HisAccount.id = 3;
        HisAccount.name="Aleksey";
        HisAccount.balance = 220.07;

        MyAccount.balance = MyAccount.replAcc(MyAccount.name, MyAccount.balance);
        YourAccount.balance = YourAccount.replAcc(YourAccount.name, YourAccount.balance);
        HisAccount.balance = HisAccount.withAcc(HisAccount.name, HisAccount.balance);
    }

}