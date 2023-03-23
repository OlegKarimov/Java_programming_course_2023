import java.util.Comparator;

public class HumanByAgeComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.age - h2.age; // вернет 0, если равны, отриц. число или положительное число
        // в зависимости от значений age
    }
}