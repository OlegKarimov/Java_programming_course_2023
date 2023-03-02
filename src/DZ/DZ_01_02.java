package DZ;

//Написать программу, проверяющую является ли число четным или нечетным.
// Решить задачу двумя способами -через оператор if и через тернарный оператор.

import java.util.Scanner;

public class DZ_01_02 {
    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int int1 = scanner.nextInt();

//---- 1 ---------------------------------

        if (int1 % 2 == 0) System.out.println(int1 + " - even number");
        else System.out.println(int1 + " - odd number");

//---- 1 ---------------------------------

        System.out.println(int1 % 2 == 0 ? int1 + " - even number" : int1 + " - odd number");
    }
}
