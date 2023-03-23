import java.util.StringJoiner;

public class Human implements Comparable<Human> {
    private String name;
    private int height;
    private int weight;
    private int age;

    // конструктор
    public Human(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    // переопределяем метод toString
//    @Override
//    public String toString() {
//        return new StringJoiner(", ", Human.class.getSimpleName() + "[", "]")
//                .add("name='" + name + "'")
//                .add("height=" + height)
//                .add("weight=" + weight)
//                .add("age=" + age)
//                .toString();
//    }

    // сравнение людей по росту
    @Override
    public int compareTo(Human o) {
        // вернуть отриц. число, если this меньше o
        // вернуть 0, если this равно o
        // вернуть полож. число, если this больше o
        return this.height - o.height;
    }

    @Override
    public String toString() {
        return "\n Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}