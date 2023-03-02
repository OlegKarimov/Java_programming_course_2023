package Lektions;

import java.util.Scanner;

public class Game_Metodi {

    static Scanner scanner = new Scanner(System.in);

    static int secret = 9;

    int num = readNumber();

    public static void main(String[] args) {


    }

    private static int readNumOfAttempts(){
        System.out.println("Enter number of attemps");
      //  int number = scanner.nextInt();
        return scanner.nextInt();
    }

    private static int readNumber(){
        System.out.println("Enter number ");
        //  int number = scanner.nextInt();
        return scanner.nextInt();
    }
}
