package DZ;

import java.util.Scanner;

public class DZ_08_02 {
    public static void main(String[] args) {

//Задача 1. пользователь 10 раз вводит целые числа с клавиатуры,
// при вводе нечетного числа ввод чисел необходимо прекратить.

// Input-------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 10 events numbers.");

        for (int i = 1; i<=10; i++) {
            System.out.println("Input event number " + i);
            int num = scanner.nextInt();
            if (num%2 == 0) System.out.println("You input "+num);
            else {
                System.out.println("You input odd number!");
                break;
            }
        }

//-----------------------------------------------------
//Задача 2. Дано натуральное число n.
// Написать программу, которая вычисляет сумму S = 2 + 4 + … + 2*n.

        System.out.println();
        System.out.println("Input number ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i<=2*num; i++) {
            if (i % 2 == 0) sum += i;
        //  if (i % 2 == 1) continue;
        //  sum += i;
        }
        System.out.println("Sum event numbers "+sum);
    }
}
