public class Auto extends Car {
    String brand;
    int capacity;

    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге всей семьей");
    }

    @Override
    public void speed_up() {
        super.speed_up();
    }

    @Override
    public void speed_down() {
        super.speed_down();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "Auto: " +
                "brand: " + brand +
                ", capacity: " + capacity +
                ", age: " + age +
                ", usage: " + usage +
                ", speed: " + speed;
    }
}
