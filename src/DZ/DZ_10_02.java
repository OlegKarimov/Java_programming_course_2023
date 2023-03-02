package DZ;

public class DZ_10_02 {
    public static void main(String[] args) {
//Задача 1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int oddNum = 0;
        for (int i = 1; i <= 99; i = i + 2)
            oddNum++;

        int[] oddArray = new int[oddNum];

//--------------------------
        int indexArray = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            oddArray[indexArray] = i;
            indexArray++;
        }
//--------------------------

        System.out.print("Array: ");
        for (int i = 0; i < oddNum; i++)
            System.out.print(oddArray[i] + " | ");

//---------------------------
        System.out.println();
        System.out.print("Array in reverse: ");
        for (int i = oddNum - 1; i >= 0; i--)
            System.out.print(oddArray[i] + " | ");

        System.out.println();
        System.out.println();

//---------------------------------------------------------------------------------------------------------
//Задача 2. Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек, куда может попасть шарик,
// и два цвета - красный, черный. Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет"


        for (int i = 1; i <= 20; i++) {
            int cellRes = 0;
            boolean colorRes = true;           // true - rot, false - black
            int indexColor;

            cellRes = (int) (Math.random() * 36 + 1);
            indexColor = (int) (Math.random() * 2 + 1);
            colorRes = (indexColor == 1) ? true : false;

            System.out.println(i+". Выиграл номер " +  cellRes + ((cellRes%2 == 0) ? " , четное, " : " , нечетное, ")+
                    (colorRes ? "красный" : "черный"));
        }
            System.out.println();
            System.out.println();

//-------------------------------------------------------------------------------------------------------
// Задача 4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Первый и второй члены последовательности Фибоначчи равны единицам, а каждый следующий — сумме двух предыдущих.

            int[] arrFibonachi = new int[20];
            System.out.print("Fibonacci numbers: ");

            for( int i = 0; i < arrFibonachi.length; i++){
                if(i < 2){
                    arrFibonachi[i]=1;
                }
                else {
                    arrFibonachi[i] = arrFibonachi[i-2]+arrFibonachi[i-1];
                }
                System.out.print(arrFibonachi[i]+", ");
            }

// Задача 3. Смоделировать поведение биржевого индекса в течение месяца.
// Биржевой индекс выбрать самостоятельно, данные о его изменениях взять из Интернета, месяц - январь 2023 года.

    }

}
