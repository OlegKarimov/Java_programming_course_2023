public class Main {
    public static void main(String[] args) {

// ООП !!!!

        class Car {
            String brand;
            String color;
            int yer;
            String type;
        }

        Car myCar = new Car();
        myCar.brand = "VW";
        myCar.color = "silver";
        myCar.type = "universal";
        myCar.yer = 2018;

        System.out.println("Марка автомобиля : " + myCar.brand);
        System.out.println();

//--------------------------------------------------------------------------------
        Pet myPet = new Pet();
        myPet.type = "Cat";
        myPet.breed = "Burmese";
        myPet.name = "Benjamin";
        myPet.weight = 4.50;

        System.out.println("My pet: " + myPet.type + ", " + myPet.breed + ", name " + myPet.name + ", weight " + myPet.weight);
        System.out.println();
        System.out.println(myPet.toString());
        System.out.println("Вес: " + myPet.getWeight());

    }
}