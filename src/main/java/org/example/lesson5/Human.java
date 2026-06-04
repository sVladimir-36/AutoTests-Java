package org.example.lesson5;

import org.example.lesson4.BankAccount;

public class Human {
String name;
Car3 car;
BankAccounts bA;

void info() {

    System.out.println("Имя " + name + " цвет: " + car.color + " баланс счета " + bA.balance);
}

}

class HumanTest{

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Volodia";
        h.car = new Car3("Коричневый", "1.6", 145);
        h.bA = new BankAccounts(322, 3566);

        h.info();
    }

}

class Car3{
    Car3(String cvet, String motor, int skorost) {
        color = cvet;
        engine = motor;
        speed = skorost;
    }

    String color;
    String engine;
    int speed;
}

class BankAccounts{
    BankAccounts(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}