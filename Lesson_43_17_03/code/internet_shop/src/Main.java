//**Интернет магазин, часть 1**
//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//Создать класс Категория, имеющий переменные имя и массив товаров.
//Создать несколько объектов класса Категория.
//Создать класс Basket, содержащий массив купленных товаров.
//Создать класс User, содержащий логин, пароль и объект класса Basket.
//Создать несколько объектов класса User.

//Вывести на консоль каталог продуктов.
//Вывести на консоль покупки посетителей магазина.

import java.util.ArrayList;


public class Main {

    private static boolean keyExit = true;
    private static String pathUsers = "Lesson_43_17_03/code/internet_shop/src/dataUsers.txt";
    private static String pathProducts = "Lesson_43_17_03/code/internet_shop/src/dataProducts.txt";
    private static String pathCategory = "Lesson_43_17_03/code/internet_shop/src/dataCategory.txt";

    public static ArrayList<Category> arrayListCategory = new ArrayList<Category>(); // список категорий
    public static ArrayList<Product> arrayListProducts = new ArrayList<Product>(); // список товаров


    public static void main(String[] args) {


        new Form1();


//        MainForm mainForm = new MainForm("Admin"); //
//        mainForm.setVisible(true);

//        form1.setVisible(true);
//        new Form1().setVisible(true);
        // Form1 form1 = new Form1();
//        form1.setVisible(true);
//
//        LoginForm loginForm = new LoginForm();
//        loginForm.setVisible(true);
//        do {
        //     userName = loginForm.getUserName();
//        } while (userName == null);

//        loginForm.dispose();

//        loginForm.setVisible(false);



/*        userName = initialization();

        while (keyExit) {
            if (userName.equals("Admin")) {
                admin_menu();
            }
            user_menu();*/

//            Product pen = new Product("Ручка", 0.1, 5);
//            Product pencil = new Product("Карандаш", 0.1, 6);
//            Product notebook = new Product("Тетрадь", 0.2, 8);
//
//            Product drill = new Product("Дрель", 20, 7);
//            Product hammer = new Product("Молоток", 10, 6);
//
//            Product cola = new Product("Coca Cola", 2, 7);
//            Product sprite = new Product("Sprite", 2, 7);
//            Product fanta = new Product("Fanta", 2, 7);

//            ArrayList<Product> arrayListStationery = new ArrayList<>(Arrays.asList(pen, pencil, notebook));
//            Category stationeryKategory = new Category("Канцтовары", arrayListStationery);
//
//            ArrayList<Product> arrayListTools = new ArrayList<>(Arrays.asList(drill, hammer));
//            Category toolsKategory = new Category("Инструменты", arrayListTools);
//
//            ArrayList<Product> arrayListDrinks = new ArrayList<>(Arrays.asList(cola, sprite, fanta));
//            Category drinksKategory = new Category("Напитки", arrayListDrinks);
//
//            ArrayList<Product> productArrayListUser1 = new ArrayList<>(Arrays.asList(cola, drill, pen));
//            Basket basketUser1 = new Basket(productArrayListUser1);
//            User user1 = new User("Вася", "log1", "pass1", basketUser1);
//
//            System.out.println(stationeryKategory);
//            System.out.println(toolsKategory);
//            System.out.println(drinksKategory);
//            System.out.println();
//
//            System.out.println(user1);
//      }

//    }
//
//    public static void admin_menu() {
//        boolean categoryExist = true;  // существуют ли категории
//        boolean productsExist = true;  // существуют ли продукты
//
//        categoryExist = category_exist(arrayListCategory, pathCategory);
//        productsExist = products_exist(arrayListProducts, pathProducts);
//
//        System.out.println();
//        System.out.println("--------------------------------------------");
//        System.out.println(userName + ", добро пожаловать в наш магазин.");
//        while (keyExit) {
//            System.out.println("--------------------------------------------");
//            System.out.println("Стелайте выбор:");
//            System.out.println("1 - показать категории товаров");
//            System.out.println("2 - показать все товары");
//            System.out.println("3 - добавить категорию товара");
//            System.out.println("4 - удалить категорию товара");
//            System.out.println("5 - добавить товар");
//            System.out.println("6 - удалить товар");
//            System.out.println("7 - выход");
//
//            Scanner scanner;
//            try {
//                scanner = new Scanner(System.in);
//                int key = scanner.nextInt();
//
//                switch (key) {
//                    case (1):
//                        if (categoryExist) {
//                            print_list_category(arrayListCategory);      // печать названий всех категорий
//                            print_selected_category(arrayListCategory);  // выбор категории и печать товаров в ней
//                            break;
//                        } else {
//                            System.out.println("Категорий нет. Добавьте категории.");
//                            break;
//                        }
//                    case (2):
//                        if (productsExist) {
//                            print_product_sort(arrayListProducts);
//                            break;
//                        } else {
//                            System.out.println("Товаров нет. Добавьте товар.");
//                            break;
//                        }
//                    case (3):
//                        add_category();
//                        break;
//                    case (4):
//                        dell_category();
//                        break;
//                    case (5):
//                        add_produkt();
//                        break;
//                    case (6):
//                        dell_produkt();
//                        break;
//                    case (7):
//                        keyExit = false;
//                        break;
//                    default:
//                        System.out.println("Некорректный ввод.");
//                        break;
//                }
//
//            } catch (InputMismatchException e) {                // проверка на некорректный ввод
//                System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void add_category() {
//        System.out.println("Добавление категории.");
//        System.out.println("Введите название категории:");
//        Scanner scanner = new Scanner(System.in);
//        String nameCat = scanner.nextLine();
//
//
//    }
//
//    public static void dell_category() {
//
//    }
//
//    public static void add_produkt() {
//
//    }
//
//    public static void dell_produkt() {
//
//    }
//
//    public static void print_selected_category(ArrayList<Category> arrayListCat) {
//        System.out.println();
//        System.out.println("Выберите категорию для печати. Введите от 1 до " + arrayListCat.size());
//
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int key = scanner.nextInt();
//
//            if ((key >= 1) && (key <= arrayListCat.size())) {
//                System.out.println(arrayListCat.get(key).toString());
//            }
//
//        } catch (InputMismatchException e) {                // проверка на некорректный ввод
//            System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
//        }
//        System.out.println();
//    }
//
//    public static void print_list_category(ArrayList<Category> arrayListCat) {
//        System.out.println();
//        Collections.sort(arrayListCat, new CategorySortByName());
//        System.out.println("Категории товаров:");
//        int j = 1;
//        for (Category i : arrayListCat) {
//            System.out.println(j + ". " + i.getName());
//        }
//    }
//
//    public static void print_product_sort(ArrayList<Product> arrayListProd) {
//        System.out.println();
//        Collections.sort(arrayListProd, new ProductsSortByName());
//        System.out.println("Все товары:");
//        for (Product i : arrayListProd) {
//            System.out.println(i.toString());
//        }
//        System.out.println("Сделайте выбор:");
//        System.out.println("1 - отсортировать по цене");
//        System.out.println("2 - отсортировать по рейтингу");
//        System.out.println("3 - выход");
//
//        boolean exit = true;
//
//        while (exit) {
//
//            Scanner scanner;
//            try {
//                scanner = new Scanner(System.in);
//                int key = scanner.nextInt();
//
//                switch (key) {
//                    case (1):
//                        System.out.println();
//                        System.out.println("--------------------------------------------");
//                        Collections.sort(arrayListProd, new ProductsSortByPrise());
//                        System.out.println("Все товары отсортированы по цене:");
//                        for (Product i : arrayListProd) {
//                            System.out.println(i.toString());
//                        }
//                        break;
//
//                    case (2):
//                        System.out.println();
//                        System.out.println("--------------------------------------------");
//                        Collections.sort(arrayListProd, new ProductsSortByRating());
//                        System.out.println("Все товары отсортированы по рейтингу:");
//                        for (Product i : arrayListProd) {
//                            System.out.println(i.toString());
//                        }
//                    case (3):
//                        exit = false;
//                        break;
//                    default:
//                        System.out.println("Некорректный ввод.");
//                        break;
//                }
//
//            } catch (InputMismatchException e) {                // проверка на некорректный ввод
//                System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
//            }
//            System.out.println();
//        }
//    }
//
//    public static boolean category_exist(ArrayList<Category> arrayListCat, String pathCategory) {
//        boolean resultExist = true;
//        return resultExist;
//    }
//
//    public static boolean products_exist(ArrayList<Product> arrayListProd, String pathProducts) {
//        boolean resultExist = true;
//
//        return resultExist;
//    }
//
//    public static void user_menu() {
//        System.out.println();
//        System.out.println("--------------------------------------------");
//        System.out.println(userName + ", добро пожаловать в наш магазин.");
//        while (keyExit) {
//            System.out.println("--------------------------------------------");
//            System.out.println("Стелайте выбор:");
//            System.out.println("1 - показать категории товаров");
//            System.out.println("2 - показать все товары");
//            System.out.println("3 - выход");
//
//            Scanner scanner;
//            try {
//                scanner = new Scanner(System.in);
//                int key = scanner.nextInt();
//
//                switch (key) {
//                    case (1):
//                        //        return user_verification();
//                        break;
//                    case (2):
//                        //        return new_user_registration();
//                        break;
//                    case (3):
//                        keyExit = false;
//                        break;
//                    default:
//                        System.out.println("Некорректный ввод.");
//                        break;
//                }
//
//            } catch (InputMismatchException e) {                // проверка на некорректный ввод
//                System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
//            }
//            System.out.println();
//        }
//    }
//
//    public static String initialization() {
//        System.out.println("--------------------------------------------");
//        System.out.println("Интернет магазин");
//
//        while (keyExit) {
//            System.out.println("--------------------------------------------");
//            System.out.println("Стелайте выбор:");
//            System.out.println("1 - войти");
//            System.out.println("2 - зарегистрироваться");
//            System.out.println("3 - выход");
//
//            Scanner scanner;
//            try {
//
//                scanner = new Scanner(System.in);
//                int key = scanner.nextInt();
//
//                switch (key) {
//                    case (1):
////                        String userVerif = user_verification();
////                        if (userVerif == null) {
////                            System.out.println("Нет такого пользователя.");
////                        } else {
////                            return user_verification();
////                        }
//                    case (2):
//                        return new_user_registration();
//                    case (3):
//                        keyExit = false;
//                        break;
//                    default:
//                        System.out.println("Некорректный ввод.");
//                        break;
//                }
//
//            } catch (InputMismatchException e) {                // проверка на некорректный ввод
//                System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
//            }
//            System.out.println();
////            System.out.println("Хотите продолжить? y/n");
////            scanner = new Scanner(System.in);
////            char ch = scanner.next().toLowerCase().charAt(0);
////            if (ch == 'n') break;
////            else continue;
//
//        }
//        return null;
//    }


//    public static String user_verification() {
//
//        System.out.println("Введите логин:");
//        Scanner scanner = new Scanner(System.in);
//        String userVerificationName = scanner.nextLine();
//
//        System.out.println("Введите пароль:");
//        scanner = new Scanner(System.in);
//        String userVerificationPassword = scanner.nextLine();
//
//        if ((userVerificationName.equals("Admin")) && (userVerificationPassword.equals("qaywsx"))) {
//            return "Admin";
//        } else {
////            if (user_exist(userVerificationName, userVerificationPassword)) { // если пользователь существует
//            return userVerificationName;
//        }
////        }
////        return null;
//    }

//    public static boolean user_exist(String name, String password) {
//
//        return true;
//    }

//    public static String new_user_registration() {      // регистрация нового пользователя
//        // доделать проверку на повторяющихся пользователей
//        // доделать запрет на имя Admin
//
//        System.out.println("Введите имя пользователя");
//        Scanner scanner = new Scanner(System.in);
//        String userRegistrationName = scanner.nextLine();
//        System.out.println("Введите имя пароль");
//        String userRegistrationPassword = scanner.nextLine();
//
//        // шифруем логин и пароль, между ними знак ° разделитель
//        String stringCoding = string_coding(userRegistrationName + "°" + userRegistrationPassword);
//
//        save_string_to_file(pathUsers, stringCoding);
//
//        return userRegistrationName;
//    }
//
//    private static void crateFile(String path) {
//        try {
//            File myFile = new File(path); // Укажите свое имя файла
//
//            if (myFile.createNewFile()) {
//                System.out.println("File created: " + myFile.getName());
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch (
//                IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }
//    }
//
//    public static void save_string_to_file(String path, String str) {
//        ArrayList<String> tabOfString = new ArrayList<>();
//        try {
//            File myObj = new File(path);
//            if (myObj.exists()) {
//                Scanner myReader = new Scanner(myObj);
//                while (myReader.hasNextLine()) {
//                    tabOfString.add(myReader.nextLine());  // считываем то что было в файле построчно в массив
//                }
//                myReader.close();
//                tabOfString.add(str);
//            }
//
//            FileWriter myWriter = new FileWriter(path);
//            for (String i : tabOfString) {
//                myWriter.write(i + '\n');
//            }
//            myWriter.close();
//
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка работы с файлом " + path);
//            System.out.println();
//            e.printStackTrace();
//        }
//    }
////
////    private static String readDataFromFile(String path, String fileName) {
////        String data = "";
////        try {
////
////            File myFile = new File(path + fileName);
////            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
////            while (myReader.hasNextLine()) {
////                data = myReader.nextLine(); // считываем строку
////                // System.out.println(data); // печатаем считанную строку
////            }
////            myReader.close();
////        } catch (FileNotFoundException e) {
////            System.out.println("Произошла ошибка.");
////            e.printStackTrace();
////        }
////        return data;
////    }
//
//
//    public static String string_coding(String str) {  // шифрование строки
//        String strReturn = "";
//        for (int i = 0; i < str.length(); i++) {
//            int buf = (int) str.charAt(i) + 5;
//            strReturn = strReturn + buf + " ";
//        }
//        return strReturn;
//    }
//
//    public static String string_decoding(String str) {  // расшифрование строки
//        String strReturn = "";
//        String[] arreyStr = str.split(" ");
//        for (String i : arreyStr) {
//            int buf = Integer.parseInt(i) - 5;
//            strReturn = strReturn + (char) buf;
//        }
//        return strReturn;
//    }

    }
}