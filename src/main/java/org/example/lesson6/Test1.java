package org.example.lesson6;

import java.util.Arrays;

public class Test1 {

    int sum() {
        return 0;
    }

    int sum(int a) {
        return a;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        int z = t1.sum();
        System.out.println(z);
        int x = t1.sum(1);
        System.out.println(x);
        int v = t1.sum(1, 2);
        System.out.println(v);
        int n = t1.sum(1, 2, 3);
        System.out.println(n);
        int m = t1.sum(1, 2, 3, 4);
        System.out.println(m);


    }
}


