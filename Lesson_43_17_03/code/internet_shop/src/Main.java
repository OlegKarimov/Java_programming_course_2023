//**Интернет магазин, часть 1**
//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//Создать класс Категория, имеющий переменные имя и массив товаров.
//Создать несколько объектов класса Категория.
//Создать класс Basket, содержащий массив купленных товаров.
//Создать класс User, содержащий логин, пароль и объект класса Basket.
//Создать несколько объектов класса User.

//Вывести на консоль каталог продуктов.
//Вывести на консоль покупки посетителей магазина.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Интернет магазин");
        System.out.println();

        Product pen = new Product("Ручка", 0.1, 5);
        Product pencil = new Product("Карандаш", 0.1, 6);
        Product notebook = new Product("Тетрадь", 0.2, 8);

        Product drill = new Product("Дрель", 20, 7);
        Product hammer = new Product("Молоток", 10, 6);

        Product cola = new Product("Coca Cola", 2, 7);
        Product sprite = new Product("Sprite", 2, 7);
        Product fanta = new Product("Fanta", 2, 7);

        ArrayList<Product> arrayListStationery = new ArrayList<>(Arrays.asList(pen, pencil, notebook));
        Category stationeryKategory = new Category("Канцтовары", arrayListStationery);

        ArrayList<Product> arrayListTools = new ArrayList<>(Arrays.asList(drill, hammer));
        Category toolsKategory = new Category("Инструменты", arrayListTools);

        ArrayList<Product> arrayListDrinks = new ArrayList<>(Arrays.asList(cola, sprite, fanta));
        Category drinksKategory = new Category("Напитки", arrayListDrinks);

        ArrayList<Product> productArrayListUser1 = new ArrayList<>(Arrays.asList(cola, drill, pen));
        Basket basketUser1 = new Basket(productArrayListUser1);
        User user1 = new User("Вася", "log1", "pass1", basketUser1);

        System.out.println(stationeryKategory);
        System.out.println(toolsKategory);
        System.out.println(drinksKategory);
        System.out.println();

        System.out.println(user1);


    }

}