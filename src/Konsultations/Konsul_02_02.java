package Konsultations;

import java.util.Scanner;

public class Konsul_02_02 {
    public static void main(String[] args) {

// Input--------------------------------
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int f = scanner.nextInt();

//-------------------------------------
        int i = 1;
        int factorial = 1;

        while (i <= f)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Result : "+factorial);
*/


        /*
        Есть целое число. Используя цикл while написать программу, проверяющую равна ли в этом числе сумма
        его цифр их произведению
        123
        1+2+3=1*2*3
        1124
        1+1+2+4=1*1*2*4
        658
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int int1 = scanner.nextInt();

//-------------------------------------

        String int2 = ""+int1;
        int i = 0;
        int sum = 0;
        int proizv =1;

        while (i<int2.length())
        {
            int buf = int2.charAt(i) - '0';   // Перевод из char в int числа
            sum = sum + buf;
            proizv = proizv*buf;
            i++;
        }
        if (sum == proizv) System.out.println("Sum = proizved");
        else System.out.println("Sum ne ravna proizved");

//--------------- 2 вариант -------------------------------------------------------------------

        int temp, prod = 1, sumD = 0;

        int myNum = int1;

        while (myNum>0)
        {
            temp = myNum%10;
            sumD = sumD + temp;
            prod = prod * temp;
            myNum = myNum/10;
        }

        if (sumD == prod) System.out.println("Sum = proizved");
        else System.out.println("Sum ne ravna proizved");


    }
}
