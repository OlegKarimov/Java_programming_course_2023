public class Employee {
    int empID; // поле ключ
    String name, address;

    public Employee(int empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee " +
                "empID: " + empID +
                ", name: '" + name +
                ", address: " + address;
    }
    
}
