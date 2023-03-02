package Lektions;

//      Ternary operator
//      variable = Condition ? Expession1 : Expession2

import java.util.Scanner;

public class Lektion_31_01 {
    public static void main(String[] args) {

/*
// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int1 : ");
        int int1 = scanner.nextInt();

        System.out.println("Input int2 : ");
        int int2 = scanner.nextInt();

//-------------------------------------

        int sum = int1 + int2;

        if (int1 == int2) sum = sum * 2;

        System.out.println("Output : " + sum);
        
//    4) if-else-if statement -------------------------------        

        int num = 20;

        if (num < 50)
        {
            System.out.println("num is less than 50 ");

            if (num > 10) System.out.println("num is greater than 10 ");
        }


        if - else - if ladder
        if (condition)
            statement;
        else if (condition)
            statement;
        else if (condition)
            statement;
                .
                .
                .
         else
            statement;


        int x = 0;
        if (x == 1) System.out.println("x = 1");
        else if (x == 2) System.out.println("x = 2");
        else if (x == 3) System.out.println("x = 3");
        else if (x == 4) System.out.println("x = 4");
        else System.out.println("x is not betwen 1 and 4");

        System.out.println("Finish");

// ------------------------------------------------------------------------------------------------

//      Ternary operator
//      variable = Condition ? Expession1 : Expession2

        int age = 10;

        boolean isAdult = age >= 18 ? true : false;

//--------------

        if (age >= 18) System.out.println("can vote:");
        else System.out.println("too you");

        String isAdultString = age >= 18 ? "can vote:" : "too you";
        System.out.println(isAdultString);

        System.out.println(age >= 18 ? "can vote:" : "too you");

// --------------

        String caseWord = "uppercase";

        String name = caseWord.equals("uppercase") ? "EVGENY" : "evgeny";

// --------------

        int sum1 = int1 != int2 ? int1+int2 : (int1+int2)*2;

// -------------

        String str =null;
        String value = str != null ? str.toLowerCase() : null;

// --------------

        int val1 = 5;
        int val2 = 8;
        int max = val1 >= val2 ? val1 : val2;
        System.out.println("max is : "+max);

// -------------

        int val3 = -10;
        int abs = val3 >= 0 ? val3 : -val3;
        System.out.println("abs :"+val3);


 */
// Input------------------------------------------------------------------
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int : ");
        int int1 = scanner.nextInt();

        if (int1 < 10) System.out.println("It is a one digit number");
        else if (int1 < 100) System.out.println("It is a two digit number");
        else if (int1 < 1000) System.out.println("It is a three digit number");
        else if (int1 < 10000) System.out.println("It is a four digit number");
        else System.out.println("The number is too big for me");

//---------------------------------

        System.out.println();

        String str = ""+int1;
        System.out.println(int1 < 10000 ? "It is a "+str.length()+" digit number" : "The number is too big for me");
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int1 : ");
        int int1 = scanner.nextInt();

        System.out.println("Input int2 : ");
        int int2 = scanner.nextInt();

        System.out.println("Input int3 : ");
        int int3 = scanner.nextInt();

        if ((int1 >= int2) && (int1 >= int3)) System.out.println("Max int1: "+int1);
        else if ((int2 >= int1) && (int2 >= int3))System.out.println("Max int2: "+int2);
        else System.out.println("Max int3: "+int3);

        System.out.println();

        if (int1>=int2) {
            if (int2 >= int3)
                System.out.println(int1 + " is the max");
        }
        else if (int3>=int1) System.out.println(int3+" is the max");
        else System.out.println(int2+" is the max");


    }
        
}
