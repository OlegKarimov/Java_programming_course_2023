
// Задача1
//Есть класс Person с полями
//String name
//int age
//String address
//
//Используя стримы, написать метод, принимающий список персонов и возвращающий мапу,
// где возраст является ключом, а список персонов этого возраста значением
//
//Задача2
//Используя тот же класс Person, написать метод, принимающий список персонов и возвращающий
// общий возраст тех, кто старше 17 лет.
//
//Задача 3
//Написать метод, принимающий список персонов и возвращающий имена тех,
// кто является совершеннолетним в Германии (старше 18 лет).
// Должна быть возвращена примерно следующая строка:
// in Germany Jack and John are of legal age (имена по вашему выбору, это пример)

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("Bill", 23, "Address"),
                new Person("Jack", 63, "Address"),
                new Person("Ann", 27, "Address"),
                new Person("Bill", 63, "Address"));


        System.out.println(mapReturn(persons));

        mapReturn(persons).forEach((k, v) -> System.out.println((k + "->" + v.stream()
                .map(Person::getName).collect(Collectors.toList()))));

        System.out.println(returnSumAge(persons));

        System.out.println(returnNames(persons));

    }

//    //Используя стримы, написать метод, принимающий список персонов и возвращающий мапу,
//// где возраст является ключом, а список персонов этого возраста значением

    public static Map<Integer, List<Person>> mapReturn(List<Person> inputList) {
        return inputList.stream()
                .collect(Collectors.groupingBy(Person::getAge));

    }

    //Задача2
//Используя тот же класс Person, написать метод, принимающий список персонов и возвращающий
// общий возраст тех, кто старше 17 лет.
    public static int returnSumAge(List<Person> personList) {
//     1   return personList.stream().filter(p -> p.getAge() > 17).collect(Collectors.summingInt(Person::getAge));
//     2   return personList.stream()
//                .filter(p -> p.getAge() > 17)
//                .mapToInt(Person::getAge)
//                .sum();
        return personList.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAge)
                .reduce(0, Integer::sum);
    }

    //Задача 3
//Написать метод, принимающий список персонов и возвращающий имена тех,
// кто является совершеннолетним в Германии (старше 18 лет).
// Должна быть возвращена примерно следующая строка:
// in Germany Jack and John are of legal age (имена по вашему выбору, это пример)
    public static String returnNames(List<Person> personList) {

//        return "in Germany " + personList.stream()
//                .filter(p -> p.getAge() > 18)
//                .map(Person::getName)
//                .collect(Collectors.joining(" and ")) + " are of legal age";

        return personList.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "in Germany ", " are of legal age"));
    }

}