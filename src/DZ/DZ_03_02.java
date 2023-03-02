package DZ;

import java.util.Scanner;

public class DZ_03_02 {
    public static void main(String[] args) {

// Задача1
// С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1 : ");
        int num = scanner.nextInt();
        tablUmn(num);

// Input--------------------------------

        System.out.println();
        System.out.println("Input number 2 : ");
        num = scanner.nextInt();

        System.out.println("Kub to n : "+kubNum(num));


    }
//-------------------------------------

        public static void tablUmn(int num)
        {


            int i = 1;

            while (i <= num) {
                int rez = i * i * i;
                System.out.println(i + " v kube " + rez);
                i++;
            }
        }


// --------------------------------------------------------------------------------------
// 3. Написать метод, принимающий целое число и возвращающий значение этого числа в кубе.

        public static int kubNum(int num) {
            int res = num*num*num;
            return res;
        }
    }


