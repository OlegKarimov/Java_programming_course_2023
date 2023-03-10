public class Voter {
    String ID_num;
    int age;
    String name;

    public Voter(String ID_num, int age, String name) {
        this.ID_num = ID_num;
        if (age >= 16) {
            this.age = age;
        } else {
            this.age = age;
            System.out.println("Избератель ещё не можетголосовать.");
        }
        if (name.equals("")) {
            System.out.println("Имя не может быть пустым.");
        } else {
            this.name = name;
        }

    }

    @Override
    public String toString() {
        return "Voter{" +
                "ID_num='" + ID_num + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
