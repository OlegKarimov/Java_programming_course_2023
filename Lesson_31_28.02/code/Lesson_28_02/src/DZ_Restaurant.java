import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DZ_Restaurant {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш ресторан!");
        // Небольшой ресторан, в котором имеется 5 столиков, хочет внедрить у себя вежливого
        // телефонного администратора (бота), который:
        // - принимает звонок от потенциального клиента;
        // - сообщает о наличии свободных стликов;
        // - при желании клиента выполняет бронирование столика.

        HashMap<Integer, Boolean> tables = new HashMap<Integer, Boolean>();
        String patch = "C:\\Users\\AIT TR Student\\Documents\\GitHub\\Java_programming_course_2023\\Lesson_28_02\\src";
        String fileName = "tables_status.txt";

        // все столы свободны (не заняты)
        tables.put(1, false);
        tables.put(2, false);
        tables.put(3, false);
        tables.put(4, false);
        tables.put(5, false);

        Scanner sc = new Scanner(System.in);

        boolean keyExit = true;
        while (keyExit) {

            System.out.println("Здравствуйте!");
            boolean is_full = false;

            get_table_status_from_file(tables, patch + fileName);   // считывание статуса столиков из файла

            // Проверка на наличие свободных столиков
            is_full = is_full(tables, 5);

            if (!is_full) {
                System.out.println("У нас есть свободные столики!");
            } else {
                System.out.println("Извините, у нас все столики заняты.");
            }

            print_table_status(tables); // метод печатает статус столов

            System.out.println("Выберите номер столика: ");     // запрос к пользователю
            int table_num = sc.nextInt();

            reserv_table(tables, table_num); // метод, который резервирует стол
            create_file(patch, fileName); // создаем файл

            // ________________________
            save_table_status(tables, patch + fileName); // сохраним статус столов в файле
            // ________________________

            print_table_status(tables);

            System.out.println();
            System.out.println("Хотите продолжить? y/n");
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'n') break;
            else continue;
        }
    }

    public static void reserv_table(HashMap<Integer, Boolean> map, int num) {
        if (map.get(num).equals(false)) {
            map.put(num, true);
            System.out.println("Столик " + num + " зарезервирован.");
            //       return;
        } else {
            System.out.println("Столик " + num + " уже зарезервирован.");
            //     return;
        }
    }

    public static void print_table_status(HashMap<Integer, Boolean> map) {
        for (Object i : map.keySet()) {
            String status = "";
            if (map.get(i).equals(true)) {
                status = " зарезервирован ";
            } else {
                status = " свободен ";
            }
            System.out.println("Столик: " + i + " статус: " + status);
        }
    }

    public static boolean is_full(HashMap<Integer, Boolean> map, int num) {
        boolean is_full = true;
        for (int i = 1; i < 6; i++) {
            if (map.get(i) == false) {
                is_full = false;
            }
        }
        // если все столики зарезервированы, то есть все values в map == true
        return is_full;
        // иначе return false;
    }

    //________________________
    // в этом методе надо считать строки из файла занести их в HashMap tables
    // требуется реализовать


    //______________________________
    public static void save_table_status(HashMap<Integer, Boolean> map, String patch) {
        try {
            FileWriter myWriter = new FileWriter(patch);
            // здесь будем толкать строки в файл
            for (Object i : map.keySet()) {
                myWriter.write(i + ":" + map.get(i) + '\n');
            }
            myWriter.close();
            System.out.println("Успешная запись в файл.");
            System.out.println();
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            System.out.println();
            e.printStackTrace();
        }
    }

    public static void get_table_status_from_file(HashMap<Integer, Boolean> map, String patch) {
        // считывание статуса столиков из файла

        try {
            File myObj = new File(patch);

            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    int i = Integer.parseInt(data.substring(0, 1));
                    String str = data.substring(2);
                    if (str.equals("true")) {
                        map.put(i, true);
                    } else if (str.equals("false")) {
                        map.put(i, false);
                    }
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    public static void create_file(String patch, String file_name) {
        //_______________________________
        // Подготовка к сохранению статуса столов - создание файла

        try {
            File myFile = new File(patch + file_name); // Укажите свое имя файла
            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }

}
