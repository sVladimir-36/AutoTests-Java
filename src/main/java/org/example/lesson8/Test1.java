package org.example.lesson8;

import java.util.Arrays;

public class Test1 {
    public final int a;

    Test1() {
        a = 15;
    }
     Test1(boolean b) {
        a = 10;
     }

     void abc(short a) {
        final byte b = 10;
         System.out.println(a + b);
     }



    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }
}
