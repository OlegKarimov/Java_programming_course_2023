import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Цель: Создать конвертер валют.

Алгоритм:
   1. завести переменные
   2. сделать интерфейс (1 посмотреть курс, 2 сделать конвертацию, 3 добавить валюту)
   3. сделать "защиту от дурака" (от неправильного ввода)
   3. зациклить программу "на продолжение да/нет", протестировать
   3. реализовать главные методы (1 посмотреть курс, 2 сделать конвертацию, 3 добавить валюту)
   5. протестировать все функции программы (1 посмотреть курс, 2 сделать конвертацию, 3 добавить валюту),
      проверка на некорректный ввод.

        */

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> curValue = new HashMap<>();
        curValue.put("EUR", 1.0);
        curValue.put("USD", 1.06);
        curValue.put("CHF", 0.99);
        curValue.put("UAH", 38.86);
        curValue.put("GBP", 0.88);
        curValue.put("ILS", 3.84);
        curValue.put("PLN", 4.74);
        curValue.put("CAD", 1.44);
        curValue.put("CNY", 7.32);
        curValue.put("JPY", 143.19);

        HashMap<String, String> currency = new HashMap<>();
        currency.put("EUR", "Евро");
        currency.put("CHF", "Франк Швейцария");
        currency.put("USD", "Доллар CША");
        currency.put("UAH", "Гривна");
        currency.put("GBP", "Фунт стерлингов");
        currency.put("ILS", "Шекель ");
        currency.put("PLN", "Злотый Польша");
        currency.put("CNY", "Юань");
        currency.put("CAD", "Доллар Канада");
        currency.put("JPY", "Иена");

        boolean keyExit = true;
        while (keyExit) {
            System.out.println("--------------------------------------------");
            System.out.println("Это программа конвертации валюты.");
            System.out.println("--------------------------------------------");
            System.out.println("Меню. Выберите действие.");
            System.out.println("1 посмотреть курс.");
            System.out.println("2 сделать конвертацию.");
            System.out.println("3 добавить валюту.");

            Scanner scanner;
            try {

                scanner = new Scanner(System.in);
                int key = scanner.nextInt();

                switch (key) {
                    case (1):
                        kursVal(curValue, currency);        // 1 посмотреть курс
                        break;
                    case (2):
                        konvertVal(curValue, currency);     // 2 сделать конвертацию.
                        break;
                    case (3):
                        curValue = addVal(curValue, currency);  // 3 добавить валюту.
                        kursVal(curValue, currency);            // вывод на экран новый список курса валют
                        break;
                    default:
                        System.out.println("Некорректный ввод.");
                        break;
                }

            } catch (InputMismatchException e) {                // проверка на некорректный ввод
                System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
            }
            System.out.println();
            System.out.println("Хотите продолжить? y/n");
            scanner = new Scanner(System.in);
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'n') break;
            else continue;
        }
    }

    //---------------------------------------------------------------------------------
    public static void kursVal(HashMap<String, Double> curValue, HashMap<String, String> currency) {
        System.out.println("");
        System.out.println("Курс валют относительно евро:");
        System.out.println();

        for (String i : curValue.keySet()) {
            System.out.println("Валюта: " + i + " курс: " + curValue.get(i));
        }
    }

    //---------------------------------------------------------------------------------
    public static void konvertVal(HashMap<String, Double> curValue, HashMap<String, String> currency) {
        System.out.println("Введите валюту, которую вы хотите конвертировать:");
        for (String i : curValue.keySet()) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        key = key.toUpperCase();

        System.out.println("Введите сумму");
        scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        if (key.equals("EUR")) {
            for (String i : curValue.keySet()) {
                System.out.println("В валюте " + i + " сумма:  " + curValue.get(i) * sum);
            }
        } else if (curValue.get(key) != null) {
            double indexVal = curValue.get(key);
            indexVal = 1 / indexVal;
            for (String i : curValue.keySet()) {
                System.out.println();
                System.out.printf("В валюте " + i + " сумма:  " + "%.2f", curValue.get(i) * indexVal * 100);
            }
        } else System.out.println("Некорректный ввод.");
    }

    //---------------------------------------------------------------------------------
    public static HashMap<String, Double> addVal(HashMap<String, Double> curValue, HashMap<String, String> currency) {
        System.out.println("Введите название валюты");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.toUpperCase();

        System.out.println("Введите курс валюты по отношению к Евро:");
        scanner = new Scanner(System.in);
        double kurs = scanner.nextDouble();

        curValue.put(name, kurs);
        System.out.println();
        System.out.println("Валюта внесена в базу.");

        return curValue;
    }
}