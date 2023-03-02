package DZ;
/*
2. Написать программу, принимающую с клавиатуры слово, состоящее из не повторяющихся заглавных или прописных (больших или маленьких) букв и принимающую затем также с клавиатуры одну из букв этого слова.
   . Программа заменяет эту букву в строке на звездочку и все буквы на прописные(маленькие) и выводит результат на экран
   Пример: было "AbCDe". Для буквы С стало: ab*de
 */
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DZ_30_01 {
    public static void main(String[] args)throws IOException {

// Input--------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine();

        System.out.println("Input char : ");
        char ch = (char)System.in.read();
        String chsrt= ""+ch;                    // Перевод из String в char !!!!!!!!!!

//        String chsrt = String.valueOf(ch);    // Перевод из String в char 2й способ
//
        chsrt = chsrt.toLowerCase();

//      char ch = scaner.nextLine().toLowerCase().charAt(0);

//--------------------------------------

        str = str.toLowerCase();
        str = str.substring(0,str.indexOf(chsrt))+"*"+str.substring(str.indexOf(chsrt)+1);
        System.out.println("Output string : "+str);

    }

    }
