public class Car {
    static final int numberOfWheels = 4;
    private int age;
    private String model;
    private static String color;

    public Car(int age, String model, String color) {
        this.age = age;
        this.model = model;
        this.color = color;
    }


    public void paint() {
        System.out.println("Красим авто в " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                "numberOfWheels = " + numberOfWheels + '}';
    }
}
