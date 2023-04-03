import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Metods {
    private static String pathUsers = "Lesson_43_17_03/code/internet_shop/src/dataUsers.txt";
    private static String pathProducts = "Lesson_43_17_03/code/internet_shop/src/dataProducts.txt";
    private static String pathCategory = "Lesson_43_17_03/code/internet_shop/src/dataCategory.txt";
    private static ArrayList<Product> arrayListProducts = new ArrayList<Product>(); // список товаров

    public static boolean user_exist(String name, String password) {

        return false;
    }

    public static String new_user_registration() {      // регистрация нового пользователя
        // доделать проверку на повторяющихся пользователей
        // доделать запрет на имя Admin

        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String userRegistrationName = scanner.nextLine();
        System.out.println("Введите имя пароль");
        String userRegistrationPassword = scanner.nextLine();

        // шифруем логин и пароль, между ними знак ° разделитель
        String stringCoding = string_coding(userRegistrationName + "°" + userRegistrationPassword);

        add_string_to_file(pathUsers, stringCoding);

        return userRegistrationName;
    }

    public static void save_arrayProducts_to_file(ArrayList<Product> arrayListProducts) {
        ArrayList<String> tabOfString = new ArrayList<>();
        for (Product i : arrayListProducts) {
            String stringCoding = string_coding(i.getName() + "°" + i.getPrise() + "°" + i.getRating());
            tabOfString.add(stringCoding);
        }
        try {
            FileWriter myWriter = new FileWriter(pathProducts);
            for (String i : tabOfString) {
                myWriter.write(i + '\n');
            }
            myWriter.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while working with the file " + pathProducts, "Error", JOptionPane.PLAIN_MESSAGE);
//            e.printStackTrace();
        }
    }

    public static void add_category_to_file(Category category) {
        String bufString = "";
        ArrayList<Product> bufProducts = new ArrayList<>();
        bufProducts = category.getProducts();
        bufString = category.getName();
        for (Product i : bufProducts) {
            bufString += "°" + i.getName() + "°" + i.getPrise() + "°" + i.getRating();
        }
        bufString = string_coding(bufString);
        add_string_to_file(pathCategory, bufString);
    }


    public static void add_product_to_file(Product product) {
        // кодируем продукт в строку
        String stringCoding = string_coding(product.getName() + "°" + product.getPrise() + "°" + product.getRating());
        add_string_to_file(pathProducts, stringCoding);
    }

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

    public static void add_string_to_file(String path, String str) {
        ArrayList<String> tabOfString = new ArrayList<>();
        try {
            File myObj = new File(path);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    tabOfString.add(myReader.nextLine());  // считываем то что было в файле построчно в массив
                }
                myReader.close();
            }

            tabOfString.add(str);
            FileWriter myWriter = new FileWriter(path);
            for (String i : tabOfString) {
                myWriter.write(i + '\n');
            }
            myWriter.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while working with the file " + path, "Error", JOptionPane.PLAIN_MESSAGE);
//            e.printStackTrace();
        }
    }


    public static ArrayList<String[]> from_products_to_arrayList(ArrayList<Product> arrayProducts) {
        ArrayList<String[]> arrayList = new ArrayList<>();
        int j = 1;
        for (Product i : arrayProducts) {
            String[] str = {Integer.toString(j), i.getName(), Double.toString(i.getPrise()), Integer.toString(i.getRating())};
            arrayList.add(str); //добавляем строку таблицы в виде массива строк
            j++;
        }
        return arrayList;
    }

    public static String[] from_namesCategory_to_arrayList(ArrayList<Category> arrayListCategory) {
        ArrayList<String> bufArrList = new ArrayList<>();
        bufArrList.add("All category");
        for (Category i : arrayListCategory) {
            bufArrList.add(i.getName());
        }
        String[] resArrayStr = new String[bufArrList.size()];
        for (int i = 0; i < bufArrList.size(); i++) {
            resArrayStr[i] = bufArrList.get(i);
        }
        return resArrayStr;
    }

    public static ArrayList<Category> read_category_from_file() {
        ArrayList<Category> arrayListBufCategory = new ArrayList<>();
        String buf = "";
        try {
            File myObj = new File(pathCategory);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    buf = myReader.nextLine();  // считываем то что было в файле построчно
                    buf = string_decoding(buf);  // декодируем
                    String[] bufArray = buf.split("°");
                    Category bufCategory = new Category();
                    bufCategory.setName(bufArray[0]);
                    ArrayList<Product> bufArrayProducts = new ArrayList<>();
                    for (int i = 1; i < bufArray.length - 3; i = i + 3) { // считываем массив продуктов
                        Product bufProduct = new Product();
                        bufProduct.setName(bufArray[i]);
                        bufProduct.setPrise(Double.parseDouble(bufArray[i + 1]));
                        bufProduct.setRating(Integer.parseInt(bufArray[i + 2]));
                        bufArrayProducts.add(bufProduct);
                    }
                    bufCategory.setProducts(bufArrayProducts);
                    arrayListBufCategory.add(bufCategory);
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while working with the file " + pathCategory, "Error", JOptionPane.PLAIN_MESSAGE);
//            e.printStackTrace();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occurred parseDouble or parseInt", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        return arrayListBufCategory;
    }

    public static ArrayList<Product> read_products_from_file() {
        ArrayList<Product> arrayListBufProducts = new ArrayList<>();
        String buf = "";
        try {
            File myObj = new File(pathProducts);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    buf = myReader.nextLine();  // считываем то что было в файле построчно
                    buf = string_decoding(buf);  // декодируем
                    String[] bufArray = buf.split("°");
                    Product bufProduct = new Product();
                    bufProduct.setName(bufArray[0]);
                    bufProduct.setPrise(Double.parseDouble(bufArray[1]));
                    bufProduct.setRating(Integer.parseInt(bufArray[2]));
                    arrayListBufProducts.add(bufProduct);
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while working with the file " + pathProducts, "Error", JOptionPane.PLAIN_MESSAGE);
//            e.printStackTrace();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occurred parseDouble or parseInt", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        return arrayListBufProducts;
    }


    public static String string_coding(String str) {  // шифрование строки
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            int buf = (int) str.charAt(i) + 5;
            if (i == (str.length() - 1)) {
                strReturn = strReturn + buf;
            } else strReturn = strReturn + buf + " ";
        }
        return strReturn;
    }

    public static String string_decoding(String str) {  // расшифрование строки
        String strReturn = "";
        String[] arreyStr = str.split(" ");
        for (String i : arreyStr) {
            int buf = Integer.parseInt(i) - 5;
            strReturn = strReturn + (char) buf;
        }
        return strReturn;
    }

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

    public static void dell_category() {

    }

    public static void add_produkt() {

    }

    public static void dell_produkt() {

    }
}
