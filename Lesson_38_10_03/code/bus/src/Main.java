//Задача 1. Задача об автобусе: Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест,
// скорость на маршруте (не может быть больше 60 км/ч), стоимость проезда 2 евро.
// В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает его водителем автобуса.
// Сформируйте информцию об автобусе в следующем виде: Информация об автобусе:
// Номер маршрутв : __ Вместимость: ___ кресел Водитель: _____ Скорость на маршруте: _____
// Создать класс Driver с атрибутами: имя водителя, возраст водителя
// (должен быть старшше 21 года и не старше 65 лет).
// Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).

// Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
// Автобус за день совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы автобуса.
//
//Делаем сколько сможем.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bus b1 = new Bus(1, "Berlin-Hamburg", "Иванов", 30, 50, 10);
        Bus b2 = new Bus(2, "Berlin-Paris", "Петров", 35, 55, 100);
        Bus b3 = new Bus(3, "Berlin-München", "Сидоров", 32, 58, 50);

        //System.out.println("Информация об автобусе: номер маршрута - " + b1.getBus_line() + ", Вместимость : " + b1.getCapacity() + " кресел, водитель - " + b1.getDriver() + ", скорость на маршруте - " + b1.getSpeed());
        //System.out.println("Информация об автобусе: номер маршрута - " + b2.getBus_line() + ", Вместимость : " + b2.getCapacity() + " кресел, водитель - " + b2.getDriver() + ", скорость на маршруте - " + b2.getSpeed());
        //System.out.println("Информация об автобусе: номер маршрута - " + b3.getBus_line() + ", Вместимость : " + b3.getCapacity() + " кресел, водитель - " + b3.getDriver() + ", скорость на маршруте - " + b3.getSpeed());

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        // В классе Bus создайте метод setDriver,
        // который принимает имя драйвера и назначает его водителем автобуса.
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите имя водителя автобуса маршрута " + b1.getBus_line());
        String nameDriver = sc.nextLine();
        b1.setDriver(nameDriver);

        System.out.println("Введите имя водителя автобуса маршрута " + b2.getBus_line());
        nameDriver = sc.nextLine();
        b2.setDriver(nameDriver);

        System.out.println("Введите имя водителя автобуса маршрута " + b3.getBus_line());
        nameDriver = sc.nextLine();
        b3.setDriver(nameDriver);

        System.out.println();
        System.out.println("Обновлённая информация:");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

    }

}