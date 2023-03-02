package Lektions;

/*
Exeptions, debugging
Exception - исключение, особая ситуация (перевод с английского)

Major reasons why an exception Occurs
Invalid user input
Device failure
Loss of network connection
Physical limitations (out of disk memory)
Code errors
Opening an unavailable file
Differences between Error and Exception that is as follows:

Error: An Error indicates a serious problem that a reasonable application should not try to catch.

Exception: Exception indicates conditions that a reasonable application might try to catch.

Синтаксис
try { //  Block of code to try } catch(Exception e) { //  Block of code to handle errors }

Пояснения
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block. The try and catch keywords come in pairs:

Все исключения и ошибки пользователя можно обрабатывать самому, НО ЗАЧЕМ? Разарботчики Java предоставляют стандартный инструментарий для этого - это класс Throwable (потомок класса Oject) и его методы.

Примеры:

Деление на 0;
Выход за пределы массива;
Проверка ввода пользователя на корректность - не вводить символы вместо букв.
Примеры
Деление a на b, нельзя делить на 0; System.out.println("Деление на 0:"); int a = 100; int b = 0; try { int div = a / b; } catch (Exception e) { System.out.println("Зачем вы делите на ноль???"); } 2. Выход за пределы длины массива;   int[] myNumbers = {1, 2, 3}; try { System.out.println(myNumbers[10]); } catch (Exception e) { System.out.println("Вы обратились к элементу массива, индекс которого больше, чем длина массива."); };
Калькулятор деления a на b, оформляем бесконечный цикл, защита от деления на 0 и ввода символов вместо чисел;
Расчет периметра прямоугольника, защита от ввода символов вместо числа и ввода отрицательных чисел;
Использование debugger на примере задачи про шахматную доску.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lektion_13_02 {
    public static void main(String[] args) {

//        try { //  Block of code to try } catch(Exception e) { //  Block of code to handle errors }
/*
        int[] myArr = {10, 20, 30};
        for (int i = 0; i < myArr.length; i++){
            System.out.println(" "+i);
        }

        try {
        System.out.println(myArr[4]);

        } catch(Exception e) {
            System.out.println("Ошибка: "+e.getMessage()+". Выход за пределы массива!");
        }

//------------------------------------------------------------------


        char ch;

        while (true){

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number a : ");
                int a = scanner.nextInt();

                System.out.println("Input number b : ");
                int b = scanner.nextInt();

                int c = div(a,b);
                System.out.println("Частное a/b = "+c);

            } catch(ArithmeticException ex) {
                System.out.println("Ошибка: " + ex.getMessage() + ". Делить на ноль нельзя!");
            } catch(InputMismatchException e) {
                System.out.println("Ошибка: "+e.getMessage()+". Нельзя вводить символы!");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Продолжить ? y/n");
            ch = scanner.next().toLowerCase().charAt(0);            //////// ввод символа !!!!!
            if (ch == 'n') break;
            else continue;

        }
    }

    public static int div(int nu1, int num2){
        return nu1/num2;
    }

 */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a : ");
            int a = scanner.nextInt();

            System.out.println("Input b : ");
            int b = scanner.nextInt();

            if (( a < 0) || (b < 0)){
                System.out.println("Вы ввели отрицательное число!");
            }


            int p = 2*(a+b);
            System.out.println("Периметр = "+p);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
        }
    }
}
