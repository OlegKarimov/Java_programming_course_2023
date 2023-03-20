public class Auto extends Car {

    int capacity;


    public Auto(int age, String model, String color, int capacity) {
        super(age, model, color);
        this.capacity = capacity;
    }

    @Override
    public void paint() {
        System.out.println("Красим на конвеере");
    }
    
}
