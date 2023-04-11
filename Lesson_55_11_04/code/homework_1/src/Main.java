//1. Есть  текстовый файл.  Написать метод,  читающий файл и
//возвращающий строку, состоящую из строчек этого файла,
//разделенных пробелом.
//Пример текстового файла:
//aaa
//bbbbbbb
//cc
// результат : aaa bbbbbbb cc

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        try {
            File myObj = new File("Lesson_55_11_04/code/homework_1/src/data.txt");
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    result += myReader.nextLine() + " ";  // считываем то что было в файле построчно
                }
                myReader.close();
                System.out.println("Result : " + result);
            } else System.out.println("File data.txt does not exist");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }

    }
}