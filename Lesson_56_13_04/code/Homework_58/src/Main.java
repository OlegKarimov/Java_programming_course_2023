
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//Переписать лямбда-выражения для интерфейсов Checkable,Printable,Producable, StringConcate,Transformable
// из домашнего задания и с урока на стандартных функциональных интерфейсах Java.


// 1. Checkable . Есть строка, если ее длина равна 3 вернуть true  иначе  false
        Predicate<String> checkable = (a) -> a.length() == 3;
        System.out.println(checkable.test("Hallo"));
        System.out.println(checkable.test("abc"));
        System.out.println();

//-----------------------------------------------------------------------------

// 2. Printable. Есть строка string распечатать ее в виде !string!

        Consumer<String> printable = (a) -> System.out.println("!" + a + "!");
        printable.accept("string");
        System.out.println();

//-----------------------------------------------------------------------------

// 3. Producable . Написать лямбда выражение такое, что будет печататься "Hello World"

        Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());
        System.out.println();

//-----------------------------------------------------------------------------

// 4. StringConcate . Сложить строки a и  b

        BinaryOperator<Integer> stringConcate = (a, b) -> Integer.parseInt(Integer.toString(a) + Integer.toString(b));
//        BiFunction<Integer, Integer, String> stringBiFunction = (a, b) -> Integer.toString(a) + b;
//        System.out.println(stringBiFunction.apply(3, 4));
        System.out.println(stringConcate.apply(2, 50));
        System.out.println();

//-----------------------------------------------------------------------------

// 5. Transformable . Написать лямбда выражение такое, что если длина строки = 4,
// то вернуть четыре звездочки иначе вернуть строку без изменений

        UnaryOperator<String> transformable = (a) -> ((a.length() == 4) ? "****" : a);
        System.out.println(transformable.apply("Hello"));
        System.out.println(transformable.apply("Help"));
        System.out.println();

//------------------------------------------------------------------------------

        String str = "AAA BBbb dEF cDkls bBb";

        Function<String, String> function_1 = s -> s.toLowerCase();
//        UnaryOperator<String> function_2 = s -> s.toUpperCase();
        Function<String, String> function_2 = String::toUpperCase;
        Function<String, String> function_3 = s -> "*****";

        Predicate<String> caseLength_1 = s -> s.length() == 3;
        Predicate<String> caseLength_2 = s -> s.length() == 4;
        Predicate<String> caseLength_3 = s -> s.length() == 5;

        System.out.println(changeString(str, caseLength_1, function_1));
        System.out.println(changeString(str, caseLength_2, function_2));
        System.out.println(changeString(str, caseLength_3, function_3));

    }

    ///* Написать метод, принимающий строку, содержащую слова разделенные пробелом и два функциональных
// интерфейса - function и predicate.
// Метод возвращает строку. Он должен предоставлять возможность реализации следующих действий:
//1. при длине слова= 3, изменить все буквы этого слова на строчные и вернуть измененную строку
//2. при длине слова= 4, изменить все буквы слова на заглавные и вернуть измененную строку
//3. при длине слова= 5, изменить все буквы слова на звездочки и вернуть измененную строку
//(т.е. должен работать таким образом при передаче в него соотвествующих лямбда выражений для каждого случая).
//Протестировать.
//Пример: есть строка AAA BBBB dEF cDkls bBb
//Условие: если длина слова = 3 то заменить буквы этого слова на маленькие.
//На выходе будет: aaa BBBB def cDkls bbb

    public static String changeString(String str, Predicate predicate, Function function) {
        String[] arrayStr = str.split(" ");
        String result = "";
        for (String i : arrayStr) {
            if (predicate.test(i)) {
                result += function.apply(i) + " ";
            } else result += i + " ";
        }

        return result;
//        return String.join("", arrayStr);
    }
}