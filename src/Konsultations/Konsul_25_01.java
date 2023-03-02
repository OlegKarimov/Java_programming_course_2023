package Konsultations;

import java.util.Scanner;

public class Konsul_25_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = scanner.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Num1 = "+num1);
        System.out.println("Num2 = "+num2);
    }
}
