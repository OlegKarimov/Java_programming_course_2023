public class HumanClass implements Comparable<HumanClass> {
    String name;
    int age;

    public HumanClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                ", age : " + age + '\n';
    }

    @Override
    public int compareTo(HumanClass o) {
        if (this.age == o.age)
            return 0;
        if (this.age < o.age) {
            return -1;
        } else return 1;

        // return this.age -person.age;
    }
}
