public class Human {
    public int age;
    public boolean is_worker;

    public Human(int age, boolean is_worker) {
        this.age = age;
        this.is_worker = is_worker;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {       // если объект obj является экземпляром класса Human
            return false;
        }
        Human that = (Human) obj;
        return this.is_worker == that.is_worker && this.age == that.age;
    }
}