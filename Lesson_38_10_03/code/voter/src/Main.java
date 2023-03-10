public class Main {
    public static void main(String[] args) {
        System.out.println("Контороль изберателя на уровне конструктора класса");
        System.out.println();

        Voter v1 = new Voter("123", 15, "Willy");
        System.out.println(v1);

        System.out.println();
        Voter v2 = new Voter("345", 35, "Qayx");
        System.out.println(v2);

        System.out.println();
        Voter v3 = new Voter("awdaw", 30, "");
        System.out.println(v3);

    }
}