import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String str = "134589";
        String str1 = "adf45";
        System.out.println(isDig(str)); // true
        System.out.println(isDig(str1));// false

        List<String> strings = Arrays.asList("Jack", "Jack", "Jane", "Jane");
        System.out.println(removeDuplicates(strings));


        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int counter = 0;

        for (int num : numbers) {
            if (num > 2)
                counter++;
        }
        counter++;


        IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(num -> num > 2)
                .count();

        // Character.
        // "hello".chars()
    }

    /*
    Используя стримы !
   1. есть лист с именами, некоторые повторяются. Написать метод, возвращающий лист
    без повторений
    Character isDigit
    */
    public static List<String> removeDuplicates(List<String> strings) {
        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /*
        2. Есть строка. Написать метод, проверяющий является ли строка числом
        "wertz"
        "2w"
        "2345"
        Используя стримы!
        Character isDigit
        */
    public static boolean isDig(String input) {
        return input.chars()
                .allMatch(Character::isDigit);

    }
/*
    3. Есть класс BankAccount c  полями  String IBAN  и String owner
       Написать метод, возвращающий лист  IBAN  со звездочками после третьего символа
       [DE7****************, DE2****************]
       List<String> replaceWithStars ( List<BankAccount> input)
       Через стримы !
       a-> replaceWithStars ( a)
       a-> { .......
              a
             ......
             return   }
replaceWithStars()
     */

}