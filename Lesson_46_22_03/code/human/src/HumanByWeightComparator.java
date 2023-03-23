import java.util.Comparator;

public class HumanByWeightComparator implements Comparator<Human> {

    // сравниваем сначала по весу, потом по возрасту
    @Override
    public int compare(Human h1, Human h2) {
        // h1 вес 100кг, h2 = 50кг -> 50 +
        // h2 вес 100кг, h1 = 50, -
        //if ((h1.getWeight() - h2.getWeight()) == 0) { // если вес совпал, то сравниваем по годам
        if ((h1.weight - h2.weight) == 0) { // если вес совпал, то сравниваем по годам
            return h1.age - h2.age;
        } else {
            return h1.weight - h2.weight;
        }
    }
}