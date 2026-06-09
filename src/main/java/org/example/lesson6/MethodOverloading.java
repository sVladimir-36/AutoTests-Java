package org.example.lesson6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }

    void show(String s1, int a) {
        System.out.println("String " + s1 + "int " + a);
    }
}

class MethodOverloadingTest{

    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        //вызов метода
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Привет!";
        mO.show(s);
        mO.show("Привет ", 777    );
    }
}
