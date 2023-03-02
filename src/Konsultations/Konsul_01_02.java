package Konsultations;

import java.io.IOException;
import java.util.Scanner;

public class Konsul_01_02 {
    public static void main(String[] args) throws IOException {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int num = scanner.nextInt();

// -------------------------------------
/*
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Num incorrect");
        }

        if (num == 1) System.out.println("Monday");
        else if (num == 2) System.out.println("Tuesday");
        else if (num == 3) System.out.println("Wednesday");
        else if (num == 4) System.out.println("Thursday");
        else if (num == 5) System.out.println("Friday");
        else if (num == 6) System.out.println("Saturday");
        else if (num == 7) System.out.println("Sunday");
        else System.out.println("Num incorrect");
*/

//------------------------------------------------------------------------

        if (num >= 90) System.out.println("Grade 5");
        else if ((num >= 70) && (num < 90)) System.out.println("Grade 4");
        else if ((num >= 50) && (num < 70)) System.out.println("Grade 3");
        else if (num < 50) System.out.println("Grade 2");
        else System.out.println("Num incorrect");
/*

        switch (num) {
            case 5:
                System.out.println("Grade 5");
                break;
            case 4:
                System.out.println("Grade 4");
                break;
            case 3:
                System.out.println("Grade 3");
                break;
            case 2:
                System.out.println("Grade 2");
                break;

            default:
                System.out.println("Num incorrect");
        }
*/

    }

}
