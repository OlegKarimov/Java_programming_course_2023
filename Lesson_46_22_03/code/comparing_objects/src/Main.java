import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сортируем работников");
        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1040, "Andrei", "Berlin"));
        employeeList.add(new Employee(1020, "Yakov", "Munchen"));
        employeeList.add(new Employee(1030, "Peter", "Hamburg"));

        System.out.println("Unsorted data");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
        System.out.println();

        Collections.sort(employeeList, new SortByID()); // вызываем метод sort для коллекции
        System.out.println("Sorted data according to Employee IDs");
        // печатаем
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
        System.out.println();

        Collections.sort(employeeList, new SortByName());
        // печатаем
        System.out.println("Sorted data according to Employee name");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        // Делаем сортировку класса Employee по его полям
//        System.out.println("Сортируем работников (объекты класса Employee )");
//        System.out.println();
//
//        ArrayList<Employee> employeeList = new ArrayList<Employee>(); // объявили новый ArrayList для сотрудников
//
//        // создаем объекты и кладем их в ArrayList
//        employeeList.add(new Employee(1040, "Andrei", "Berlin"));
//        employeeList.add(new Employee(1020, "Yakov", "Munchen"));
//        employeeList.add(new Employee(1030, "Peter", "Hamburg"));
//
//        // печатаем ArrayList d в проядке его создания
//        System.out.println("Unsorted Data");
//        for (int i = 0; i < employeeList.size(); i++){
//            System.out.println(employeeList.get(i));
//        }
//        System.out.println();
//
//        Collections.sort(employeeList, new SortbyID()); // вызываем метод sort для коллекции
//        System.out.println("Sorted data according to Employee IDs");
//        // печатаем
//        for (int i = 0; i < employeeList.size(); i++) {
//            System.out.println(employeeList.get(i));
//        }
//        System.out.println();
//
//        Collections.sort(employeeList, new SortbyName());
//        // печатаем
//        System.out.println("Sorted data according to Employee name");
//        for (int i=0; i < employeeList.size(); i++) {
//            System.out.println(employeeList.get(i));
//        }
//
//    }
//}