package Lektions;

public class Lektion_27_01 {
    public static void main(String[] args) {

        String str1 = "Hallo";
        int length = str1.length();
        System.out.println("First char: "+str1.charAt(0));
        System.out.println("Last char: "+str1.charAt(length-1));

        System.out.println(str1.substring(1,4));

//------ Метод printf -----------

        System.out.printf("Hello %s!%n ","World");

//      %[flags][width][.precision]

//      s - форматирование строк
//      d - форматирует целые числа
//      f - форматирует числа с запятой
//      t - форматирует дату и время

        System.out.printf("hello%nworld%n");

        System.out.printf("'%S'%n","Hallo");

//   width
        System.out.printf("'%20s'%n","Hallo");

        System.out.printf("%2.2s%n","Hallo");    // выводит кол-во симв. 2

        System.out.printf("integer: %d%n",1000);

//---------------------------------------------------------------------------
//      Еще методы String

        String name = "oleg";
        String name1 = new String("oleg");    // сравнение значений
        boolean eq = name.equals(name1);
        System.out.println(eq);
//-------------
        String string = "Hello";
        String string1 = "hello";
//-----------
        System.out.println(string.equalsIgnoreCase(string1));  // сравнение значений без учета регистра
//-----------
        String string2 = new String("qLOKzuguertz");
        System.out.println("string2.toUpperCase() "+string2.toUpperCase()); // сделать все большие буквы

        System.out.println("string2.toLowerCase() "+string2.toLowerCase()); // сделать все маленькие буквы
//---------
        boolean stat = string.startsWith("He");           // проверяет начинантся слово с "He"
        System.out.println("Vhodit ili net - "+stat);
        stat = string.startsWith("Pe");                  // проверяет начинантся слово с "Pe"
        System.out.println("Vhodit ili net - "+stat);
//--------
        char ch = 0;
        String chsrt= ""+ch;                    // Перевод из String в char !!!!!!!!!!
//        String chsrt = String.valueOf(ch);    // Перевод из String в char 2й способ
//      char ch = scaner.next().charAt(0);   Ввод со сканера 1го символа !!!!
//---------
        String str123 = new String("Hekko");    // Замена в строке char на новый char
        System.out.println(str123.replace('k','l')); // Заменит в строке 'k' на 'l'

//--------
        int num = 99;
        String t = String.valueOf(num);           // перевод числа в строку
//--------
        String str5 = "qwert zuiop dh";
        System.out.println("Vhodit "+ str5.indexOf('r'));      // находит индекс первого вхождения заданного символа
        System.out.println("Vhodit "+ str5.indexOf('ü'));  // -1 если не нашло
        System.out.println("Vhodit "+ str5.indexOf("zu")); // искать слово


  }

}
