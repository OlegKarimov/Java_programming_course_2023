public class Main {
    public static void main(String[] args) throws IncorrectNumberException {
        System.out.println("Математические операции");

        MathOperations operations = new MathOperations();

        System.out.println(operations.isPrime(7));
        System.out.println(operations.isPrime(121));
        System.out.println(operations.isPrime(31));
        System.out.println(operations.isPrime(56));
        try {
            System.out.println(operations.isPrime(-1));
            System.out.println(operations.isPrime(0));
            System.out.println(operations.isPrime(1));
        } catch (IncorrectNumberException ex) {
            System.out.println(ex.getMessage());
            System.out.println("-1, 0, 1 are not PRIME NUMBERS");
        }
        System.out.println();

        System.out.println(operations.isEven(6));
        System.out.println(operations.isEven(121));
        System.out.println(operations.isEven(32));
        System.out.println(operations.isEven(71));

        System.out.println();

        System.out.println(operations.faktorial(5));

    }
}
