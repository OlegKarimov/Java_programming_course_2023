package DZ;

import java.util.Scanner;

public class DZ_13_02 {
    public static void main(String[] args) {

// Задача 1. Завести двумерный масив "шахматная доска". Белый цвет - 0, черный цвет - 1.
// Заполнить массив в соответствии с "шахматной доской" и вывести его на печать.
// Начальная клетка доски А1 - в левом нижнем углу, черная.

        int[][] chessBoard = new int[8][8];

        for (int i = 1; i <= chessBoard.length; i++) {
            for (int j = 1; j <= chessBoard.length; j++) {
                if (i % 2 == 0) {
                    chessBoard[i - 1][j - 1] = (j % 2 == 0) ? 0 : 1;
                } else chessBoard[i - 1][j - 1] = (j % 2 == 0) ? 1 : 0;
            }
        }
//-------------------
        char[] chars = {'A','B','C','D','E','F','G','H'};
        char[] nums = {'8','7','6','5','4','3','2','1'};

        System.out.printf("%4s ","");
        for ( int i=0; i < chars.length; i++){
            System.out.printf("%3s ",chars[i]);
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j <= 10; j++){
                if (j == 1) System.out.printf("%3s  ",nums[i]);
                else if (j == 10) System.out.printf("|%3s",nums[i]);
                else System.out.printf("|%2s ",chessBoard[i][j-2]);
            }
            System.out.println();
        }

        System.out.printf("%4s ","");
        for ( int i=0; i < chars.length; i++){
            System.out.printf("%3s ",chars[i]);
        }
        System.out.println();
        System.out.println();

//----------------------------------------------------------------------------------------------------------

//Задача 3. Задать массив случайных целых чисел в интервале от 1 до 100.
// Метод должен принимать массив целых чисел в качестве параметра
// и возвращать количество поопавших в массив чисел, кратных 10.

        int[] arrayRandoms = new int[20];
        System.out.print("Array of random numbers: ");

        for (int i = 0; i < arrayRandoms.length; i++){
            arrayRandoms[i] = (int) (Math.random() * 100 + 1);
            System.out.print(" "+arrayRandoms[i]+",");
        }

        System.out.println();
        System.out.println("Number of multiples of 10 : "+kolNums(arrayRandoms));
        System.out.println();
        System.out.println();

//-----------------------------------------------------------------------------------------------------------
//Зада4. Вычислить детерминант матрицы 2х2 -5 10 17 3
//D = -5 * 3 - 17 * 10 = -15 - 170 = - 185

        int[][] matrix = new int[2][2];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.println("Enter a number for the matrix element: "+"line "+i+",   colum "+j);
                Scanner scanner = new Scanner(System.in);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println("Determinant: "+determinant(matrix));

    }
//--------------------------------------------------
    public static int kolNums (int[] array){
        int kol = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]%10 == 0) kol++;
        }
        return kol;
    }
//--------------------------------------------------
    public static int determinant(int[][] matr){
        return (matr[0][0]*matr[1][1]-matr[0][1]*matr[1][0]);
    }
}
