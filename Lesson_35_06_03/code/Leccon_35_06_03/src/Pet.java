// задаем класс Домашние животные
public class Pet {
    String type; // тип - кошка, собака, корова и т.д.
    String breed; // порода
    String name; // имя
    double weight; // вес

    // Конструктор класса Домашние животные
    public Pet() {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }

    // Getter и Setter класса Домашние животные
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // метод класса Домашние животные, который выводит в строку все значения полей Объекта Класса
    @Override
    public String toString() {
        return "Мое домашнее животное: " +
                "тип = '" + type + '\'' +
                ", порода = '" + breed + '\'' +
                ", имя = ' " + name + '\'' +
                ", вес = " + weight +
                '.';
    }
}