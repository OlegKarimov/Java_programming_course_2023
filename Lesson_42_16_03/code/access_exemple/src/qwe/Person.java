package qwe;

public class Person {
    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void dysplayName() {
        System.out.printf("Name %s\n", name);
    }

    void dysplayAge() {
        System.out.printf("Name %d\n", age);
    }

    private void dysplayAddress() {
        System.out.printf("Name %s\n", address);
    }

    protected void dysplayPhone() {
        System.out.printf("Name %s\n", phone);
    }
}
