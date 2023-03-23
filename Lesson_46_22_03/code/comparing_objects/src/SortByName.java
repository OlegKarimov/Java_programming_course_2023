import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.name.compareTo(b.name);
    }
}
