package DZ;

import java.util.HashSet;

public class DZ_21_02 {
    public static void main(String[] args) {
//Задача 1
//Cделать самооценку по списку полученных знаний и умений.
/*
1. Типы переменных (ТИП , имя, значение ) - храняться в ячейках ОЗУ     9
2. Накопление значения в переменной (x = x + 1, x++)                    9
3. Вывод текста и "результатов" на экран (sout)                         9
4. Запрос данных от пользователя - число, строка, символ (Scanner)      9
5. Проверка условия, выбор - if...else, switch...case                   9
6. Проверка делимости нацело (if (i%2 == 0) - делимость на 2)           9
7. Циклы - while, do...while, for                                       9
8. Массивы (Array) - объявление и наполнение                            9
9. Датчик случайных чисел                                               9
10. ASCII - коды                                                        9
11. Формальная логика, логические операторы                             9
12. Методы (перенос полезного и частоиспользуемого еода в вызываемые функции/процедуры/методы)  9
13. Алгоритм запуска цикла (параметр, условие на парамерт, шаг увеличения параметра)    9
14. Руководство по разработке программ                                  9
15. Теорема Бёма-Якопини (три управляющих структуры)                    9
16. Вывод массива на печать по порядку и задом наперед                  9
17. try .. cach - работа с Exceptions (errors)                          9
18. Debugger -                                                          9
19. ArrayList - что это? Зачем?                                         9
20. LikedList - что это? Зачем?                                         9
21. Разделять слово по буквам                                           9
22. Разделять проедложение на слова                                     9
23. Умеение организовать бесконечный цикл для ввода данных пользователем    9
24. Сравнение 2-х чисел и выбор min и max, поиск min и max в массиве        9
 */


//Задача 2
//Создать список из 100 целых случайных чисел в интервале от 1 до 99,
// с помощью HashSet исключить повторы(дубликаты) и вывести на печать количество уникальных элементов
// полученного множества.

        HashSet<Integer> randomsInt = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            randomsInt.add((int) (Math.random() * 99 + 1));
        }

        System.out.println("Вывод массива чисел: ");
        for (int i : randomsInt) {
            System.out.print(i + " , ");
        }

        System.out.println();
        System.out.println("Кол. уникальных элементов : " + randomsInt.size());
//Задача 3
//В автосервисе решили узнать, сколько всего уникальных машин они обсужили за время своей работы.
// В архиве имеются все заказ-наряды, в которых зафиксированы VIN обслуженных машин.
// Написать приложение для автосервиса, проверить его работу на тестовом наборе данных для 10 автомобилей
// (VIN машин запросить у коллег из группы).


    }
}
