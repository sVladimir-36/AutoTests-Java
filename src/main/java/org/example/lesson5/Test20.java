package org.example.lesson5;

import java.util.Arrays;

public class Test20 {
    //создание метода
    int summa(int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1) {
        int result2 =  summa(a1, b1, c1)/3;
        return result2;
    }


    //вызов метода
    }

    class Test21{

        public static void main(String[] args) {
            Test20 t = new Test20();
            int summaTrexChisel = t.summa(1, 3, 5);
            System.out.println(summaTrexChisel);
            System.out.println(t.summa(10,20,30));

            System.out.println(t.sredneeArifm(5, 100, 3));
        }
    }
