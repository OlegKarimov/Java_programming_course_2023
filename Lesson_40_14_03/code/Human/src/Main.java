public class Main {
    public static void main(String[] args) {

        System.out.println("Профессии.");

        Human human = new Human("Александр", "Александров");
        Programmer programmer = new Programmer("Wer", "aaa");
        Sportsman sportsman = new Sportsman("Aaaaa", "Bbbbb");
        Admin admin = new Admin("RRRrr", "Kkkkk");

        System.out.println();
        human.work();
        System.out.println();
        programmer.work();
        System.out.println();
        sportsman.work();
        System.out.println();
        admin.work();
        System.out.println();

        Human human1 = programmer;
        Human human2 = sportsman;
        Human human3 = admin;

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println();

        human1.work();
        System.out.println();
        human2.work();
        System.out.println();
        human3.work();
    }
}