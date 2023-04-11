public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

    public static int max(int[] ints) {
        int max = ints[0]; // 2

        for (int i = 1; i < ints.length; i++) { // 2+2n
            if (ints[i] > max) { //  2n
                max = ints[i];   //  2n
            }
        }       // 2+2+2n+4n
        return max;
    }
}