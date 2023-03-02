package Konsultations;

//1- есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
// букв будет в нижнем регистре а вторая в верхнем
// Helloh -> helLOH

import java.util.Scanner;

public class Konsul_27_01_DZ_2 {
    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine();

//-------------------------------------
        if ((str.length()%2) == 0)
        {
            String buf = str.substring(0,str.length()/2);
            buf = buf.toLowerCase();
            str = str.substring(str.length()/2);
            str = buf + str.toUpperCase();
            System.out.println("Output : "+str);
        }
        else System.out.println("Error: You entered an odd number of characters!");

    }
}
