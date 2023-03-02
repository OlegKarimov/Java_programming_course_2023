package DZ;

import java.util.Scanner;

public class DZ_26_01 {
    public static void main(String[] args) {

// Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input str1: ");
        String str1 = scanner.nextLine();
        System.out.println("Input str2: ");
        String str2 = scanner.nextLine();
//--------------------
        str1 = str1.substring(1);
        str2 = str2.substring(1);
//Output
        System.out.println("Output: "+str1+str2);

    }

}
