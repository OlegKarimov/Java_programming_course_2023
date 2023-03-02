
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Перевод из 2сс в 10сс  - 1000 ");
        String stringNum = "1000";
        System.out.println("Результат : " + Integer.parseInt(stringNum, 2));

        int n = 1234;
        System.out.println("10 сс : " + n);
        System.out.println("Результат в 2сс : " + Integer.toBinaryString(n));
        System.out.println("Результат в 8сс : " + Integer.toHexString(n));
        System.out.println("Результат в 16сс : " + Integer.toOctalString(n));

        String str = "155";
        n = Integer.parseInt(str); // перевод из строки в число
        System.out.println(str);
        System.out.println();
        System.out.println("---------------------------------------------------------");

// -------------------------------------------------------------------------------------------
// Создание файла !!
        String patch = "C:\\Users\\AIT TR Student\\IdeaProjects\\Lektions_Konsultations_DZ\\Lesson_28_02\\src\\";
        try {
            File myObj = new File(patch + "test.txt");
            if (myObj.createNewFile()) {
                System.out.println("Файл создан : " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

// -------------------------------------------------------------------------------------------
// Запись в файл !!

        try {
            FileWriter myWriter = new FileWriter(patch + "test.txt");
            myWriter.write("1 trdtrdtrdtrdr  zrdzrdzr\n");
            myWriter.write("2 trdtrd  \n");
            myWriter.write("3 уыаыу dtrdr  zrdzrdzr  \n");
            myWriter.close();
            System.out.println("Успешная запись в файл");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

// -------------------------------------------------------------------------------------------
// Чтение из файла !!

        try {
            File myObj = new File(patch + "test.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("В файле было : ");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}