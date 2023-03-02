package Lektions;

import java.util.HashMap;

//Операции с элементами HashMap
//nameHashMap.put ( key , value) - добавление и обновление элемента
// nameHashMap.get ( key ) - получение значения по ключу
// nameHashMap.remove ( key ) - удаление значения по ключу
// nameHashMap.size () - получение размера коллекции элементов
//
//Цикл по элементам HashMap
//// Print keys - проход по всем ключам for (String i : nameHashMap.keySet()) { System.out.println(i); }
//
//// Print values - проход по всем значениям for (String i : nameHashMap.values()) { System.out.println(i); }
//
//// Print keys and values - проход по всем ключам и их значениям
// for (String i : nameHashMap.keySet()) { System.out.println("key: " + i + " value: " + nameHashMap.get(i)); }
//
//Номерных индексов, как в массивах или списках,
// в HashMap нет — доступ к элементу коллекции осуществляется по ключу (напоминаю, что он должен быть уникальным).
public class Lektion_21_02 {
    public static void main(String[] args) {

        System.out.println("Список группы 23-2");

        HashMap<String, Integer> group23 = new HashMap<>();


        group23.put("Vadim", 25);
        group23.put("Leonid", 26);
        group23.put("Lilian", 28);
        group23.put("Lilian", 29);
        group23.put("Viacheslav", 35);
        group23.put("Katerina G", 40);
        group23.put("Katerina", 40);

        for (String i : group23.keySet()) {
            System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
        }

        System.out.println("Список группы с указанием пола");

        HashMap<String, String> group23_1 = new HashMap<String, String>();

        int man = 0;

        group23_1.put("Vadim", "M");
        group23_1.put("Leonid", "M");
        group23_1.put("Lilian", "M");
        group23_1.put("Viacheslav", "M");
        group23_1.put("Katerina", "F");
        group23_1.put("Dina", "F");
        group23_1.put("Natalia", "F");
        group23_1.put("Elisabeth", "F");
        group23_1.put("Ekaterina", "F");

        for (String i : group23_1.keySet()) {
            // System.out.println(group23.get(i));
            //  if (group23_1.get(i) == "M") {
            if (group23_1.get(i).equals("M")) {
                man++;
            }
        }

        System.out.println("Мужчин в группе: " + man);
        int woman = group23.size() - man;
        System.out.println("Женщин в группе: " + woman);


    }
}

