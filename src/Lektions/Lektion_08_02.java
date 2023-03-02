package Lektions;

public class Lektion_08_02 {
    public static void main(String[] args) {

/*
        Массивы !!

Длина массива строгого размера

    int[] myArray = new int[3];
    myArray[0] = 1;
    myArray[1] = -19;
    myArray[2] = 1;

    String[] arrayDeys = new String[4];
    arrayDeys = {"asda","sdfsf","adasd","adad"};

    int k = arrayDeys.length     Длина массива


по умолчанию    int = 0
                float, duble = 0.0
                String = "null"
                char = '\0'
                boolean = false

*/

// Задача 3. Даны оценки двух учеников за четверть:
// Ученик1: 5, 3, 3, 4, 5, 4, 5, 5 Ученик2: 3, 4, 5, 5, 2, 5, 4
// Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.

//-------------------------------------------------------
        int[] myArray1 = {5, 3, 3, 4, 2, 4, 5, 5};
        int[] myArray2 = {5, 4, 5, 5, 5, 5, 4};

        int sredAr1 = 0;
        int sredAr2 = 0;
//--------------------------------------------------------
        for (int i = 0; i < myArray1.length; i++)
        sredAr1 += myArray1[i];

        float sredArLong1 = (float)sredAr1/(float) myArray1.length;

//--------------------------------------------------------
        for (int i = 0; i < myArray2.length; i++)
            sredAr2 += myArray2[i];

        float sredArLong2 = (float)sredAr2/(float)myArray2.length;

//---------------------------------------------------------
        if (sredArLong1>sredArLong2) System.out.println("1 student learns better");
        else if (sredArLong1<sredArLong2) System.out.println("2 student learns better");
        else System.out.println("both learn the same");

    }
}
