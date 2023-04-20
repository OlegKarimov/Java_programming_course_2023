import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.empty();
        Collection<String> collection = Arrays.asList("aa", "bb", "cc");
        collection.stream();

        String[] arr = {"aa", "bb", "cc"};
        Arrays.stream(arr);
//        IntStream
//        LongStream
//        DoubleStream

        IntStream stream = "hallo".chars();

        int[] ints = {1, 3, 65, 5, 7, 10, 70};
        int count = 0;
        for (int i : ints) {
            if (i > 60) continue;
            i += 1;
            count++;
            if (count > 4) break;
            System.out.println(i);
        }

        IntStream.of(1, 3, 65, 5, 7, 10, 70).filter(x -> x < 60).map(x -> x + 1).limit(4).forEach(System.out::print);

//        Способы создания стримов

//        Stream.empty() - пустой стрим
//        list.stream() - стрим из списка
//        map.enrtySet().stream() - стрим из мапы
//        Arrays.stream(array) - стрим из массива
//        Stream.of(1,2,3,5,9) - стрим из элементов
//        input.chars() из строки ??

        IntStream intStream = IntStream.range(1, 3); // генерирует поток с шагом 1 упорядоч. (1,3]

        LongStream longStream = LongStream.rangeClosed(1, 3); // генерирует поток с шагом 1 упорядоч. (1,3)

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3); // поток из случайных чисел

        System.out.println();

        Stream<String> names = Stream.of("Jack", "Jill", "Bill", "Oleg", "Barbara", "Helen");
        names.forEach(s -> System.out.println(s)); // это терминальный оператор
//        names.forEach(System.out::println);
        System.out.println();

        // промежуточный оператор
        //  метод filter() - принимает условие в виде предикаты, на выходе поток по условию

        Stream<String> names1 = Stream.of("Jack", "Jill", "Bill", "Oleg", "Barbara", "Helen");
        names1.filter(s -> s.length() == 4).forEach(s -> System.out.println(s));

        Person person1 = new Person("Jack", 45);
        Person person2 = new Person("Jill", 35);
        Person person3 = new Person("Bill", 25);
        Person person4 = new Person("Oleg", 38);
        Person person5 = new Person("Barbara", 48);
        Person person6 = new Person("Helen", 15);

        List<Person> namesList = List.of(person1, person2, person3, person4, person5, person6);
        namesList.stream()
                .filter(p -> p.getAge() < 30)
                .forEach(p -> System.out.println(p.getName()));

        System.out.println();


// 2. Метод map() - для преобразования одного объекта в другой. как Funktion

        namesList.stream()
                .map(Person::getName)
//              .map(p -> p.getName())
                .forEach(System.out::println);
//              .forEach(n -> System.out.println(n));
        System.out.println();

// 3. flatMapToInt при работе например с массивом, списком и т.д. стримов, преобразует их в один стрим

        Stream.of(2, 3, 1)
                .flatMapToInt(num -> IntStream.range(0, num))
                .forEach(System.out::println);
        System.out.println();

//---------------------------------------------------------------------------
        // map - при работе например с массивом, списком и т.д. стримов, преобразует их в поток стримов

        Stream.of(2, 3, 1)
                .map(num -> IntStream.range(0, num))
                .forEach(System.out::println);
        System.out.println();

//---------------------------------------------------------------------------
        // сортировка .sorted()
        List<String> namesSort = new ArrayList<>();
        Collections.addAll(namesSort, "Jack", "Jill", "Bill", "Oleg", "Barbara", "Helen");

        namesSort.stream()
                .filter(name -> name.length() < 7)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

//---------------------------------------------------------------------------
        //   .distinct - возвращает не повторяющие элементы

        namesSort.add("Jack");
        namesSort.add("Oleg");
        System.out.println(namesSort);
        namesSort.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

//---------------------------------------------------------------------------
        // .skip(long n) - для пропуска n элементов. на выходе стрим без первых n элем.
        // .limit(long n) - выбирает первые n элементов
        namesSort.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
        System.out.println();

//---------------------------------------------------------------------------
        // терминальные операции
        // count - кол-во элем. в потоке
        long count1 = namesSort.stream().count();
        System.out.println(count1);

//---------------------------------------------------------------------------
        // findFirst - извлекает из стрима первый элем.
        // findAny - извлекает из стрима случайный элем.
        Optional<String> first = namesSort.stream().findFirst();
        System.out.println(first);

        Optional<String> any = namesSort.stream().findAny();
        System.out.println(any);

