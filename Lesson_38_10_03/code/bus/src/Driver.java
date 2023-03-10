public class Driver {
    String name;
    int age;

    public Driver(String name, int age) {
        this.name = name;
        if ((age > 21) && (age < 65)) {
            this.age = age;
        } else System.out.println("Водитель должен быть старшше 21 года и не старше 65 лет.");
    }
}
