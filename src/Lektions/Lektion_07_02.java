package Lektions;

import java.util.Scanner;

public class Lektion_07_02 {
    public static void main(String[] args) {

// Input-------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 10 positive numbers.");

        for (int i = 1; i<=10; i++) {
            System.out.println("Input positive number " + i);
            int num = scanner.nextInt();
            if (num >= 0) System.out.println(num);
            else {
                System.out.println("You input negative number!");
                break;
            }
        }




    }
}
