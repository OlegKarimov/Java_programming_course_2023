package costom_exeption;

public class InvalidAgeExeption extends Exception {
    public InvalidAgeExeption(String str) throws InvalidAgeExeption {
        super(str);
    }
}