//---------------------------------------------------------------------------
        // allMatch - true, если все элем. потока удовлетв. услов.
        // anyMatch - true, если хоть один элем. потока удовлетв. услов.
        // noneMatch - true, если не один элем. потока не удовлетв. услов.

        namesSort.stream().anyMatch(name -> name.length() == 4);
        namesSort.stream().allMatch(name -> name.length() < 40);
        namesSort.stream().noneMatch(name -> name.equals("Jack"));

//---------------------------------------------------------------------------
        // метод collect
        List<String> namesFilter = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toList());
        System.out.println(namesFilter);

        Set<String> namesToSet = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toSet());
        System.out.println(namesToSet);

// -----------------------------------------------------------------------------------------------------------------
        // метод  min(), max() мин., макс. возвращают ответ в Optional

        List<Integer> intss = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> min = intss.stream().min(Integer::compare);
        Optional<Integer> max = intss.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());

// -----------------------------------------------------------------------------------------------------------------

        // метод reduce() - суммирует

        OptionalInt reduce = IntStream.range(1, 4).reduce(Integer::sum);
        System.out.println(reduce.getAsInt()); // reduce = 1+2+3

        int reduce1 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reduce1); // 10+ 1+2+3

// -----------------------------------------------------------------------------------------------------------------

        // collect() method  соединяет собирает стрим

        String collect = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining());
        System.out.println(collect);  // hello

        String collect2 = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining(":"));
        System.out.println(collect2); // h:e:l:l:o

        String collect3 = Stream.of("h", "e", "l", "l", "o")
                .collect(Collectors.joining(":", "<", ">"));
        System.out.println(collect3);

// группировка элем. в соответствии с заданным критериями groupingBy
        Food product = new Food("bred", 1);
        Food product1 = new Food("ASD", 30);
        Food product2 = new Food("asd", 1);
        Food product3 = new Food("rrrrr", 30);

        List<Food> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
// группировка в мапу
        Map<Integer, List<Food>> groupFood = products.stream()
                .collect(Collectors.groupingBy(Food::getPrice));
        System.out.println(groupFood); // {false=[bred, asd], true=[ASD, rrrrr]}

// -----------------------------------------------------------------------------------------------------------------

        // среднне арифметич. averagingInt
        Double price = products.stream().collect(Collectors.averagingInt(Food::getPrice));

// -----------------------------------------------------------------------------------------------------------------

        // сумма элементов

        int sum = products.stream().collect(Collectors.summingInt(Food::getPrice));
        System.out.println(sum); // 62

// -----------------------------------------------------------------------------------------------------------------

        // разделение элем. на группы в соответствии с заданным критериями

        Map<Boolean, List<Food>> mapDivided = products.stream()
                .collect(Collectors.partitioningBy(p -> p.getPrice() > 9));
        System.out.println(mapDivided); // {false=[bred, ASD, asd, rrrrr], true=[]}

// -----------------------------------------------------------------------------------------------------------------
        List<String> list = new ArrayList<>();
        Collections.addAll(namesSort, "Bill", "Jack", "Jill", "Bill", "Oleg", "Barbara", "Oleg", "Helen");

        for (String i : list) {
            System.out.println(list);
        }

        System.out.println(stringList(list));
//----------------------------------------------------------------------------------------------------------------
// сортировка по компаратору !!
        List<Person2> persons2 = Arrays.asList(new Person2("Bill", 23, "Address"),
                new Person2("Jack", 63, "Address"),
                new Person2("Ann", 27, "Address"),
                new Person2("Bill", 70, "Address"));

        persons2.stream()
                .sorted(new Person2ComparatorAge())
                .forEach(p -> System.out.println(p.getName()));

        System.out.println();
//-----------------------------------------------------------------------------------------------------

        // Параллельные потоки
        // создание parallelStream() и parallel()
//        products.parallelStream()

        List<String> namesPosledov = Arrays.asList("Jack", "Tom", "Jill", "Kate");
        System.out.println("Stream");
        namesPosledov.stream()
                .filter(n -> n.length() == 4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Parrallel Stream");
        namesPosledov.parallelStream()
                .filter(n -> n.length() == 4)
                .forEach(System.out::println);
    }

    //-----------------------------------------------------------------------------------------------------
    public static List<String> stringList(List<String> inputList) {
        return inputList.stream().distinct().collect(Collectors.toList());

    }

    public static boolean stringList1(String input) {
        return input.chars().allMatch(Character::isDigit);
    }
}