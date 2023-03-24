import java.io.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        System.out.println("Работа с файлами");
        String path = "Lesson_47_24_03/code/file_io_example/src/";
        String file = "data.txt";
        String str = "Asdf";
        String str1;


        crateFile(path, file);
        save_to_file(path, file, str);
        str1 = readDataFromFile(path, file);
        System.out.println(str1);
    }

    private static void crateFile(String path, String fileName) {
        try {
            File myFile = new File(path + fileName); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (
                IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void save_to_file(String path, String fileName, String str) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName);
            // здесь будем толкать строки в файл
            myWriter.write(str);
            // myWriter.write(Paths.get(path + fileName), str.getBytes(), StandardOpenOption.APPEND);
            myWriter.close();

            // System.out.println("Успешная запись в файл.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            System.out.println();
            e.printStackTrace();
        }
    }

    private static String readDataFromFile(String path, String fileName) {
        String data = "";
        try {

            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); // считываем строку
                // System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }
}