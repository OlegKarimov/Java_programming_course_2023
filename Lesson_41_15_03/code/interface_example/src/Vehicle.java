public class Vehicle implements Move {
    @Override
    public void moveFast() {
        System.out.println("Fast speed---");
    }

    @Override
    public void moveSlow() {
        System.out.println("Slow speed---");
    }
}
