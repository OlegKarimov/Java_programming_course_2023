public class IncorrectNumberException extends Exception {

    @Override
    public String getMessage() {
        String s = "-1, 0, 1 are not prime numbers";
        return s;
    }

}