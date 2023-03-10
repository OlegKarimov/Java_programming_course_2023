public class Boat extends Transport {

    int loadСapacity;   // водоизмещение
    int length;     // длина

    public Boat(String model, int yer, String VIN_Code, int loadСapacity, int length) {
        super(model, yer, VIN_Code);
        this.loadСapacity = loadСapacity;
        this.length = length;
    }

    public int getLoadСapacity() {
        return loadСapacity;
    }

    public void setLoadСapacity(int loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
