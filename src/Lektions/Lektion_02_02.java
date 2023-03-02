package Lektions;

// Циклы

import java.util.Scanner;

public class Lektion_02_02 {
    public static void main(String[] args) {

// Input--------------------------------
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int i = scanner.nextInt();

//-------------------------------------

        while (i<=10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("end of while");
        System.out.println(i);

// -----------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String hello = scanner.nextLine();

        int i = 0;

        while (i<hello.length())
        {
            System.out.print(hello.charAt(i));
            i++;
        }


//----------------------------------------------------------------------------------------
        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while (i>=1);
*/
        int i = 1;
        int sum = 0;

        while (i<=5)
        {
            sum = sum + i;
            i++;
            // sum+=i++;
        }
        System.out.println("sum of digits from 1 to 5 is "+sum);

//     Фибоначи ------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        int number;
        int evenSum = 0;
        int oddSum = 0;
        char endOfGame;
        char coice;

        do {
            System.out.println("Enter any number ");
            number = scanner.nextInt();

            if (number % 2 == 0) evenSum += number;

            else oddSum +=number;
            System.out.println("Du you want to continue ? 'y' or 'n' ");
            coice = scanner.next().toLowerCase().charAt(0);

            }
        while (coice == 'y');
        System.out.println("Sum of even number is "+evenSum);
        System.out.println("Sum of odd number is "+oddSum);

    }
}
