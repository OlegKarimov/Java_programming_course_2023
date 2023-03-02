package Konsultations;

//2- Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
// int index =3
// String str = "Hello"
// -> Helo

import java.util.Scanner;

public class Konsul_27_01_DZ_3 {
    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine();

        System.out.println("Input index char : ");
        int index = scanner.nextInt();

//-------------------------------------

        if (( index < 0) || ( index > str.length()-1)) System.out.println("Error: Input false index !");

        else System.out.println("Output : "+str.substring(0,index)+str.substring(index+1));

    }

}
