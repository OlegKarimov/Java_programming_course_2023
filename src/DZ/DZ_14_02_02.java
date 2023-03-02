package DZ;

import java.util.Calendar;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DZ_14_02_02 {
    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------
//Задача 3 (*) Решение квадратного уравнения с коэффициентами a, b, c.
// Для изъятия квадратного корня импортировать класс Math.

        boolean exitCh = true;

        do {
            try {
            double descr, x1, x2;

            System.out.println("Решение квадратного уравнения вида ax² + bx + c = 0");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число a : ");
            double a = scanner.nextDouble();

            System.out.println("Введите число b : ");
            double b = scanner.nextDouble();

            System.out.println("Введите число c : ");
            double c = scanner.nextDouble();

            descr = b * b - 4 * a * c;

            if ((a == 0) & (b == 0) & (c == 0)) System.out.println("Вы ввели все нули !");
            else if ((a == 0) & (b != 0)) System.out.println("Уравнение имеет один корень: x = " + (c / b));
            else if ((a == 0) & (b == 0)) System.out.println("Уравнение не имеет решений!");
            else{
                    if (descr > 0) {
                        x1 = (-b - Math.sqrt(descr)) / (2 * a);
                        x2 = (-b + Math.sqrt(descr)) / (2 * a);
                        System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
                    } else if (descr == 0) {
                        x1 = -b / (2 * a);
                        System.out.println("Уравнение имеет один корень: x = " + x1);
                    } else {
                        System.out.println("Уравнение не имеет решений!");
                    }
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Ошибка: Нельзя вводить символы!");
            }

            System.out.println("Продолжить ? y/n");
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'n') exitCh = false;
        }
        while (exitCh);


        System.out.println("----------------------------------------------------");
    }
}