public class Main {
    public static void main(String[] args) {

//    Написать следующие лямбды используя наши интерфейсы

//    1. сложить строки a и  b

        StringConcate stringConcate = (a, b) -> Integer.toString(a) + (b);
        System.out.println(stringConcate.concat(2, 5));
        System.out.println();

//-----------------------------------------------------------------------------

//    2.есть строка, если ее длина равна 3 вернуть true  иначе  false

//        Checkable checkable = (a) -> ((a.length() == 3) ? true : false);
        Checkable checkable = (a) -> a.length() == 3;
        System.out.println(checkable.check("Hallo"));
        System.out.println(checkable.check("abc"));
        System.out.println();

//-----------------------------------------------------------------------------

//    3.Есть строка string распечатать ее в виде !string!

        Printable printable = (a) -> System.out.println("!" + a + "!");
        printable.print("string");
        // //написать лямбда выражение такое, что если длина строки = 4, то вернуть четыре звездочки иначе вернуть
        //        // строку без изменений
        //        // написать лямбда выражение такое, что будет печататься "Hello World"

        Transformable transformable = (a) -> ((a.length() == 4) ? "****" : a);
        System.out.println(transformable.modify("Hello"));

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());
        System.out.println();

//----------------------------------------------------------------------------

        SomeTest<Integer> someTest = (a, b) -> (a % b) == 0;
        System.out.println(someTest.test(10, 2));
        System.out.println();

        SomeTest<Double> someTest1 = (a, b) -> (a % b) == 0;
        System.out.println(someTest1.test(200.0, 4.0));
        System.out.println();

        SomeTest<String> someTest2 = (s1, s2) -> s1.indexOf(s2) != -1;
        System.out.println(someTest2.test("abcd", "bc"));

//-------------------------------------------------------------------------------

        int[] ints = {1, 56, 81, 31, 9};
        Check checkable1 = n -> n > 10;
        System.out.println("" + sum(ints, checkable1));
//-------------------------------------------------------------------------------
        PersonCreanor personCreanor = Person::new;
        Person person = personCreanor.create("Jack");
        System.out.println(person.name);


    }

    public static int sum(int[] ints, Check check) {
        int sum = 0;
        for (int num : ints) {
            if (check.check(num)) {
                sum += num;
            }
        }
        return sum;
    }
}