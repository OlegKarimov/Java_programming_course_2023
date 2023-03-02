package Lektions;

import DZ.DZ_14_02_02;
import DZ.DZ_15_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lektion_15_02 {
    public static void main(String[] args) {

        ArrayList<String> brandList = new ArrayList<String>();

        brandList.add("BMW");
        brandList.add("Mers");
        brandList.add("Opel");
        brandList.add("Ford");

        System.out.println(brandList);
        System.out.println("Размер листа : " + brandList.size());
        System.out.println("Индекс Mers в списке : " + brandList.indexOf("Mers"));

        brandList.remove(2);         // удаление элемента
        System.out.println(brandList);

        boolean ifN = brandList.contains("Opel");        // проверка на наличие
        if (!ifN) {
            brandList.add("Opel");                 // Добавление элемента
        }
        System.out.println(brandList);

        for (int i = 0; i < brandList.size(); i++)
            System.out.println(brandList.get(i));       // печать каждого iго элемента списка

//---------------------------------------
//          Сортировка листа

        Collections.sort(brandList);        //   Сортировка листа
        System.out.println(brandList);

        ArrayList<Integer> myList = new ArrayList<Integer>();  // создание экземпляра класса
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Массив :" + myList);
        System.out.println("Длина массива : " + myList.size());

        Collections.sort(myList);
        System.out.println();
        System.out.println("Массив :" + myList);

        for (int i : myList) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (String i : brandList) {
            System.out.println(i);
        }

    }
}
