package Lektions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Prog_01_02_2 {

    public static void main(String[] args) throws IOException {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input char : ");
        String str = scanner.nextLine();

        str = str.toLowerCase(Locale.ROOT);
        char ch = str.charAt(0);

//-------------------------------------

        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
                System.out.println("vowel");
                break;
            case 'q':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
