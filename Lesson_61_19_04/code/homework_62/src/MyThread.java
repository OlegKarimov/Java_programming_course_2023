public class MyThread extends Thread {
    MyThread(String name) {

        super(name);
    }

    public void run() {
        try {
            for (int counter = 0; counter < 100; counter++) {
                Thread.sleep(200);
                System.out.println("*");
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }
}
