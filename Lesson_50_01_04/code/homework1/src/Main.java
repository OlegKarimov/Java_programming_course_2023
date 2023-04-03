import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Здача 1. Добавить поля с локальной датой и временем в те классы,
// которые использовались в проектах или в домашних заданиях.
//
//Задача 2. Задача на условие, switch case Создать "Бот-помощник",
// коорый помогает сортировать мусор. На входе - наименование выбрасываемого мусора,
// на выходе сообщение, в какого цвета урну нужно отправить этот мусор. Если выбрасывается стекло
// (бутылки, банки и т.д.), то бот должен запросить цвет и указать, куда выбросить цветное стекло.
//
//Задача 3 (*). Цикл while // Вводится натуральное число. Напечатать, из каких цифр оно состоит.
// Пример: // 5329 - это число // 5 // 3 // 2 // 9 // - это цифры, из которого состоит число
public class Main {
    public static void main(String[] args) {

        System.out.println("Input number");

        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println();
            System.out.print(num + " is : ");
            while (!(num == 0)) {
                arrayList.add(num % 10);
                num = num / 10;
            }
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                System.out.print(arrayList.get(i) + " , ");
            }

        } catch (InputMismatchException e) {                // проверка на некорректный ввод
            System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
        }
        System.out.println();
    }
}
