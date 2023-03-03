import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Список дел");
        // TODO LIST - список дел
        // Меню:
        // - добавить запись
        // - посмотреть записи
        // - удалить запись (по номеру)
        // - выйти
        enum Menu {
            ADD_RECORD,
            PRINT_RECORDS,
            DELETE_RECORD,
            EXIT,
        }

        List<String> todoList = new ArrayList<>(); // инициируем лист для списка задач

        while (true) { // начало цикла работы с пользователем
            // печатаем меню
            for (Menu myMenu : Menu.values()) {
                System.out.print(myMenu + " | ");
            }
            System.out.println();
            System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");
            int choice = readMenuChoice(); // что выбрал пользователь
            Menu myMenu = Menu.ADD_RECORD;
            // выбор пользователя опции из меню
            switch (choice) {
                case 1: {
                    myMenu = Menu.ADD_RECORD;
                    add_task(todoList);
                    print_tasks(todoList);
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT_RECORDS;
                    print_tasks(todoList);
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE_RECORD;
                    remove_task(todoList);
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("До свидания!");
                    return;
                }
            }
        }

    }

    // метод добавляет задачу в список
    public static void add_task(List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.next();
        tasks.add(task);
    }

    // метод печатает список задач
    public static void print_tasks(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1; // задаем номер задачи
            System.out.println(n + ". " + tasks.get(i)); // печатаем номер и текст задачи
        }
        if (tasks.size() == 0) {
            System.out.println("Задач нет, начните их добавлять.");
        }
    }

    // метод удаляет задачу из списка
    public static void remove_task(List<String> tasks) {
        System.out.println("Выберите задачу для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num < 1 || task_num > tasks.size()) { // pf защита от неверного ввода
            System.out.println("Неверный номер задачи для удаления.");
            return;
        } else {
            int n = task_num - 1; // вычисляем индекс удаляемой задачи
            tasks.remove(n); // удаляем задачу с индексом n
        }
    }

    // метод считывает выбор пользователя из меню
    public static int readMenuChoice() {
        Scanner sc = new Scanner(System.in);
        int menu_choice = 0;
        try {
            menu_choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить числа, а не символы");
        }
        return menu_choice;
    }

}