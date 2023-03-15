//Задача 1. Опишите словами, что изменилось в вашем процессе прграммирования после внедрения
// в него концепции ООП?
//
// 1. Стало проще писать, делить задачи на подзадачи.
// 2. Стало проще читать код, класс Main стал короче и понятнее
// 3. Стало быстрее писать ПО, т.к. в IDEA многий код дописывается автоматом


//Задача 2. Пересмотреть ролик https://www.youtube.com/watch?v=FcKmgtMPvY0
// Повторить код в классах Human и Programmer

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer(40, true, 10);
        Programmer programmer2 = new Programmer(40, true, 10);
        Scanner scanner = new Scanner(System.in);
        Programmer programmer3 = null;
        Programmer programmer4 = new Programmer(40, true, 20);

        Human human1 = new Human(20, true);
        Human human2 = new Human(20, true);
        Human human3 = null;

        System.out.println("human1.equals(human2) = " + human1.equals(human2));
        System.out.println("human1.equals(scanner) = " + human1.equals(scanner));
        System.out.println("human1.equals(human3) = " + human1.equals(human3));
        System.out.println("programmer1.equals(programmer2) = " + programmer1.equals(programmer2));
        System.out.println("programmer1.equals(programmer3) = " + programmer1.equals(programmer3));
        System.out.println("programmer1.equals(programmer4) = " + programmer1.equals(programmer4));
    }
}