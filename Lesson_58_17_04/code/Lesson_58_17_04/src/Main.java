import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Optional - это объект контейнер для представления null в случае отсутствия значения.
//        Методы этого класса представляют значения как доступные или недоступные

        Optional<String> empty = Optional.empty(); // создание пустого объекта
        System.out.println(empty.isEmpty());
        String str = "Hello";
        Optional<String> stringOptional = Optional.of(str); // создаём объект класса Optional

        System.out.println(stringOptional.isPresent()); // true если значение внутри не равно null

        String str2 = null;
//        Optional.of(str2);

        Optional<String> opt = Optional.ofNullable(str2); // так можно передать пустой Optional. Значения = null
        System.out.println("Option of nullable for opt is " + opt.isPresent());

        System.out.println(opt.isEmpty());

        if (str != null) {
            System.out.println(str.length());
        }

        Optional<String> strTocheck = Optional.of("hallo");
//        strTocheck.isPresent(s -> System.out.println(s.length()));

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Jake");
        System.out.println(name);

        Optional<String> optionalBill = Optional.of("Bill");
        String bill = "Bill";
    }
}