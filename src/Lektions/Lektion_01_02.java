package Lektions;

//  ------ switch -----


import java.util.Scanner;

public class Lektion_01_02 {

    public static void main(String[] args) {

// Input--------------------------------
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int int1 = scanner.nextInt();
*/
//-------------------------------------
        int int1 = 1;

        switch (int1) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("another");
        }

        char ch = 'b';
        switch (ch) {                          // в скобках должна быть константа
            case 'd':                          // могут быть сисла, символы и строки
                System.out.println("d");
                break;                        // выход из case
            case 'c':
                System.out.println("c");
                break;
            case 'a':
                System.out.println("a");
                break;
            default:
                System.out.println("another");
        }
// Help
// 1.if
// 2.switch
// Chose one:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Help");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("Enter num : ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("The if: ");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("Traditional Switch ");
                System.out.println("switch (condition) statement;");
                System.out.println("case constant;");
                break;
            default:
                System.out.println("Not found");

        }

/*
    //2.Написать программу, проверяющую является ли введенная с клавиатуры буква английского алфавита
        // гласной или  согласной . Написать как switch  и написать через if-else.
        // гласные: a,e,i,o,u,y:

        System.out.println("Enter a character: ");
        char ch1 = scanner.next().charAt(0);

        boolean isVowel=false;

        switch (ch1)
        {
            case 'a':
            case 'y':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            case 'e': isVowel =true;

        }
        if (isVowel) {
            System.out.println(ch1 + " is a vowel");
        }
        else {
            if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z'))
                System.out.println(ch1 + " is a consonant");

            else
                System.out.println("Your symbol is not an english letter");

        }




        //3.Написать программу, находящую количество дней в месяце.
        // С клавиатуры вводятся два значения: номер месяца  и год.
        // А программа выдает количество дней в этом месяце.
        //month= 1 , year=2000 -> 31
        //month= 2 , year = 1999 -> 28
        //month= 2 , year = 2000 -> 29
        //
        System.out.println("Enter a year");
        int year = sc.nextInt();

        System.out.println("Enter month number from 1 to 12");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("January, 31 days");
                break;

            case 2:
                int numberOfDaysInFebruary;

                if((year%4==0)&&(((year%100)!=0)||((year%100==0)&&(year%400==0))))
                { numberOfDaysInFebruary =29;
                }else{numberOfDaysInFebruary=28;
                }
                System.out.println("February "+numberOfDaysInFebruary);
                break;

            case 3:
                System.out.println("March, 31 days");
                break;

            case 4:
                System.out.println("April, 30 days");
                break;

            default:
                System.out.println("you entered the wrong month number");
        }


 */

    }
}
