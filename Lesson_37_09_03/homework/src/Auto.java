public class Auto extends Transport {
    String model;
    String color;

    public Auto(String model, int yer, String VIN_Code, String model1, String color) {
        super(model, yer, VIN_Code);
        this.model = model1;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
