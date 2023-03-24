public class Admin extends Human {

    public Admin(String firstName, String lastName) {

        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Следить за сетью.");
        help();
    }

    public void help() {
        System.out.println("Помощь пользователям сети.");
    }
}
