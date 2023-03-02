package Konsultations;

import java.util.Scanner;

public class Konsul_03_02 {

    public static void main(String[] args) {

        // Input--------------------------------

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input n : ");
    int n = scanner.nextInt();

    tablUmn(n);

    System.out.println("Input n : ");
    n = scanner.nextInt();
    System.out.println("Sum = "+tablSum(n));

    tablUmnFull();

}

    public static void tablUmn(int n)
    {
        int i = 1;

        while (i<=10){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }

    }

    public static int tablSum(int n)
    {
        int i = 1;
        int sum = 0;

        while (i<=n){
            sum = sum + i;
            i++;
        }
        return sum;

    }

    public static void tablUmnFull()
    {
        int i = 1;
        int n = 1;

        while (i<=10){
            while (n<=10) {
                System.out.print((n * i)+" ");
                n++;
            }
            System.out.println();
            n = 1;
            i++;
        }

    }

}
