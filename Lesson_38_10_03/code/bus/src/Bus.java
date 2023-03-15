//Задача 1. Задача об автобусе: Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест,
// скорость на маршруте (не может быть больше 60 км/ч), стоимость проезда 2 евро.
// В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает его водителем автобуса.
// Сформируйте информцию об автобусе в следующем виде: Информация об автобусе:
// Номер маршрутв : __ Вместимость: ___ кресел Водитель: _____ Скорость на маршруте: _____

// Создать класс Driver с атрибутами: имя водителя, возраст водителя
// (должен быть старшше 21 года и не старше 65 лет).
// Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
// Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
// Автобус за день совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы автобуса.
//
//Делаем сколько сможем.

public class Bus {
    int bus_line; // номер маршрута
    public Driver driver; // водитель взят из класса Driver
    int capacity; // вместимость
    int speed; // скорость автобуса
    int price; // стоимость проезда

    public Bus(int bus_line, int capacity, int speed, int prise) {
        this.bus_line = bus_line;
        //    this.driver = driver;
        this.capacity = capacity;
        this.speed = speed;
        this.price = prise;
    }

    public Driver getDriver() {
        return driver;
    }

    // сеттер назначает водителя для класса Bus из класса Driver
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // метод, который связывает автобус и водителя
    public void go() {
        System.out.println("Автобус " + Bus.this.bus_line + " поехал под управлением - " + driver.getName());
    }


    @Override
    public String toString() {
        return "Информация об автобусе: " + "\n" +
                "Номер маршрута: " + bus_line + "\n" +
                "Вместимость: " + capacity + " кресел " + "\n" +
                "Водитель: " + getDriver().name + "\n" +
                "Скорость на маршруте: " + speed + ". ";
    }

    //    public Bus(int bus_line, String name, String driver, int capacity, int speed, int prise) {
//        this.bus_line = bus_line;
//        this.name = name;
//        this.driver = driver;
//        this.capacity = capacity;
//        if (speed <= 60) {
//            this.speed = speed;
//        } else System.out.println("Автобус с очень большой скоростью. Не безопастно!");
//
//        this.prise = prise;
//    }
//
//    @Override
//    public String toString() {
//        return "Информация об автобусе: номер маршрута: " + bus_line +
//                ", Вместимость : " + capacity +
//                " кресел, водитель: " + driver +
//                ", скорость на маршруте: " + speed +
//                ", цена проезда: " + prise;
//    }

    public int getBus_line() {
        return bus_line;
    }

    public void setBus_line(int bus_line) {
        this.bus_line = bus_line;
    }


//
//    public String getDriver() {
//        return driver;
//    }
//
//    public void setDriver(String driver) {
//        this.driver = driver;
//    }

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
        return price;
    }

    public void setPrise(int prise) {
        this.price = prise;
    }
}
