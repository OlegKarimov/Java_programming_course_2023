package DZ;

import java.util.Scanner;

public class DZ_07_02 {
    public static void main(String[] args) {

// Задача 1 Вывести на экран таблицу квадратов натуральных чисел от 0 до 99


//-----------------------------------------
        System.out.printf("%5s |","");
        for ( int i=0; i < 10; i++)
            System.out.printf("%5s |",i);
//-----------------------------------------
        int i = 0;     // Десятки
        int n = 0;     // Единицы

        System.out.println();

        while (n<=99){
            while (i<=10) {
                if (i == 0) System.out.printf("%5s |",n/10);
                else
                {
                    System.out.printf("%5s |",(n * n));
                    n++;
                }

                i++;
            }
            System.out.println();
            i = 0;
        }

// Задача 2 Вывести на экран все простые числа меньше введенного N.
// Перед тем, как приступать к кодированию программы, описать алгоритм словами.


// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n : ");
        int m = scanner.nextInt();
//-------------------------------------------

        for (int k = 2; k< m; k++) {

            boolean flag = true;            //  "Primer"
            for (int a = 2; a <= k / 2; a++)
                if (k % a == 0) flag = false;   // "Not primer"

            if (flag) System.out.println(k);


        }

    }
}
