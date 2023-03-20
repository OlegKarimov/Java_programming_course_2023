//Создать класс Категория, имеющий переменные имя и массив товаров.

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> Products = new ArrayList<Product>();

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        Products = products;
    }

    @Override
    public String toString() {
        return "Category " +
                "name: " + name +
                ", Products: " + Products;
    }
}
