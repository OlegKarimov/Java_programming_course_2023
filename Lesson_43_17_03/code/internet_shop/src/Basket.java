import java.util.ArrayList;

//Создать класс Basket, содержащий массив купленных товаров.
public class Basket {
    ArrayList<Product> purchasedProdukts = new ArrayList<Product>();

    public Basket(ArrayList<Product> purchasedProdukts) {
        this.purchasedProdukts = purchasedProdukts;
    }

    @Override
    public String toString() {
        return "Basket " +
                "Produkts: " + purchasedProdukts;
    }
}
