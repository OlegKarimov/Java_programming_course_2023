public class Food {
    private String product;
    private int price;

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String product, int price) {
        this.product = product;
        this.price = price;
    }
}
