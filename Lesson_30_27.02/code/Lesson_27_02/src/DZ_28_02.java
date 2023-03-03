import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DZ_28_02 {
    public static void main(String[] args) {

//  Задача 4 (***)
//Сделать первод из десятичной системы в двенадцатиричную. Число 11 отображается как A, число 12 - B.
// В двенадцатиричной системе используются следующие цифры: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A,B

        Scanner sc = new Scanner(System.in);

        boolean key = true;
        while (key) {
            System.out.println();
            System.out.println("Введите десятичное число:");
            try {
                int inputInt = sc.nextInt();
                if (inputInt >= 0) {
                    ArrayList<Character> resArrChar = new ArrayList<Character>();

                    resArrChar = get_binary_number(inputInt);  // получение массива цифр 12ричного числа из int,

                    print_binary_number(resArrChar);     //  метод печати 12ричного числа
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

    public static void print_binary_number(ArrayList<Character> resultTrueArr) {
        System.out.println();
        System.out.print("Двенадцатиричное число: ");
        for (Character i : resultTrueArr) {
            System.out.print(i);
        }
    }

    public static ArrayList<Character> get_binary_number(int inputInt) {
        ArrayList<Character> resArrChar = new ArrayList<Character>();
        String str = "0123456789ab";

        if (inputInt == 0) {
            resArrChar.add(0, '0');
        } else {
            int buf = 0;
            while (inputInt > 0) {
                buf = inputInt % 12;
                inputInt = inputInt / 12;

                for (int i = 0; i < str.length(); i++) {
                    if (buf == i) {
                        resArrChar.add(str.charAt(i));
                    }
                }

            }
        }
        Collections.reverse(resArrChar);
        return resArrChar;
    }
}
