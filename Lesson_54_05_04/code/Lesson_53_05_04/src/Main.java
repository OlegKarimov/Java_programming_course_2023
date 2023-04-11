import java.util.*;

public class Main {
    public static void main(String[] args) {

        vowelsAndConsonants("abce!");

        //    System.out.println("Java".charAt(0));
        //    System.out.println("Java".charAt(1));
        //     System.out.println("Java".charAt(2));
        //     System.out.println("Java".charAt(3));

        char ch = 'ы';
        char chDigit = '4';
        System.out.println("is " + ch + " a letter? " + Character.isLetter(ch));
        System.out.println("is " + chDigit + " a digit? " + Character.isDigit(chDigit));
        //    System.out.println(Character.isDigit('4'));


        System.err.println("Error printing");
    }

    // O(1)
    public int getLength(List<Integer> ints) {

        return ints.size();
    }

    // O(n)

    public int sum(List<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            //body
        }
        return 2;

        //0(log n)

        //O(nLogn)

        //O(n^2)
    }

    // есть массив целых положительных чисел. Найти элемент, который встречается  в
    // массиве больше > length/2 (доминантный). Если такого нет, вернуть -1
    //[5,6,6,5,6,5] 5:3  6:3
    //[1,1,1,0,0,0,0] 1:3   0:4
    public int findDominant(int[] ints) {
        Map<Integer, Integer> occToNumber = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            if (occToNumber.containsKey(ints[i]))
                occToNumber.put(ints[i], occToNumber.get(ints[i]) + 1);
            else occToNumber.put(ints[i], 1);
        }
        int counter = 0;
        int dominant = 0;

        for (int key : occToNumber.keySet()) {
            if (occToNumber.get(key) > counter) {
                counter = occToNumber.get(key);
                dominant = key;
            }
        }
        if (counter > ints.length / 2)
            return dominant;
        return -1;
    }

    /*
    1.Есть лист имен, в котором некоторые имена повторяются. С помощью сета  написать метод, который вернет лист
    без повторяющихся элементов. List<String> withoutDuplicates (List<String> names)
    [Jack, Mary, Peter, Ann, Mary, Jack] ->[ Jack, Mary, Peter, Ann]
    */
    public List<String> withoutDuplicates(List<String> names) {

        Set<String> set = new HashSet<>(names);

        return new ArrayList<>(set);
    }


    /*2. Есть список имен, в котором некоторые имена повторяются. С помощью сета написать метод, который вернет
    повторяющиеся элементы из этого листа  List<String> duplicates (List<String> names)
    [Jack, Mary, Peter, Ann, Mary, Jack]-> [Jack, Mary]

     */
    List<String> duplicates(List<String> names) {
        Set<String> set = new HashSet<>();
        List<String> getDuplicates = new ArrayList<>();

        for (String s : names) {
            if (!set.add(s) && !getDuplicates.contains(s)) {
                getDuplicates.add(s);
            }
        }
        return getDuplicates;
    }

    //Написать метод, который подсчитывает и выводит на экран количество гласных и согласных
    //букв английского алфавита в слове
    // public static void vowelsAndConsonants (String)
    // hello -> number of vowels 2, number of consonants 3
    // hello! -> number of vowels 2, number of consonants 3
    // a*M
// 1- пройти по всем символам слова в цикле
//   2- определить является ли символ буквой английского алфавита c помощью таблицы ASCII  или метода класса
    //   Character
    // определить гласная или согласная

    public static void vowelsAndConsonants(String string) {
        int counterVowels = 0;
        int counterConsonants = 0;

        for (int i = 0; i < string.length(); i++) {
            char character = string.toLowerCase().charAt(i);
            //  if(character >=97 && character <= 122){
            if (Character.isLetter(character)) {
                if (character == 'a' ||
                        character == 'u' ||
                        character == 'e' ||
                        character == 'i' ||
                        character == 'y' ||
                        character == 'o')
                    counterVowels++;
                else counterConsonants++;

            }
        }
        System.out.println(counterVowels);
        System.out.println(counterConsonants);
    }
}