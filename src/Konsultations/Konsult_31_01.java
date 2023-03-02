package Konsultations;

import java.util.Scanner;

public class Konsult_31_01 {

    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int1 : ");
        int int1 = scanner.nextInt();

        System.out.println("Input int2 : ");
        int int2 = scanner.nextInt();

        System.out.println("Input int3 : ");
        int int3 = scanner.nextInt();

//-------------------------------------
/*
        if (int1 > 0) System.out.println("int1 > 0");
        else if (int1 < 0) System.out.println("int1 < 0");
        else System.out.println(int1 = 0);


//--------------------------------------------------

        if ((int1 != int2) && (int1 != int3) && ((int2 != int3))) System.out.println("All numbers are different");
        else if ((int1 == int2) && (int2 == int3))System.out.println("All numbers are equal");
        else System.out.println("Some numbers are equal");
*/
        if ((int1 < int2) && (int2 < int3)) System.out.println("increasing");
        else if ((int1 > int2) && (int2 > int3)) System.out.println("neither decreasing increasing");
        else System.out.println("neither decreasing no increasing");



    }
}
