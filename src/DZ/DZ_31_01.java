package DZ;

// Даны два целых числа.
// Написать программу, выводящую на экран или их сумму или, если эти числа равны, то двойную сумму.

import java.util.Scanner;

public class DZ_31_01 {
    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int1 : ");
        int int1 = scanner.nextInt();

        System.out.println("Input int2 : ");
        int int2 = scanner.nextInt();

//-------------------------------------

        if (int1 == int2) System.out.println("Output : "+((int1+int2)*2));
        else System.out.println("Output : "+(int1+int2));

    }

}
