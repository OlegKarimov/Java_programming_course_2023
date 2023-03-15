public class Bus extends Car {
    String brand;
    int seats;

    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился");
        speed = 0;
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге c пассажирами");
        this.speed = speed;
    }

    @Override
    public void speed_up() {
        super.speed_up();
    }

    @Override
    public void speed_down() {
        super.speed_down();
    }

    @Override
    public String toString() {
        return "Bus: " +
                "brand: " + brand +
                ", seats: " + seats +
                ", age: " + age +
                ", usage: " + usage +
                ", speed: " + speed;
    }
}
