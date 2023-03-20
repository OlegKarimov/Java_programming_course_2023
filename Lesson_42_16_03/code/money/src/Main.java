public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение для класса Money");

        Money m1 = new Money(1000, "usd");
        Money m2 = new Money(1000, "qwe");
        //  System.out.println(m1.toString());
        System.out.println(m1);
        System.out.println();
        System.out.println(m1.equals(m2));

        // создать еще элементы (объекты) класса Money

        // придумать примаер, когда мы какие-то деньги сравниваем с каими-то другими деньгами
        //

    }
}