package DZ;

import java.util.Arrays;

public class DZ_15_02 {
    public static void main(String[] args) {

//Задача 1 Реализовать метод поиска max в случайно заданном массиве аналогично с поиском min.
// Пройти код с дебаггером, убедиться, что max найден правильно.

        int[] arrayRnd = new int[20];
        System.out.print("Массив : ");

        for (int i = 0; i < arrayRnd.length; i++) {
            arrayRnd[i] = (int) (Math.random() * 1000 + 1);
            System.out.print(arrayRnd[i] + " ");
        }
        System.out.println();

        int max, min;

        max = maxArr(arrayRnd);
        min = minArr(arrayRnd);

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

        System.out.println();
        System.out.println("-------------------------------------------------");

//-------------------------------------------------------------------------------------------------

//Задача 2 Задача про удаление дубликатов. Задумать случайный массив из 10 целых чисел от 1 до 10.
// Проверить массив на наичие в нем дубликатов, вместо найденного дубликата задать 0.
// Пример Задуман массив: 1, 5, 7, 6, 5, 3, 6, 9, 10, 5 После удаления дубликатов: 1, 5, 7, 6, 0, 3, 0, 9, 10, 0

        int[] arrayRnd2 = new int[10];
        System.out.print("Массив : ");

        for (int i = 0; i < arrayRnd2.length; i++) {
            arrayRnd2[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arrayRnd2[i] + " ");
        }
        System.out.println();
//-----------------------------
        for (int i = 0; i < arrayRnd2.length - 1; i++) {
            for (int j = (i + 1); j < arrayRnd2.length; j++) {
                if (arrayRnd2[i] == arrayRnd2[j]) {
                    arrayRnd2[j] = 0;
                }
            }
        }
//-----------------------------
        System.out.println("Полученный массив без дубликатов : ");
        for (int i = 0; i < arrayRnd2.length; i++) {
            System.out.print(arrayRnd2[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------");

//-----------------------------------------------------------------------------------------------------

//Задача 3 Имеются результаты погодных наблюдений в которых есть температура и давление за февраль 2023 года
// (можно сфантазировать). Найти минимальные и максимальные значения температуры и давления за период наблюдения.
// При выводе на печать указать, в какие дни февраля были зафиксированы эти значения.

        int[] temperatura = {2, 3, 4, 5, 4, 3, 2, 1, 0, -1, 0, 1, 2, 3, 4};
        int[] pressure = {1050, 1100, 1080, 1020, 1010, 1100, 1000, 1080, 1020, 1010, 11003, 1080, 1020, 1010, 1100};

        if (temperatura.length == pressure.length) {
            int maxT = posMaxElement(temperatura);  //Поиск позиции макс.элемента в мас.
            int minT = posMinElement(temperatura);  //Поиск позиции мин.элемента в мас.

            int maxP = posMaxElement(pressure);
            int minP = posMinElement(pressure);

            System.out.println("За февраль было зафиксированы данные:");
            System.out.println("Максмальная температура - " + (maxT + 1) + "го февраля 2023 года :" + temperatura[maxT] + " C°");
            System.out.println("Минимальная температура - " + (minT + 1) + "го февраля 2023 года :" + temperatura[minT] + " C°");
            System.out.println("Максмальное давление - " + (maxP + 1) + "го февраля 2023 года : " + pressure[maxP] + " мм.рт.ст.");
            System.out.println("Максмальное давление - " + (minP + 1) + "го февраля 2023 года : " + pressure[minP] + " мм.рт.ст.");

        } else System.out.println("Ошибка. Неправильные данные!");

    }

    //----------------------------------------------------------------------------
    private static int posMaxElement(int[] arrTMP) {   //Поиск позиции макс.элемента в мас.
        int max = 0;
        for (int i = 1; i < arrTMP.length; i++) {
            if (arrTMP[i] > arrTMP[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int posMinElement(int[] arrTMP) {   //Поиск позиции макс.элемента в мас.
        int min = 0;
        for (int i = 1; i < arrTMP.length; i++) {
            if (arrTMP[i] < arrTMP[min]) {
                min = i;
            }
        }
        return min;
    }


    public static int maxArr(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minArr(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
