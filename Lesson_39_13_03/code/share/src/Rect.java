public class Rect extends Shape {
    double length;
    double width;

    public Rect(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double squere() {
        return length * width;
    }
}
