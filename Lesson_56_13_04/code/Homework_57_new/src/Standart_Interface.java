import java.util.function.*;

public class Standart_Interface {
    public static void main(String[] args) {
//       1. Function<T,R> - преобразует объект типа Т в объект типа R
//          R apply(T obj)
        Function<Integer, String> intToString = num -> String.valueOf(num);
        intToString.apply(2);

//        2. UnaryOperator<T> - аналог Function только для одного и того де типа
//        T apply (T obj)
        UnaryOperator<Integer> isSquare = num -> num * num;
        isSquare.apply(5);

//        3. Predicate<T> - проверяет условие true / false
//        boolean test(T obj)
        Predicate<Integer> isPositive = num -> num > 0;
        isPositive.test(5);

//        4. Consumer<T> - принимает объект, но ничего не возвращает
//        void accept (T obj)
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hallo");

//        5. Supplier<T> - ничего не принимает, но возвращает объект
//        T get ()
        Supplier<String> stringSupplier = () -> "Hallo";


//        6. BiFunction<T,U,R> - принимает два обьекта типов T и U и преобразуит из в другой тип R
//        R apply (T obj1, U obj2)
        BiFunction<Integer, Integer, String> stringBiFunction = (a, b) -> Integer.toString(a, b);
        stringBiFunction.apply(3, 4);


//         7. BinaryOperator<T> - принимает два обьекта типа T и возвращает обьект тоже типа T
//        T apply (T obj1, T obj2)
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
        sum.apply(3, 4);


    }
}
