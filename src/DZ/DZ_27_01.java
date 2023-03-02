package DZ;
/*
1. Даны две строки. Написать программу, выводящую в консоль строки,
соединенные вместе, но без последних букв. Все буквы в получившейся строке должны быть заглавными
 */
import java.util.Scanner;

public class DZ_27_01 {
    public static void main(String[] args) {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string 1 : ");
        String str1 = scanner.nextLine();

        System.out.println("Input string 2 : ");
        String str2 = scanner.nextLine();

//--------------------------------------

        String res = str1.substring(0,str1.length()-1)+str2.substring(0,str2.length()-1);
        System.out.println(res.toUpperCase());

    }
}
