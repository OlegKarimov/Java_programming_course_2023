public class Programmer extends Human {
    public int experience;

    public Programmer(int age, boolean is_worker, int experience) {
        super(age, is_worker);
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) // если объект obj является экземпляром класса Human
            return false;
        //       if (obj instanceof Programmer) {  проверка
        Programmer that = (Programmer) obj;
        return this.is_worker == that.is_worker
                && this.age == that.age
                && this.experience == that.experience;
    }
}

