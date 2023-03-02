package DZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DZ_16_02 {
    public static void main(String[] args) {
//Задача 1
//Создать список из своей профессиональной области.
// Выполнить с ним все действия, как на уроке.
// Придумать, спросить о каких-то еще возможных операциях с листом.
//
        ArrayList<String> listClients = new ArrayList<String>();

        listClients.add("Иванов");
        listClients.add("Петров");
        listClients.add("Сидоров");
        listClients.add("Пупкин");
        listClients.add("Васечкин");

        System.out.print("Список : ");

        System.out.println(listClients);
        System.out.print("Размер списка : " + listClients.size());

        System.out.println();
        System.out.println("------------------------------------");
        listClients.remove(1);
        System.out.print("Новый список после удаления 2го элемента : " + listClients);

        System.out.println();
        System.out.println("------------------------------------");
        boolean ifN = listClients.contains("Воробьёв");        // проверка на наличие
        if (!ifN) {
            listClients.add("Воробьёв");                 // Добавление элемента
        }
        System.out.print("Новый список после добавления \"Воробьёв\" :");
        System.out.println(listClients);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.print("Печать каждого : ");
        for (int i = 0; i < listClients.size(); i++)
            System.out.print(listClients.get(i) + " ");       // печать каждого iго элемента списка

        System.out.println();
        System.out.print("Печать каждого 2 вариант : ");
        for (String i : listClients) {           // печать 2 вариант
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.print("Отсортированый список : ");
        Collections.sort(listClients);         // сортировка списка
        System.out.print(listClients + " ");

        System.out.println();
        System.out.println("-----------------------------------------------------------");

//----------------------------------------------------------------------------------------------

//Задача 2
//Имеются результаты забега на 100 метров группы бегунов из 10 участников.
// Внести эти результаты в компьютер согласно протоколу.
// Отсортировать результаты, напечатать кто занял 1-е и кто занял последнее место.
//

        ArrayList<Double> listResult = new ArrayList<Double>();   // список результатов
        ArrayList<Double> listResultBuf = new ArrayList<Double>();   // буферный список результатов

        ArrayList<String> listNames = new ArrayList<String>();      // список участников
        ArrayList<String> listNamesBuf = new ArrayList<String>();      // буферный список участников

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите имя " + (i + 1) + "го участника : ");
            Scanner scanner = new Scanner(System.in);
            listNames.add(scanner.nextLine());
            System.out.print("Введите результат " + (i + 1) + "го участника : ");
            //          scanner = new Scanner(System.in);
            listResult.add(scanner.nextDouble());
        }
//---------------------------
        int max = listResult.size();

        for (int i = 0; i < max; i++) {
            int index;
            Double buf = Collections.min(listResult);   // находим мин. по результату
            index = listResult.indexOf(buf);            // находим индекс мин. по времени
            listResultBuf.add(buf);                     // записываем в буфер мин.элемент по времени
            listNamesBuf.add(listNames.get(index));     // записываем в буфер имён мин.элемент по имени
            listResult.remove(index);                   // удаляем мин. элемент по списку времени
            listNames.remove(index);
        }
        listResult = listResultBuf;     // записываем уже сортированые списки на место
        listNames = listNamesBuf;

        System.out.println();
        System.out.println("Первое место занял : " + listNames.get(0) + " c результатом : " + listResult.get(0));
        System.out.println("Последнее место занял : " + listNames.get(listNames.size() - 1) + " c результатом : " + listResult.get(listResult.size() - 1));
        System.out.println();
        System.out.println("Отсортированый список результатов :");
        for (int i = 0; i < listResult.size(); i++) {
            System.out.println(listNames.get(i) + " - " + listResult.get(i));
        }

        System.out.println();
        System.out.println("--------------------------------------------");
//-----------------------------------------------------------------------------------------------------
//Задача 3 (*)
//Отсортировать и распечатать список из задачи 1 в обратном порядке.
// Способ обратной сортировки ArrayList найти в Интернете.
//
        System.out.print("Сортированый список по возростанию : ");
        Collections.sort(listClients);
        System.out.println(listClients);
        System.out.println();

        System.out.print("Сортированый список по убыванию : ");
        Collections.sort(listClients, Collections.reverseOrder());
        // 2й способ
        // Collections.reverse(listClients);
        System.out.println(listClients);


//Вопросы на понимание
//Чем ArrayList лучше Array?
//ArrayList - это динамический массив?

    }


}
