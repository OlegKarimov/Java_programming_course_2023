public class Main {
    public static void main(String[] args) {

//    Написать следующие лямбды используя наши интерфейсы

//    1. сложить строки a и  b

        StringConcate stringConcate = (a, b) -> a.concat(b);
//    StringConcate stringConcate = (a,b) -> a + b;
        System.out.println(stringConcate.concat("Hallo ", "world"));
        System.out.println();

//-----------------------------------------------------------------------------

//    2.есть строка, если ее длина равна 3 вернуть true  иначе  false

        Checkable checkable = (a) -> ((a.length() == 3) ? true : false);
        System.out.println(checkable.check("Hallo"));
        System.out.println(checkable.check("abc"));
        System.out.println();

//-----------------------------------------------------------------------------

//    3.Есть строка string распечатать ее в виде !string!

        Printable printable = (a) -> "!" + a + "!";
        System.out.println(printable.print("string"));
    }
}