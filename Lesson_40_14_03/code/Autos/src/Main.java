public class Main {
    public static void main(String[] args) {

        System.out.println("Автомобили и полиморфизм.");
        System.out.println();

        Auto auto1 = new Auto(5, "Car", 30, "Mercedes", 1500);
        Bus bus1 = new Bus(7, "Bus", 40, "BUS", 35);
        Track tr1 = new Track(2, "Track", 50, "TR", 3000);


        System.out.println(auto1.toString());
        auto1.go();
        System.out.println();
        System.out.println(bus1.toString());
        bus1.go();
        System.out.println();
        System.out.println(tr1.toString());
        tr1.go();
//---------------------------------------------
        System.out.println();
        auto1.speed_up();
        System.out.println(auto1.toString());
        System.out.println();
        bus1.speed_up();
        System.out.println(bus1.toString());
        System.out.println();
        bus1.speed_up();
        System.out.println(tr1.toString());
//---------------------------------------------
        System.out.println();
        auto1.stop();
        System.out.println(auto1.toString());
        System.out.println();
        bus1.stop();
        System.out.println(bus1.toString());
        System.out.println();
        tr1.stop();
        System.out.println(tr1.toString());
//---------------------------------------------

        System.out.println();
        auto1.setSpeed(10);
        System.out.println(auto1.toString());
        auto1.go();
    }
}