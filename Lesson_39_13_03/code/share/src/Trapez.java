public class Trapez extends Shape {
    double width1;
    double width2;
    double height;


    public Trapez(String name, double width1, double width2, double height) {
        super(name);
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }

    @Override
    public double squere() {
        return (width1 + width2) * height / 2;
    }
}
