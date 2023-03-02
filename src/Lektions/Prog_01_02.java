package Lektions;

import java.io.IOException;
import java.util.Scanner;

public class Prog_01_02 {
    public static void main(String[] args) throws IOException {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1 : ");
        double int1 = scanner.nextDouble();

        System.out.println("Input action (+, -, *, /) : ");
        char ch;
        ch =(char)System.in.read();
//      char ch = scaner.next().charAt(0);   Ввод со сканера 1го символа !!!!


        System.out.println("Input number 2 : ");
        double int2 = scanner.nextDouble();

//-------------------------------------

        switch (ch) {
            case '+':
                System.out.println("Rezult: " + (int1 + int2));
                break;
            case '-':
                System.out.println("Rezult: " + (int1 - int2));
                break;
            case '*':
                System.out.println("Rezult: " + (int1 * int2));
                break;
            case '/':
                System.out.println("Rezult: " + (int1 / int2));
                break;
            default:
                System.out.println("Error: invalid character!");
        }
    }
}
