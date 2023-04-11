import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

//4. *(со звездочкой)
// Есть текстовый файл, содержащий информацию о клиенте, название
//устройства и цену.   Имена клиентов могут повторяться.
//Файл имеет такой вид:
//John, Smith, Notebook, 500
//Jill, White, Mac,  800
//John, Smith, Keybord,25
//Ann, Green, Mousepad, 5
//Jill, White, Apple,60
//Написать метод, читающий информацию из файла, суммирующий
//цену для каждого покупателя  и записывающий результат в выходной
//файл. Этот файл будет иметь такой вид:
//Ann Green 5
//John Smith 525
//Jill White 860
//Для решения задач вам могут понадобиться также методы класса
//String  trim()  и split().  Найти о них информацию в интернете.
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> productsHashMap = new HashMap<String, Integer>();
        String patchIn = "Lesson_55_11_04/code/homework_4/src/data_in.txt";
        String patchOut = "Lesson_55_11_04/code/homework_4/src/data_out.txt";
        productsHashMap = void_map_result(patchIn, patchOut);
        System.out.println("Writing to the output file is made : ");
        System.out.println(productsHashMap);

    }

    public static HashMap<String, Integer> void_map_result(String patchIn, String patchOut) {
        HashMap<String, Integer> resultProductsHashMap = new HashMap<String, Integer>();
        try {
            File myObj = new File(patchIn);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String bufStr = myReader.nextLine();  // считываем то что было в файле построчно
                    String[] bufArray = bufStr.split(",");
                    String name = bufArray[0].trim() + " " + bufArray[1];
                    int price = Integer.parseInt(bufArray[3].trim());
                    if (resultProductsHashMap.containsKey(name)) {
                        resultProductsHashMap.put(name, resultProductsHashMap.get(name) + price);
                    } else resultProductsHashMap.put(name, price);
                }
                myReader.close();
            } else System.out.println("File data_in.txt does not exist");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        try {
            FileWriter myWriter = new FileWriter(patchOut);
            for (String i : resultProductsHashMap.keySet()) {
                myWriter.write(i + " " + resultProductsHashMap.get(i) + '\n');
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        return resultProductsHashMap;
    }
}