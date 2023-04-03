package costom_exeption;

public class Voter {
    public static void main(String[] args) //throws InvalidAgeExeption
    {
        try {
            validate(12);
        } catch (InvalidAgeExeption ex) {
            System.out.println("Exception occured: " + ex);
        }

    }

    static void validate(int age) throws InvalidAgeExeption {
        if (age < 18) {
            throw new InvalidAgeExeption("age is not to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
