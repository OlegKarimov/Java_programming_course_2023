// На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
// массив отсортирован от меньшего к большему элементу
// пользователь вводит интересующее его число - есть оно в массиве или нет?
// на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
// ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
// продолжать,пока не будет найден искомый элемент массива или не закончится массив

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 5, 19, 22, 33, 46, 51, 64, 85, 99};
        int len = arr.length;
        System.out.println("Input n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        boolean bul = false;

        int il = 0;
        int ir = len - 1;
        int im = len / 2 - 1;

        while (il <= ir) {
            if (n < arr[im]) {
                ir = im - 1;
                im = il + (ir - il) / 2;
            } else if (n > arr[im]) {
                il = im + 1;
                im = il + (ir - il) / 2;
            } else {
                bul = true;
                break;
            }
        }
        if (bul) {
            System.out.println("Цифра " + n + " находится на позиции " + (im + 1));
        } else System.out.println("Цифра " + n + " отсутствует");
    }
}