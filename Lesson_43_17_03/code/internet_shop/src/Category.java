//Создать класс Категория, имеющий переменные имя и массив товаров.

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> Products;

//    public Category(String name, ArrayList<Product> products) {
//        this.name = name;
//        Products = products;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> products) {
        Products = products;
    }

    @Override
    public String toString() {
        return "Category " +
                "name: " + name +
                ", Products: " + Products;
    }
}
