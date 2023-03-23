import java.util.Comparator;

public class SortDogsByName implements Comparator<Dog> {
    @Override
    public int compare(Dog d, Dog d1) {
        return d.name.compareTo(d1.name);
    }
}
