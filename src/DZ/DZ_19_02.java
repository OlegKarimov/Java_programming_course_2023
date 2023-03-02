package DZ;

import java.util.ArrayList;
import java.util.Arrays;

public class DZ_19_02 {
    public static void main(String[] args) {

// Задача 1. Создать массив, в котором храняться названия дней недели.
// Вывести на печать выходные дни.

        ArrayList<String> arrayDays = new ArrayList<String>(
                Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("Weekend is :" + arrayDays.get(5) + ", " + arrayDays.get(6));

        System.out.println();

//--------------------------------------------------------------------------------------

// Задача 2. Создать массив, содержащий данные о дневной температуре в вашем городе с начала февраля 2023 года.
// Определить среднюю температуру месяца.

        ArrayList<Integer> myArrayTemperatur = new ArrayList<Integer>(Arrays.asList(0, -1, -2, 0, 2, 1, 2, -4));
        double temperatur = 0;
        for (int i = 0; i < myArrayTemperatur.size(); i++)
            temperatur += myArrayTemperatur.get(i);

        temperatur /= myArrayTemperatur.size();

        System.out.println("Average temperature : " + temperatur);

        System.out.println();

//-------------------------------------------------------------------------------------

// Задача 3(*). Создать массив, в котором храняться даты и температуры.
// Вывести на печать таблицу с данными оо температуре по дням и среднюю температуру за период наблюдения.

        ArrayList<String> arrayData = new ArrayList<String>(Arrays.asList("01.02.2023", "02.02.2023", "03.02.2023", "04.02.2023", "05.02.2023", "06.02.2023",
                "07.02.2023", "08.02.2023"));
        ArrayList<Integer> arrayTemperatura = new ArrayList<Integer>(Arrays.asList(-2, 2, 3, 4, -3, -5, -4, -6));

        if (arrayData.size() != arrayTemperatura.size())
            System.out.println("Error: number of days is not equal to number of trmperatur!");
        else {
            System.out.println("Temperature table:");
            double temperaturAve = 0;
            for (int i = 0; i < arrayData.size(); i++) {
                System.out.println(arrayData.get(i) + " : " + arrayTemperatura.get(i));
                temperaturAve += arrayTemperatura.get(i);
            }

            System.out.println();
            System.out.println("Average temperature : " + temperaturAve / arrayTemperatura.size());

        }
        System.out.println();
        System.out.println();

//---------------------------------------------------------------------------------------------------------
//Задача 2. Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек, куда может попасть шарик,
// и два цвета - красный, черный. Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет"

        ArrayList<Integer> arrCellRes = new ArrayList<Integer>();
        ArrayList<Boolean> arrColorRes = new ArrayList<Boolean>();
        for (int i = 0; i < 20; i++) {
            boolean colorRes = true;           // true - rot, false - black
            int indexColor;

            arrCellRes.add((int) (Math.random() * 36 + 1));
            indexColor = (int) (Math.random() * 2 + 1);
            arrColorRes.add((indexColor == 1) ? true : false);

        }
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ". Выиграл номер " + arrCellRes.get(i) + ((arrCellRes.get(i) % 2 == 0) ? " , четное, " : " , нечетное, ") +
                    (arrColorRes.get(i) ? "красный" : "черный"));
        }

        System.out.println();
        System.out.println();

    }
}
