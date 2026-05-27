package org.example.variables;


public class HW1 {
    //Переменная
    String message = "Привет!";

    public static void main(String[] args) {
    //Создаем обьект класса HW1, чтобы методы вызывались
        HW1 hw = new HW1();
        hw.method1();
        hw.method2();
        hw.method3();
    }
        //Первый метод
    public void method1 () {
            System.out.println("Первый метод");
        }
        //Второй метод
    public void method2 () {
            System.out.println("Второй метод");
        }
        //Третий метод
    public void method3 () {
            System.out.println("Третий метод");
        }

    }


