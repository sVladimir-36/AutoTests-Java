package org.example.lesson4;

import java.util.Arrays;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        //Cоздаем обьект класса BankAccount, после new идет вызов конструктора
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        //Задаем параметры обьектов
        MyAccount.id = 1;
        MyAccount.name = "Вова";
        MyAccount.balance = 50.0;

        YourAccount.id = 2;
        YourAccount.name = "Дима";
        YourAccount.balance = 150.0;

        HisAccount.id = 3;
        HisAccount.name = "Олег";
        HisAccount.balance = 55.00;

        //Выводим в консоль
        System.out.println(MyAccount.id);


    }
}


