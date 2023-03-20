//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
public class Product {
    String name;
    double prise;
    int rating;

    public Product(String name, double prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product " +
                "name: " + name +
                ", prise: " + prise +
                ", rating: " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(product.prise, prise) != 0) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(prise);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
