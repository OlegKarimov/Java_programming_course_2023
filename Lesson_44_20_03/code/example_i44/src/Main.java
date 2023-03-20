import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сортировка");

        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("C");
        ts.add("A");
        ts.add("J");
        ts.add("aaa");
        ts.add(" ");
        ts.add("E");
        ts.add("10");
        ts.add("Ekateryna");
        ts.add("D");
        ts.add("F");

        System.out.println(ts);

        TreeSet ts2 = new TreeSet();
        TreeSet ts3 = new TreeSet();
        ts2.add(4.0);
        ts2.add(2.5);
        ts2.add(-5.0);
        ts2.add(10000000.0);
        ts2.add(0.2);

        System.out.println(ts2);
        //   ts2.clone();

    }
}