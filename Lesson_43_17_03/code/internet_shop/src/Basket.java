import java.util.ArrayList;

//Создать класс Basket, содержащий массив купленных товаров.
public class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket(ArrayList<Product> purchasedProdukts) {
        this.purchasedProducts = purchasedProdukts;
    }

    @Override
    public String toString() {
        return "Basket " +
                "Produkts: " + purchasedProducts;
    }
}
