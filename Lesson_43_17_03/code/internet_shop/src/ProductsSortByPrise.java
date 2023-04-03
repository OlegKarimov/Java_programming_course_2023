import java.util.Comparator;

public class ProductsSortByPrise implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrise() - o2.getPrise());
    }
}
