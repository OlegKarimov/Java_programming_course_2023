package Lektions;
import java.io.IOException;

public class Lektion_26_01 {

    String string;

    public static void main(String[] args)throws IOException {
/*
//        char ch;

//        System.out.println("Presse a key: ");
//        ch = (char)System.in.read();

        System.out.println("Presse a key: ");
        int code = System.in.read();

//        System.out.println("you entered: "+ch);
        System.out.println("you coode: "+code);



        int a = 5;

        Car mercedes = new Car("red","CLS",2020);
        Car volvo = new Car("blue","XC90",2022);

 */

        long num = 100L;

        String str1 = "String";
        String usingNew = new String("new String");

        String newStr1;

        String emptyLiteral = "";
        String emptyNewString = new String("");

        System.out.println("emptyLiteral "+emptyLiteral);
        System.out.println("emptyNewString "+emptyNewString);

        String nullValue = null;

        System.out.println("nullValue "+nullValue);

        System.out.println();

        String str2 = "oleg";
        String str3 = "oleg";
        System.out.println(str2==str3);

        String str4 = new String("oleg");

        System.out.println(str2==str4);

//----------------------------------------------------------------------------
/*
        Методы строк !!!!!!!!
        Cat
        C - 0
        a - 1
        t - 2
 */
        String cat = "good Cat";
        int catLength = cat.length();                    // кол-во символов в строке
        System.out.println("cat lenght is: "+catLength);

        char charAtCatIndex = cat.charAt(0);             // взять, скопировать нудный символ строки
        System.out.println("pos 0 is "+charAtCatIndex);

        char charAtCatIndex1 = cat.charAt(1);             // взять, скопировать нудный символ строки
        System.out.println("pos 0 is "+charAtCatIndex1);

        String substr = cat.substring(5);        // взять часть строки до конца
        System.out.println("substr "+substr);

        String substr1 = cat.substring(0,4);        // взять часть строки от и до нужного значения
        System.out.println("substr "+substr1);      // начальное зн. включено, конечное - исключено


    }
}
