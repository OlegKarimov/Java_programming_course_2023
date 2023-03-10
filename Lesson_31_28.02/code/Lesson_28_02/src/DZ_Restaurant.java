import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ_Restaurant {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш ресторан!");
        // Небольшой ресторан, в котором имеется 5 столиков, хочет внедрить у себя вежливого
        // телефонного администратора (бота), который:
        // - принимает звонок от потенциального клиента; *
        // - сообщает о наличии свободных стликов;      *
        // - при желании клиента выполняет бронирование столика.  *

        // 2.Бот для ресторана - доработки:
        //
        //Добавить запрос 1 "На имя кого резервировать столик?"     *
        //Добавить запрос 2 "Хотите оставить контактный телефон?"   *
        //Добавить запрос 3 "С какого часа"?                        *
        //Добавить запрос "Еще столик?"  ??????????????????? не нужен !!!!!!!!!!!!!!!!!!!!!!!!!!
        //В главном меню начать с выбора: Резервирование или Отказ от брони  *
        //Добавить функционал "отказа от брони"     *
        //При печати статуса столиков показывать только свободные столики   *
        //Убрать служебные сообщения        *
        //Добавить защиту от неправильного ввода    *
        //Сохраненние статуса столиков в файле, считывание статуса столиков из файла    *

/*
        HashMap<Integer,ArrayList<String>> map = new HashMap<>();
        ArrayList<String> buf = new ArrayList<>();
        buf.add("+");
        map.put(0,buf);

*/

        ArrayList<String> tables = new ArrayList<String>();
        String fileName = "tables_status.txt";

        // все столы свободны (не заняты)
        for (int i = 0; i < 5; i++) {
            tables.add(i, "-");
        }

        Scanner scanner = new Scanner(System.in);

        boolean keyExit = true;
        while (keyExit) {
            System.out.println();
            System.out.println("Вот наши столики : ");
            boolean is_full = false;
            boolean is_empty = false;

            get_table_status_from_file(tables, fileName);   // считывание статуса столиков из файла

            print_table_status(tables); // метод печатает статус столов

            is_full = is_full(tables, 5); // Проверка на наличие свободных столиков

            if (is_full) { // Если всё занято
                System.out.println("Извините, у нас все столики заняты.");
                //  print_table_status(tables); // метод печатает статус столов
                System.out.println("Хотите удалить бронь? y/n");
                // Scanner scanner = new Scanner(System.in);
                char ch = scanner.next().toLowerCase().charAt(0);
                if (ch == 'y') {
                    delite_reserv(tables, fileName);
                    print_table_status(tables); // метод печатает статус столов
                }
            } else {
                System.out.println();
                System.out.println("У нас есть свободные столики!");
                char ch = ' ';
                do {
                    is_empty = is_empty(tables, 5); // Проверка все ли столики пустые
                    if (is_empty) {     // Если всё пусто
                        System.out.println("Для резервирования столика нажмите - r, для выхода нажмите - e");
                    } else {
                        System.out.println("Для резервирования столика нажмите - r, для удаления брони - d, для выхода нажмите - e");
                    }
                    ch = scanner.next().toLowerCase().charAt(0);
                    switch (ch) {
                        case 'e': {
                            keyExit = false;
                            break;
                        }
                        case 'r': {    // резервирования столика
                            main_reserv_tabel(tables, fileName);  // голавный метод резервирования стола
                            print_table_status(tables);
                            break;
                        }
                        case 'd': {
                            if (!is_empty) {
                                delite_reserv(tables, fileName);
                                print_table_status(tables);
                                break;
                            }
                        }
                        default: {
                            System.out.println("Ошибка. Повторите ввод.");
                        }
                    }
                } while (keyExit);
            }
        }
    }

    public static void delite_reserv(ArrayList<String> tables, String fileName) { // удаление брони стола
        int table_num;
        System.out.println();
        print_only_full_table(tables); // Список столиков которые забронированы
        do {
            System.out.println();
            System.out.println("Введите номер столика, с которого хотите снять бронь");
            table_num = readMenueChoice();
            if ((table_num < 1) || (table_num > 5)) {
                System.out.println("Ошибка. Повторите ввод от 1 до 5");
            } else {        // если от 1 до 5
                if (tables.get(table_num - 1).charAt(0) == '-') {
                    System.out.println("Стол номер " + table_num + " уже был свободен.");
                } else {
                    tables.set(table_num - 1, "-");
                    // ________________________
                    create_file(fileName); // создаем файл
                    // ________________________
                    save_table_status(tables, fileName); // сохраним статус столов в файле
                }


            }
        } while ((table_num < 1) || (table_num > 5));

    }

    public static void print_only_empty_table(ArrayList<String> tables) {
        System.out.println("Свободные столики :");
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).charAt(0) == '-') {
                System.out.println("Столик: " + (i + 1) + " статус: свободен");
            }
        }
    }


    public static void print_only_full_table(ArrayList<String> tables) {
        System.out.println("Список столиков которые забронированы :");
        for (int i = 0; i < tables.size(); i++) {
            String status = "";
            if (tables.get(i).charAt(0) == '+') {
                String[] buf = tables.get(i).split("°");
                if (buf.length == 3) {
                    status = " зарезервирован за " + buf[1] + " в " + buf[2];
                } else status = " зарезервирован за " + buf[1] + " в " + buf[3] + ", тел. : " + buf[2];
                System.out.println("Столик: " + (i + 1) + " статус: " + status);
            }
        }
    }

    public static void main_reserv_tabel(ArrayList<String> tables, String fileName) {
        // голавный метод резервирования стола

        int table_num = 0;
        do {
            System.out.println();
            print_only_empty_table(tables);
            System.out.println();
            System.out.println("Выберите номер столика: ");     // запрос к пользователю
            table_num = readMenueChoice();  // читаем выбор пользователя (номер столика)
            if ((table_num < 1) || (table_num > 5)) {
                System.out.println("Ошибка. Повторите ввод от 1 до 5");
            } else {        // если от 1 до 5
                reserv_table(tables, table_num); // метод, который резервирует стол
                // ________________________
                create_file(fileName); // создаем файл
                // ________________________
                save_table_status(tables, fileName); // сохраним статус столов в файле
            }
        } while ((table_num < 1) || (table_num > 5));
    }


    // метод, который считывает выбор пользователя
    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить числа а не символы");
        }
        return menuChoice;
    }

    public static void reserv_table(ArrayList<String> tab, int num) {
        int i = num - 1;
        String strName;
        String strTel = "";
        String strTime;
        if (tab.get(i).charAt(0) == '-') {
            System.out.println("На чьё имя зарезервировать столик?");
            Scanner scanner = new Scanner(System.in);
            strName = scanner.nextLine();
            System.out.println("Хотите оставить контактный телефон? y/n");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch == 'y') {
                System.out.println("Введите номер телефона : ");
                strTel = scanner.nextLine();
            }
            Scanner sr = new Scanner(System.in);
            System.out.println("С какого часа зарезервировать столик?");
            strTime = sr.nextLine();   // сделать ввод даты Date date = formatter.parse(strDate); !!!!

// Собираем строку
            String buf;
            if (strTel.equals("")) {
                buf = "+" + "°" + strName + "°" + strTime;
            } else
                buf = "+" + "°" + strName + "°" + strTel + "°" + strTime;
            tab.set(i, buf); // вставляем на место минуса
            System.out.println("Столик " + num + " зарезервирован.");
        } else {
            System.out.println("Столик " + num + " уже зарезервирован.");
        }
    }

    public static void print_table_status(ArrayList<String> tab) {
        for (int i = 0; i < tab.size(); i++) {
            String status = "";
            if (tab.get(i).charAt(0) == '+') {
                String[] buf = tab.get(i).split("°");
                if (buf.length == 3) {
                    status = " зарезервирован за " + buf[1] + " в " + buf[2];
                } else status = " зарезервирован за " + buf[1] + " в " + buf[3] + ", тел. : " + buf[2];

            } else {
                status = " свободен ";
            }
            System.out.println("Столик: " + (i + 1) + " статус: " + status);
        }
    }

    public static boolean is_full(ArrayList<String> tab, int num) {
        boolean is_full = true;
        for (String i : tab) {
            if (i.charAt(0) == '-') {
                is_full = false;
            }
        }
        // если все столики зарезервированы, то есть все  == + ,то return true
        return is_full;
        // иначе return false;
    }

    public static boolean is_empty(ArrayList<String> tab, int num) {
        boolean is_full = true;
        for (String i : tab) {
            if (i.charAt(0) == '+') {
                is_full = false;
            }
        }
        // если все столики пустые, то есть все  == - ,то return true
        return is_full;
        // иначе return false;
    }

    //______________________________
    public static void save_table_status(ArrayList<String> tab, String patch) {
        try {
            FileWriter myWriter = new FileWriter(patch);
            // здесь будем толкать строки в файл
            for (String i : tab) {
                myWriter.write(i + '\n');
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

    public static void get_table_status_from_file(ArrayList<String> tab, String patch) {
        // считывание статуса столиков из файла
        try {
            File myObj = new File(patch);

            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                int i = 0;
                while (myReader.hasNextLine() && (i < 5)) {
                    String data = myReader.nextLine();
                    tab.set(i, data);
                    i++;
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void create_file(String file_name) {
        //_______________________________
        // Подготовка к сохранению статуса столов - создание файла

        try {
            File myFile = new File(file_name); // Укажите свое имя файла
            myFile.createNewFile();
            //   System.out.println("Файл создан: " + myFile.getName());

            // else {
            // System.out.println("Файл уже существует.");
            // }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

    }
}
