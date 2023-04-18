public class Main {
    public static void main(String[] args) {

//   Решить задачу 2 из предыдущего домашнего задания другим методом - без интерфейсов.
//   Использовать свойства наследования классов (абстрактные классы).
//
//Метод должен позволять изменять слова в строке следующим образом:
//1. при длине слова= 3, изменять все буквы этого слова на заглавные
//2. при длине слова= 4, изменить все буквы слова на строчные
//3. при длине слова= 5, изменить все буквы слова на звездочки
//Протестировать.
//Пример: есть строка AAA BBBB dEF cDkls bBb
//Условие: если длина слова = 3 то заменить буквы этого слова на маленькие.
//На выходе будет: aaa BBBB def cDkls bbb


        String str = "AAA BBbb dEF cDkls bBb";

        PredicateClass1 predicateClass1 = new PredicateClass1();
        FunctionClass1 functionClass1 = new FunctionClass1();

        PredicateClass2 predicateClass2 = new PredicateClass2();
        FunctionClass2 functionClass2 = new FunctionClass2();

        PredicateClass3 predicateClass3 = new PredicateClass3();
        FunctionClass3 functionClass3 = new FunctionClass3();

        System.out.println(changeString(str, predicateClass1, functionClass1));
        System.out.println(changeString(str, predicateClass2, functionClass2));
        System.out.println(changeString(str, predicateClass3, functionClass3));
    }

    public static String changeString(String str, PredicateAbstract predicate, FunctionAbstract function) {
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
