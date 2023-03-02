package DZ;

//Задача 2(**). Завести двумерный массив для игры в "Морской бой".
// Написать метод, который расставляет на "поле боя" одноклеточный корабль.
// На входе метода - количество клеток корабля (1) и количество кораблей (4).
// Корбли не должны "попадать" один на другой и отстоять друг от друга на 1 клетку со всех сторон корабля.
// На выходе - координаты расставленных на "поле боя" кораблей.

//-----------------------------------------------------------------------------------------------------------

public class DZ_13_02_2 {
    public static void main(String[] args) {

        int[][] arrayPole = new int[10][10];                           // массив поле
        int[][] arrayCoordinatsShip1Deck = new int[2][4];              // массив координат 1 палубных кораблей

        arrayPole = zeroing (arrayPole);                               // обнуление массива поля

        outputArrayAndString(arrayPole,"Пустое поле: ");        // вывод на экран сообцения и массив поля

        arrayCoordinatsShip1Deck = putShip(1,4);  // основной метод расстановки кораблей

        arrayPolePrint(arrayCoordinatsShip1Deck);                       // Печать координат 1 палубных кораблей

        arrayPole = placeOfShips(arrayPole, arrayCoordinatsShip1Deck);  // запись координат в поле

        System.out.println();
        System.out.println();

        outputArrayAndString(arrayPole,"Расположение 1 палубных кораблей на поле: ");
        // вывод на экран сообцения и массив поля

    }

//------------------------------------------
// Печать координат 1 палубных кораблей
    public static void arrayPolePrint(int[][] arrayShip1Deck){
        char[] chars = {'А','Б','В','Г','Д','Е','Ж','З','И','К'};
        System.out.println();
        System.out.println("Массив координат 1 палубных кораблей:");
        for (int j = 0; j < arrayShip1Deck[0].length; j++){
            for (int i = (arrayShip1Deck.length-1); i >= 0; i--){
                if (i == arrayShip1Deck.length-1) System.out.print(chars[arrayShip1Deck[i][j]]+" : ");
                else System.out.print((arrayShip1Deck[i][j]+1));
            }
            System.out.println();
        }
    }

//------------------------------------------
// обнуление массива поля
    public static int[][] zeroing (int[][] arrayZeroPole){

        for (int i = 0; i < arrayZeroPole.length; i++){
            for (int j = 0; j < arrayZeroPole.length; j++){
                arrayZeroPole[i][j] = 0;
            }
        }
        return arrayZeroPole;
    }

//-------------------------------------------
// вывод на экран сообцения и массив поля
    public static void outputArrayAndString (int[][] arrayInput, String strPrint){
        System.out.println(strPrint);
        System.out.println();

        char[] chars = {'А','Б','В','Г','Д','Е','Ж','З','И','К'};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.printf("%4s ","");
        for ( int i=0; i < chars.length; i++){
            System.out.printf("%3s ",chars[i]);
        }
        System.out.println();

        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 0; j <= 11; j++) {
                if (j == 0) System.out.printf("%3s  ", nums[i]);
                    else if (j == 11) System.out.printf("|%3s", nums[i]);
                        else if (arrayInput[i][j - 1] == 0) System.out.printf("|%2s ", '□');
                            else System.out.printf("|%2s ", '■');
            }
            System.out.println();
        }
        System.out.printf("%4s ","");
        for ( int i=0; i < chars.length; i++){
            System.out.printf("%3s ",chars[i]);
        }
        System.out.println();
    }

//-------------------------------------------
// запись координат в поле

    public static int[][] placeOfShips (int[][] arrayPole, int[][] arrayCoordinats){
        for (int i = 0; i < arrayCoordinats[0].length; i++) {
            arrayPole[arrayCoordinats[0][i]][arrayCoordinats[1][i]] = 1;
            }
        return arrayPole;
    }

//-------------------------------------------
// основной метод расстановки кораблей
     public static int[][] putShip (int numberCells, int numberShips){

         int[][] arrayCoordinatsShip1Deck = new int[2][4];
         int[][] arrayPutShip = new int[10][10];
         int index = 0;
         int rndLines;
         int rndColums;
         boolean flag = true;                                  // нужный элемент

         arrayPutShip = zeroing (arrayPutShip);                // обнуление массива поля

         do {

             rndLines = (int) (Math.random() * 10);
             rndColums = (int) (Math.random() * 10);

             if ((rndLines > 0) && (rndLines < 9)) {           // если в центре
                 if ((rndColums > 0) && (rndColums < 9)) {     // если в центре
                     for (int i = (rndLines - 1); i <= (rndLines + 1); i++) {
                         for (int j = (rndColums - 1); j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else if (rndColums == 0) {          // если у левого края
                     for (int i = (rndLines - 1); i <= (rndLines + 1); i++) {
                         for (int j = rndColums; j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else {                             // если у правого края
                     for (int i = (rndLines - 1); i <= (rndLines + 1); i++) {
                         for (int j = (rndColums - 1); j <= rndColums; j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 }
             } else if (rndLines == 0) {                  // если вверху
                 if ((rndColums > 0) && (rndColums < 9)) {  // в центре
                     for (int i = rndLines; i <= (rndLines + 1); i++) {
                         for (int j = (rndColums - 1); j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else if (rndColums == 0) {          // если слева
                     for (int i = rndLines; i <= (rndLines + 1); i++) {
                         for (int j = rndColums; j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else {                          // если у правого края
                     for (int i = (rndLines - 1); i <= rndLines; i++) {
                         for (int j = (rndColums - 1); j <= rndColums; j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 }
             } else {                                         // внизу
                 if ((rndColums > 0) && (rndColums < 9)) {    // в центре
                     for (int i = (rndLines - 1); i <= rndLines; i++) {
                         for (int j = (rndColums - 1); j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else if (rndColums == 0) {          // если слева
                     for (int i = (rndLines - 1); i <= rndLines; i++) {
                         for (int j = rndColums; j <= (rndColums + 1); j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 } else {                          // если у правого края
                     for (int i = (rndLines - 1); i <= rndLines; i++) {
                         for (int j = (rndColums - 1); j <= rndColums; j++) {
                             if (arrayPutShip[i][j] == 1) flag = false;  // есть единица рядом
                         }
                     }
                 }
             }
             if (flag) {
                 arrayPutShip[rndLines][rndColums] = 1;
                 arrayCoordinatsShip1Deck[0][index] = rndLines;
                 arrayCoordinatsShip1Deck[1][index] = rndColums;
                 index++;
             } else flag = true;
         }
         while (index < 4);

         return arrayCoordinatsShip1Deck;

         }
}
