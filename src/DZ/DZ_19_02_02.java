package DZ;

import java.util.ArrayList;
import java.util.Arrays;

public class DZ_19_02_02 {
    public static void main(String[] args) {
//Задача 2
//По задачам решенным на занятии вынести в методы:
//  - получить буквы (массивом), передав на вход слово
//  - получить массив слов, передав в метод предложение (строка)

        //  - получить буквы (массивом), передав на вход слово

        ArrayList<Character> lettersRes = new ArrayList<Character>();
        String word = "троллейбус"; // задаем слово
        System.out.println("Задали слово : " + word);

        lettersRes = divToLetters(word);

        System.out.println("Полученный массив букв : " + lettersRes); // вывод листа букв, из которых состоит слово
        System.out.println();

//----------------------------------------------------------------------------------------
        // - получить массив слов, передав в метод предложение (строка)

        ArrayList<String> sentenceWords = new ArrayList<String>();
        String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";
        System.out.println("Задали предложение : " + sentence);

        sentenceWords = divToStrings(sentence);

        System.out.print("Полученный массив слов : " + sentenceWords);    // вывод листа слов

    }

    public static ArrayList<Character> divToLetters(String word) {
        ArrayList<Character> letters = new ArrayList<Character>(); // создаем массив для букв из слова
        for (int i = 0; i < word.length(); i++) {        // Цикл в котором заполняем лист буквами из слова
            letters.add(word.charAt(i)); // из слова берем каждую букву
        }
        return letters;
    }

    public static ArrayList<String> divToStrings(String sentence) {
        String[] s = sentence.split(" "); // пробел указан в кавычках!!
        ArrayList<String> sentenceWords = new ArrayList<String>();
        for (String i : s) {
            sentenceWords.add(i);
        }
        return sentenceWords;
    }
}
