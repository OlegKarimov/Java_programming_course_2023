package DZ;

public class DZ_09_02 {
    public static void main(String[] args) {

// Структурное программирование !!!! Доклад

// Задача 1. Создать массив, в котором храняться названия дней недели.
// Вывести на печать выходные дни.

        String[] arrayDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Weekend is :"+arrayDays[5]+", "+arrayDays[6]);

        System.out.println();

//--------------------------------------------------------------------------------------

// Задача 2. Создать массив, содержащий данные о дневной температуре в вашем городе с начала февраля 2023 года.
// Определить среднюю температуру месяца.

        int[] myArrayTemperatur = {0, -1, -2, 0, 2, 1, 2, -4};
        double temperatur = 0;
        for (int i=0; i<myArrayTemperatur.length; i++)
            temperatur += myArrayTemperatur[i];

        temperatur /= myArrayTemperatur.length;

        System.out.println("Average temperature : "+temperatur);

        System.out.println();

//-------------------------------------------------------------------------------------

// Задача 3(*). Создать массив, в котором храняться даты и температуры.
// Вывести на печать таблицу с данными оо температуре по дням и среднюю температуру за период наблюдения.

        String[] arrayData = {"01.02.2023","02.02.2023","03.02.2023","04.02.2023","05.02.2023","06.02.2023",
                "07.02.2023","08.02.2023"};
        int[] arrayTemperatura = {-2,2,3,4,-3,-5,-4,-6};

        if (arrayData.length != arrayTemperatura.length)
            System.out.println("Error: number of days is not equal to number of trmperatur!");
        else {
            System.out.println("Temperature table:");
            double temperaturAve = 0;
            for (int i = 0; i<arrayData.length;i++) {
                System.out.println(arrayData[i] + " : " + arrayTemperatura[i]);
                temperaturAve += arrayTemperatura[i];
            }

            System.out.println();
            System.out.println("Average temperature : "+temperaturAve/arrayTemperatura.length);

        }

    }
}
