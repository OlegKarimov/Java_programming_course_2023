package Konsultations;

import java.util.Scanner;

public class Konsul_26_01 {
    public static void main(String[] args) {

// №2 -------------------------------------------------

    Scanner scanner = new Scanner(System.in);
    System.out.println("2. Input str: ");
    String str = scanner.nextLine();

//   char char1 = str.charAt(0);
//   String strBuf = str.substring(1);
//   str = strBuf+char1;
//   System.out.println("1. Output "+str);

    System.out.println("2. Output: "+str.substring(1)+str.charAt(0));

    System.out.println("----------------------------");

// №3 ------------------------------------------------------

    System.out.println("3. Input str: ");
    str = scanner.nextLine();

    str = str.substring(0,(str.length()/2));
    System.out.println("3. Output: "+str);

    System.out.println("----------------------------");

// №4 ------------------------------------------------------

    System.out.println("4. Input str: ");
    str = scanner.nextLine();

    int lengthStr = str.length()-1;
    char char1 = str.charAt(lengthStr);
    str = str.substring(0,lengthStr);
    System.out.println("4. Output: "+char1+str);


    }


}
