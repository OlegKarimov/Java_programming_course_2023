import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Задача1
//Есть класс Address с полями
//String street
//int houseNumber
//
//и класс Person с полями
//String name
//int age
//Address address
//
//Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех, кто старше 17 лет.
//List<Address>getAddresses(List<Person> input)
public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("strit1", 10);
        Address address2 = new Address("strit2", 12);
        Address address3 = new Address("strit3", 14);
        Address address4 = new Address("strit4", 15);
        Address address5 = new Address("strit5", 16);

        Person person1 = new Person("Jack", 10, address1);
        Person person2 = new Person("Jill", 35, address2);
        Person person3 = new Person("Bill", 12, address3);
        Person person4 = new Person("Oleg", 38, address4);
        Person person5 = new Person("Barbara", 48, address5);

        List<Person> personsList = List.of(person1, person2, person3, person4, person5);
        System.out.println(getAddresses(personsList));
        System.out.println();

        System.out.println("Number of words starting with the letter \"a\" in a string : ");
        System.out.print(countWords("aaa ffff aa bbbb a bb aaa gggggggggggggg", "a"));

    }

    public static List<Address> getAddresses(List<Person> input) {

        return input.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());


    }

    //---------------------------------------------------------------------------------------------------
//    Задача2
//Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом
// и букву и возвращающий количество слов, начинающихся с этой буквы.
//long countWords (String input, String letter)
//
//пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 , т.к. слово,
// начинающееся на a встречается 4 раза
    public static long countWords(String input, String letter) {

        return Arrays.stream(input.split(" "))
                .filter(p -> p.charAt(0) == (letter.charAt(0))).count();

//                .filter(p -> p.chars().findFirst().equals(letter)).count();

//                .findFirst()
//                .filter(p -> p.equals(letter))
//                .stream().count();

    }

}