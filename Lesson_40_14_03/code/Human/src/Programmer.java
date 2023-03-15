public class Programmer extends Human {

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Программист любит писать код.");
        doCode();
    }

    public void doCode() {
        System.out.println("Сидим за клавиатурой и печатаем код.");
    }
}
