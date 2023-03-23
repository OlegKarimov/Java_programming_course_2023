import java.util.*;

public class Main {

    // как сравнить два числа
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Сравнение объектов класса Human");

        Human peter = new Human("Петр", 200, 78, 27);
        Human daniil = new Human("Даниил", 178, 83, 22);
        Human viktor = new Human("Виктор", 182, 90, 24);
        Human andrei = new Human("Андрей", 165, 45, 18);
        Human yakov = new Human("Яков", 185, 65, 28);
        Human alex = new Human("Алексей", 185, 65, 23);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(peter);
        humans.add(daniil);
        humans.add(viktor);
        humans.add(yakov);
        humans.add(alex);
        humans.add(andrei);

        System.out.println("Было");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
        System.out.println();
        System.out.println("Сортировка по возрасту");

        Collections.sort(humans, new HumanByAgeComparator());
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
        System.out.println();
        System.out.println("Сортировка по весу");
        Collections.sort(humans, new HumanByWeightComparator());
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }


        String[] names = {"Петр", "Даниил", "Виктор", "Андрей", "Яков", "Алексей"}; // массив строк с именами

        //       Human[] humans = {peter, daniil, viktor, andrei, yakov, alex}; // массив объектов типа Human

//        sort(names); // сортировка имен по алфавиту
//        System.out.println(Arrays.toString(names));
//
//        sort(humans); // сортировка по росту
//        System.out.println(Arrays.toString(humans));


    }
}