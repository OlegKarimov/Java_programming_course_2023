package Konsultations;

//  Homework for Monday consultation- Task 0 is not compulsory
// 0- есть строка  в которой нужно поменять местами две заданные буквы.
//  Известно, что эти буквы в строке есть.
// пример: String str = "asDfghjklRre";  поменять D и R

import java.io.IOException;
import java.util.Scanner;

public class Konsul_27_01_DZ____ {

    public static void main(String[] args) throws IOException {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine();

        System.out.println("Enter char1 : ");
        char ch1 = (char)System.in.read();

        int buf = System.in.read();
        System.out.println("Enter char2 : ");
        char ch2 = (char)System.in.read();

//--------------------------------------12345D6789Rqwert

        int indexD = str.indexOf(ch1);
        int indexR = str.indexOf(ch2);

        if (indexD == -1 || indexR == -1) System.out.println("Error: Letter is no the string !!");

        else {

            if (indexD < indexR)
                System.out.println("Result: " + str.substring(0, indexD) +ch2+ str.substring(indexD + 1, indexR) + ch1 + str.substring(indexR + 1));

            else
                System.out.println("Result: " + str.substring(0, indexR) + ch1 + str.substring(indexR + 1, indexD) + ch2 + str.substring(indexD + 1));
        }
    }
}
