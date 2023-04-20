// Задача
//Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков
// (Например, один поток печатает # а второй *).
//В конце работы на экран должно выводиться "end of main"
public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread("Thread 1");
        myThread.start();


        for (int i = 0; i < 100; i++) {
            System.out.print("#");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("main thread interrupted");
            }
        }
        System.out.println();
        System.out.println("end of main");

    }
}