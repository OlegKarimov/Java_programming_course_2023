
//Задача 1. Создайте класс Wine, который содержит переменные name, sort и year. Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных методом toString.
// Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
// Выводит на консоль сообщение "На складе имеется количество бутылок".
// Задайте метод getYear – возвращает год производства вина. Вызвать этот метод для каждого из объектов.
//
//Можно выполнить это задание на примере собственного класса с тремя полями.
//
//Задача 2. Предложить набор полей для классов:
//
//Студент
//Читатель библиотеки
//Напиток

//Задача 3 (*) Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте,
// длина маршрута. Реализовать для него методы go, stop, speedUp, speedDouwn
public class Main {
    public static void main(String[] args) {
        Wine myWineWhite = new Wine();
        myWineWhite.name = "Шато Будо";
        myWineWhite.sort = "Шардоне";
        myWineWhite.year = 1900;

        Wine myWineRed = new Wine();
        myWineRed.name = "Савиньён";
        myWineRed.sort = "Шардоне";
        myWineRed.year = 1950;

        Wine myWinePink = new Wine();
        myWinePink.name = "Пинагриджио";
        myWinePink.sort = "Шардоне";
        myWinePink.year = 1980;

        System.out.println(myWineWhite.toString());
        System.out.println(myWineRed.toString());
        System.out.println(myWinePink.toString());

//-------------------------------------------------------------
        System.out.println("Вино " + myWineWhite.name);
        System.out.println(myWineWhite.onStock(5));

//------------------------------------------------------------
        System.out.println();
        System.out.println("Год вина " + myWineWhite.getName() + " : " + myWineWhite.getYear());
        System.out.println("Год вина " + myWineRed.getName() + " : " + myWineRed.getYear());
        System.out.println("Год вина " + myWinePink.getName() + " : " + myWinePink.getYear());
    }
}