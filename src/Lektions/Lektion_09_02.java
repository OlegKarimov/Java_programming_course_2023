package Lektions;

public class Lektion_09_02 {
    public static void main(String[] args) {
/*
        double a = Math.random();

        double x = (Math.random()*(b-a)) + a  // генерирует дробное число random [a,b)  (a<b)

        int k = (int)((Math.random()*(b-a+1)) + a)  // генерирует целое число random [a,b]  (a<b)

 */
//-----------------------------------------------------------------------------------------------
//Заполнение массива циклом for по математической закономерности
// for (i = 0, i < myArray.lenght, i++){ myArray[i] = 5*i + 2}
// арифметическая прогрессия геометрическая прогрессия значеня заданной функции
//  A(n) = A1 + d*(n-1), d - разница прогрессии

        int[] myArray = new int[10];
        for (int i = 0; i<myArray.length; i++){
            myArray[i] = 15 + 7*(i);
            System.out.print(myArray[i]+" | ");
        }
//------------------------------------------------------------------
// Бросаем кубик с 6 гранями 20 раз
        System.out.println();
        System.out.println();

        int[] myKub = new int[20];
        for (int i = 0; i<myKub.length; i++){
            myKub[i] = (int)(Math.random()*6 + 1);
            System.out.print(myKub[i]+" | ");
        }

        System.out.println();
        int[] myKub1 = new int[20];
        for (int i = 0; i<myKub1.length; i++){
            myKub1[i] = (int)(Math.random()*2 + 1);
            System.out.print(myKub1[i]+" | ");
        }








    }
}
