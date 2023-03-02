package DZ;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DZ_14_02 {
    public static void main(String[] args) {

// Задача 1 сделать калькулятор простых арифметических действий
// с двумя числами (сложение, вычитание, умножение и деление).
// Защититься от ввода символов вместо чисел и деления на 0.
// Интерфейс пользователя может продолжить работу с калькулятором до тех пор, пока он не откажется.

        boolean exitCh = true;
        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число a : ");
                double a = scanner.nextDouble();

                System.out.println("Введите действие ( + , - , * , / ) : ");
                char action = scanner.next().toLowerCase().charAt(0);

                System.out.println("Введите число b : ");
                double b = scanner.nextDouble();

                switch (action) {
                    case '+':
                        System.out.println("Результат " + a + " + " + b + " = " + (a + b));
                        break;
                    case '-':
                        System.out.println("Результат " + a + " - " + b + " = " + (a - b));
                        break;
                    case '*':
                        System.out.println("Результат " + a + " * " + b + " = " + (a * b));
                        break;
                    case '/':
                        if (b != 0) System.out.println("Результат " + a + " / " + b + " = " + (a / b));
                        else System.out.println("Ошибка: Делить на ноль нельзя!");
                        break;
                }

            } catch(InputMismatchException e) {
                System.out.println("Ошибка: Нельзя вводить символы!");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Продолжить ? y/n");
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'n') exitCh = false;
        }
        while (exitCh);

        System.out.println("----------------------------------------------------");

//---------------------------------------------------------------------------------------------------
//Задача 2 Заполнить массив 10 х 10 случайными числами 0 или 1.
// Для каждой строки подсчиать сумму всех элементов массива в этой серии.

        int[][] arrayRnd = new int[10][10];
        System.out.println("Массив : ");

        for (int i = 0; i<arrayRnd.length; i++){
            for (int j = 0; j<arrayRnd.length; j++){
                arrayRnd[i][j] = (int) (Math.random()*2);
                System.out.print(arrayRnd[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i<arrayRnd.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrayRnd.length; j++) {
                sum += arrayRnd[i][j];
            }
            System.out.println("Сумма " + (i + 1) + " строки = " + sum);
        }
        System.out.println("----------------------------------------------------");

//---------------------------------------------------------------------------------------------------

    }
}
