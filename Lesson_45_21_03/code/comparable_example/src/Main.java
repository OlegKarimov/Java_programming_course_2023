import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение домов");
        House h1 = new House(100, 150000, "NY");
        House h2 = new House(85, 120000, "London");
        House h3 = new House(120, 180000, "Berlin");
        House h4 = new House(150, 140000, "Moscow");

        TreeSet<Object> housesList = new TreeSet<>();

        housesList.add(h1);
        housesList.add(h2);
        housesList.add(h3);
        housesList.add(h4);

        System.out.println(housesList);
    }
}