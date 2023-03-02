import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static <InputMismatchException extends Throwable> void main(String[] args) {

// Задча 1. Сделать перевод двоичного числла в десятичное.

        System.out.println("Введите двоичное число:");

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        boolean flag = true;     // ввели только 0 и 1
        ArrayList<Byte> myArr = new ArrayList<Byte>();

        for (int i = 0; i < inputStr.length(); i++) {      // цикл проверки ввода только 0 или 1
            char charI = inputStr.charAt(i);
            if (charI == '0') {
                myArr.add((byte) 0);
            } else if (charI == '1') {
                myArr.add((byte) 1);
            } else {                                // если не 0 или 1 то flag = false
                flag = false;
                break;
            }
        }
        if (flag) {                 //  если flag то были введены только 0 и 1
            int res = 0;
            int j = 0;
            for (int i = myArr.size() - 1; i >= 0; i--) {
                res += (int) Math.pow(2, j) * myArr.get(i);
                j++;
            }
            System.out.printf("Десятичное число: " + res);
        } else {
            System.out.println("Некорректный ввод!");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

//-------------------------------------------------------------------------------------------------
// Задача 2. Сделать калькулятор, который переводит целое десятичное число в двоичное.

        boolean key = true;
        while (key) {
            System.out.println();
            System.out.println("Введите десятичное число:");
            try {
                int inputInt = sc.nextInt();
                if (inputInt >= 0) {
                    ArrayList<Integer> resArr = new ArrayList<Integer>();

                    resArr = get_binary_number(inputInt);  // получение массива цифр двоичного числа из int,

                    print_binary_number(resArr);     //  метод печати двоичного числа
                } else System.out.println("Ошибка ввода : Вы ввели отрицательное число!");

            } catch (java.util.InputMismatchException e) {                // проверка на некорректный ввод
                System.out.println("Ошибка ввода: " + e.getMessage() + ". Нельзя вводить символы!");
            }
            System.out.println();
            System.out.println();
            System.out.println("Хотите продолжить? y/n");
            sc = new Scanner(System.in);
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch == 'n') break;
            else continue;
        }
    }

    public static void print_binary_number(ArrayList<Integer> resultTrueArr) {
        System.out.println();
        System.out.print("Двоичное число: ");
        for (Integer i : resultTrueArr) {
            System.out.print(i);
        }
    }

    public static ArrayList<Integer> get_binary_number(int inputInt) {
        ArrayList<Integer> resArr = new ArrayList<Integer>();
        if (inputInt == 0) resArr.add(0);
        else {
            while (inputInt > 0) {
                resArr.add(inputInt % 2);
                inputInt = inputInt / 2;
            }
        }
        Collections.reverse(resArr);
        return resArr;
    }
}