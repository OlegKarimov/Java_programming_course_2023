//Задача 2 (*). Создать абстрактный класс Transport, поля и метды разработать самостоятельно.
// Расширить его классами Auto и Boat. Создать метод, который обеспечивает выдачу VIN для автомобилей и яхт.

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("Mercedes", 2010, "WE2323DR2132", "C230", "red");
        Auto a2 = new Auto("BMW", 2011, "SD23344DO2982", "TDI", "blue");
        Auto a3 = new Auto("AUDI", 2012, "CV3323TR2480", "WSD", "schwarz");

        Boat b1 = new Boat("Cop", 2015, "JK213213IM23234", 500, 20);
        Boat b2 = new Boat("Oll", 2016, "PO1233233IM9J234", 1000, 150);
        Boat b3 = new Boat("Ann", 2017, "ÜÄ878553IM9O234", 1500, 200);

        System.out.println("Авто 1 : " + a1.getModel() + " , VIN Code : " + a1.getVIN_Code());
        System.out.println("Авто 2 : " + a2.getModel() + " , VIN Code : " + a2.getVIN_Code());
        System.out.println("Авто 3 : " + a3.getModel() + " , VIN Code : " + a3.getVIN_Code());

        System.out.println();
        System.out.println("Лодка 1 : " + b1.getModel() + " , VIN Code : " + b1.getVIN_Code());
        System.out.println("Лодка 2 : " + b2.getModel() + " , VIN Code : " + b2.getVIN_Code());
        System.out.println("Лодка 3 : " + b3.getModel() + " , VIN Code : " + b3.getVIN_Code());


    }
}