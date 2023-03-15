public class Sportsman extends Human {


    public Sportsman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Надо идти на тренеровку.");
        playFootball();
    }

    public void playFootball() {
        System.out.println("Бегать с мячом.");
    }
}
