package org.example.lesson5;

import java.util.Arrays;

public class Car2 {
    //Создание конструктора
    Car2(String cvet, String motor, int skorost) {
        color = cvet;
        engine = motor;
        speed = skorost;

        System.out.println("Цвет машины " + color + " мотор = " + engine + ", скорость = " + speed);
    }

    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed+= skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed-= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет: " + color + " мотор " + engine + " скорость " + speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        //Car2 c1 = new Car2();
        //c1.color = "black";
        //c1.engine = "V12";
        //c1.speed = 60;

        //c1.showInfo();
        //c1.gaz(15);
        //c1.showInfo();
        //c1.tormoz(5);
        //c1.showInfo();
//Создаем обьект c2 класса Car2 с использованием ранее созданного конструктора
        Car2 c2 = new Car2("Синий", "как у запорожца", 300);

        //System.out.println(c2.color);
        //System.out.println(c2.engine);
        //System.out.println(c2.speed);
    }
}