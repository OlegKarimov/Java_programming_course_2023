public class Main {
    public static void main(String[] args) {

        System.out.println("Площади фигур.");
        System.out.println();

        Circle c1 = new Circle("Круг", 10);
        double s_cirkle = c1.squere();
        System.out.println("Площадь круга: " + s_cirkle);
        System.out.println();

        Rect r1 = new Rect("Прямоугольник", 10, 5);
        double p = r1.squere();
        System.out.println("Площадь прямоугольника: " + p);
        System.out.println();

        Trapez t1 = new Trapez("Трапеция", 10, 5, 5);
        double t = t1.squere();
        System.out.println("Площадь трапеции: " + t);
        System.out.println();


    }
}