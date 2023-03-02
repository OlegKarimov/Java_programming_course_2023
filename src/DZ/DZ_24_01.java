package DZ;

import java.util.Scanner;

public class DZ_24_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you First name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter you Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter you Age: ");
        int age = scanner.nextInt();

        System.out.println("You First name: "+firstName);
        System.out.println("You Last name: " +lastName);
        System.out.println("You Age: "+age);

        scanner.close();

    }
}
