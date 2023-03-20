//Здача 1. Применить stastic: для класса Car и его наследника Auto для поля (переменная)
// класса color (static или просто объявлена) для метода paint - покрасить машину (static или просто)
//
//Можно по аналогии построить пример со static на классах: Human и его дочерние классы:
// Man и Woman методы для Man и Woman - ходить, бегать, говорить

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(0, "Merc", "red");
        //       Car car2 = new Car();


        System.out.println(car1);
        System.out.println(Car.numberOfWheels);
        System.out.println();
    }
}