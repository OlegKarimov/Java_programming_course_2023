public abstract class Transport {
    String model;
    int yer;
    String VIN_Code;

    public Transport(String model, int yer, String VIN_Code) {
        this.model = model;
        this.yer = yer;
        this.VIN_Code = VIN_Code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYer() {
        return yer;
    }

    public void setYer(int yer) {
        this.yer = yer;
    }

    public String getVIN_Code() {
        return VIN_Code;
    }

    public void setVIN_Code(String VIN_Code) {
        this.VIN_Code = VIN_Code;
    }
}
