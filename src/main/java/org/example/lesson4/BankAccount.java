package org.example.lesson4;

import java.util.Arrays;

public class BankAccount  {
    int id;
    String name;
    double balance;
    //метод для пополнения счета
    double popolnenieScheta (double summaPopolnenya) {
        double result = balance + summaPopolnenya;
        return result;
    }
    //метод для снятия со счета
    double snyatieSoScheta (double summaSnyatia) {
        double result = balance - summaSnyatia;
        return result;
    }

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Vovan";
        MyAccount.balance = 15.55;

        YourAccount.id = 2;
        YourAccount.name = "Tania";
        YourAccount.balance = 188.55;

        HisAccount.id = 3;
        HisAccount.name = "Bell";
        HisAccount.balance = 8.44;

        System.out.println(MyAccount.name);
//вызов метода для пополнения счета на указанную сумму
        double popolnenie = MyAccount.popolnenieScheta(143);
        System.out.println(popolnenie);
//вызов метода для снятия со счета указанной суммы
        double snyatie = YourAccount.snyatieSoScheta(111.45);
        System.out.println(snyatie);
    }

}

