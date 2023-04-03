public class MathMethods {
    public boolean isPrimeNumber(int number) {  // простые числа
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
