public class Track extends Car {
    String brand;
    int load_weight;

    public Track(int age, String usage, int speed, String brand, int load_weight) {
        super(age, usage, speed);
        this.brand = brand;
        this.load_weight = load_weight;
    }

    @Override
    public void stop() {
        System.out.println("Track остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void go() {
        super.go();
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

    public int getLoad_weight() {
        return load_weight;
    }

    public void setLoad_weight(int load_weight) {
        this.load_weight = load_weight;
    }

    @Override
    public String toString() {
        return "Track: " +
                "brand: " + brand +
                ", load weight: " + load_weight +
                ", age: " + age +
                ", usage: " + usage +
                ", speed: " + speed;
    }
}
