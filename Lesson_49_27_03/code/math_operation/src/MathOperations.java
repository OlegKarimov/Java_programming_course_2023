public class MathOperations {

    // математические операции
    // нет полей, только методы

    // этот метод проверяет, является ли число простым
    public boolean isPrime(int number) throws IncorrectNumberException {
        // number = 1, 0, -1
        if (number == 1 || number == -1 || number == 0) {
//            String s = "-1, 0, 1 - are not even numbers";
            throw new IncorrectNumberException();
        }
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // этот метод проверяет, является ли число четным
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // этот метод считает факториал
    public long faktorial(int number) {
        long f = 1;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        return f;
    }
}