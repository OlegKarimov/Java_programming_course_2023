package Lektions;

// Оператор IF

import java.io.IOException;

public class Lektion_30_01 {
    public static void main(String[] args) throws IOException {

        String str123 = new String("Hekko");    // Замена в строке char на новый char
        System.out.println(str123.replace('k','l')); // Заменит в строке 'k' на 'l'
        System.out.println(str123);
        System.out.println(str123.replaceFirst("k","l"));

// Оператор IF ----------------------------------------
/*
        1) if statement
        2) if-else statement
        3) nesteg if-else statement
        4) if-else-if statement

        1) if
        В общем виде :
        if (условие)
        {
        }
 */

// 1) if statement -----------------------------------------

        int num = 65;
        if (num<100)
        {
            System.out.println("num is less than 100");
        }


// 2) if-else statement -----------------------------------------------------

        char ch;
        char answer ='A';

        System.out.println("A and Z ");

        ch =(char)System.in.read();

        if (ch == answer)
        {
            // statement
            System.out.println("You are right !!!");
        }
            else
        {
            //statement
        }

//  3) nesteg if-else statement --------------------------------------------

        num = 70;
        if (num<100)
        {
            // statement
            System.out.println("Num < 100");
            if (num>50)
            {
                System.out.println("Num > 50");
            }
        }

//  3) nesteg if-else statement --------------------------------------------

        int i = 10;
        int a,b,c,d,j,k;
        j = 19;
        b = 9;
        k = 80;
        d = 0;
        c = 3;

        if (i == 10)
        {
            if(j < 20) a = b;
            if(k < 99) c = d;
            else a = c;
        }
        else  a = 0;

    }

}
