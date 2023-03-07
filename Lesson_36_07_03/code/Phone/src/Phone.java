public class Phone {

    String phoneNumber;
    String brand;
    String model;

    public Phone(String phoneNumber, String brand, String model) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void resCall(String name) {
        System.out.println("Звонит :" + name);

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
