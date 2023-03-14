public abstract class Dancer {
    String name;
    int age;
    String sex;

    public Dancer(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void dance() {
        System.out.println(toString() + " двигается под музыку...");
    }

    @Override
    public String toString() {
        return "Танцор " +
                "Имя: " + name +
                ", возраст: " + age +
                ", пол: " + sex;
    }
}
