public class Bus {
    int bus_line;
    String name;
    String driver;
    int capacity;
    int speed;
    int prise;

    public Bus(int bus_line, String name, String driver, int capacity, int speed, int prise) {
        this.bus_line = bus_line;
        this.name = name;
        this.driver = driver;
        this.capacity = capacity;
        if (speed <= 60) {
            this.speed = speed;
        } else System.out.println("Автобус с очень большой скоростью. Не безопастно!");

        this.prise = prise;
    }

    public int getBus_line() {
        return bus_line;
    }

    public void setBus_line(int bus_line) {
        this.bus_line = bus_line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
