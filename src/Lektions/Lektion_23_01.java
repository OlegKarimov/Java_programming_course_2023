package Lektions;

public class Lektion_23_01 {
    public static void main(String[] args) {
/*
        Написать программу, определяющую является ли год високосным.
        Год является високосным если год делится на 4.
        Но при этом год, который делится без остатка на 100 (god%100 == 0) является високосным
        только если он без остатка делится на 400 (god%400 == 0).
*/
        int god = 1904;
        boolean res = true;

        res = (god%4 == 0) && ((god%100 != 0)||((god%100 == 0) && (god%400 == 0)));

        System.out.println(res);

        //  System.out.println(true|false);
/*
        int year = 2024;

        boolean a1 = (year%4) == 0;
        boolean b1 = (year%100) != 0;
        boolean c1 = (year%100 == 0) && (year%400 == 0);
        boolean res = a1 && (b1 || c1);
*/

        /*

        1. a|(b&c) = (a|b)&(a|c)
        2. a & (b|c) = (a&b) | (a&c)
        3. !(a/b) = (!a & !b)
        4. !(a&b) = (!a | !b)

         */

        int num = 45;
        var num1 = 45;


    }
}
