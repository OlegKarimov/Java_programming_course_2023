package Lektions;

import java.io.IOException;
import java.util.Scanner;

public class Lektion_06_02_Mit_Leonid {
    public static void main(String[] args) throws IOException {

// for (initialization; termination; increment) {
//        statement(s)

//        for(int i=1; i<11; i++){
//            System.out.println("Count is: " + i);
//        }

//   1. Шаг параметр
//   2. Условие повторения
//   3. Тело цикла
//   4. Изменить счетчик
//   5. Запустить и проверить на крайних значениях
 /*
    - полезно печатать i

  */

// Задание 1   "Primer"

        Scanner scanner = new Scanner(System.in);

// Input--------------------------------
        char ch = 0;
        int n;
        do {

            System.out.println("Input n : ");
            n = scanner.nextInt();
//-------------------------------------------

            if (n >= 0) {

                boolean flag = false;            //  "Primer"

                for (int i = 2; i <= n / 2; i++)
                    if (n % i == 0) flag = true;   // "Not primer"

                if (flag) System.out.println("Not primer");
                else System.out.println("Primer");

                System.out.println("Continue? y? ");

                ch = (char) System.in.read();
//              char ch = scaner.nextLine().toLowerCase().charAt(0);

            } else System.out.println("Incorrect input");

        }
        while (ch == 'y');




// Задание 2   Faktorial

// Input--------------------------------

        scanner = new Scanner(System.in);
        System.out.println("Input n : ");
//        ch = (char) System.in.read();
        int nF = scanner.nextInt();
//-------------------------------------------

        int faktorial = 1;

        for (int i = 2; i <= nF; i++)
            faktorial = faktorial * i;

        System.out.println("Faktorial n : " + faktorial);



// Задание 3 Посимвольно вывожу строку в столбик

// Input--------------------------------

        scanner = new Scanner(System.in);
        System.out.println("Input word : ");
        String str = scanner.nextLine();
//-------------------------------------------

        for (int i = 0; i <= str.length() - 1; i++)
            System.out.println(str.charAt(i));

        scanner.close();

    }


}
