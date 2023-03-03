import java.util.Scanner;

public class DZ {

    public static void main(String[] args) {

// Задача 1
//Создать собственный emun на выбранную самостоятельно тему и вывести его на печать.
        enum Day {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        System.out.println("Вывод списка : ");
        for (Day deys : Day.values()) {
            System.out.println(deys);
        }
        System.out.println("-----------------------------------------------------------");

//------------------------------------------------------------------------------------------------------
//Задача 2
//Создать список из 5 валют с помошью enum. По выбору пользователя отобразить текущий курс валюты к евро.
        enum Many {
            Доллар,
            Гривна,
            Рубли,
            Ены,
            Фунты,
        }

        for (Many i : Many.values()) {
            System.out.println(i);

            System.out.println("Выберите валюту 1-5 ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            Many many = Many.Доллар;

            double kurs = 0;

            //выбор пользователя
            switch (choice) {
                case 1: {
                    many = Many.Доллар;
                    break;
                }
                case 2: {
                    many = Many.Гривна;
                    break;
                }
                case 3: {
                    many = Many.Рубли;
                    break;
                }
                case 4: {
                    many = Many.Ены;
                    break;
                }
                case 5: {
                    many = Many.Фунты;
                    break;
                }
            }

            switch (many) {
                case Доллар -> {
                    kurs = 1.2;
                    System.out.println("Курс доллора к евро : " + kurs);
                    break;
                }
                case Гривна -> {
                    kurs = 39;
                    System.out.println("Курс гривны к евро : " + kurs);
                    break;
                }
                case Рубли -> {
                    kurs = 70;
                    System.out.println("Курс рубля к евро" + kurs);
                    break;
                }
                case Ены -> {
                    kurs = 100;
                    System.out.println("Курс ены к евро" + kurs);
                    break;
                }
                case Фунты -> {
                    kurs = 0.5;
                    System.out.println("Курс ены к евро" + kurs);
                    break;
                }
            }

        }
    }
}
