import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//2. Есть  файл, состоящий из строчек текста.  Написать метод,
//читающий файл и находящий самую длинную строчку в этом файле.
//Метод возвращает эту строчку
//Пример текстового файла:
//aaa
//bbbbbbb
//cc
// результат :  bbbbbbb
public class Main {
    public static void main(String[] args) {

        String result = "";
        String patch = "Lesson_55_11_04/code/homework_2/src/data.txt";
        result = long_str(patch);
        System.out.println("Longest line in file");
        System.out.println(result);
    }

    public static String long_str(String patch) {
        String result = "";
        try {
            File myObj = new File(patch);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String bufStr = myReader.nextLine();  // считываем то что было в файле построчно
                    if (bufStr.length() > result.length()) result = bufStr;
                }
                myReader.close();
            } else System.out.println("File data.txt does not exist");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        return result;
    }
}