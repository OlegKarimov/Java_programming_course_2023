//3. *(со звездочкой)
//Есть  не пустой текстовый файл, состоящий из строчек, содержащих
//имя и возраст такого вида:
//John, 3
//Jack, 23
//Jill, 19
//Bill, 15
//Ann, 54
//Написать метод, читающий файл и возвращающий список из людей
//старше 18 лет отсортированный по возрасту.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Object> humansTreeSet;
        String patch = "Lesson_55_11_04/code/homework_3/src/data.txt";
        humansTreeSet = void_map_result(patch);
        System.out.println("List of people over 18 sorted by age : ");
        System.out.println(humansTreeSet);

    }

    public static TreeSet<Object> void_map_result(String patch) {
        TreeSet<Object> humansTreeSet = new TreeSet<>();
        try {
            File myObj = new File(patch);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String bufStr = myReader.nextLine();  // считываем то что было в файле построчно
                    String[] bufArray = bufStr.split(",");
                    if ((Integer.parseInt(bufArray[1].trim()) > 18)) {
                        HumanClass human = new HumanClass(bufArray[0].trim(), Integer.parseInt(bufArray[1].trim()));
                        humansTreeSet.add(human);
                    }
                }
                myReader.close();
            } else System.out.println("File data.txt does not exist");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        return humansTreeSet;
    }
}