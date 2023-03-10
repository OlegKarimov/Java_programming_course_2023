public class Addres extends Employee {
    int postCode;
    String streetAdd;


    public Addres(String name, String email, int ID_num, int postCode, String streetAdd) {
        super(name, email, ID_num);
        this.postCode = postCode;
        this.streetAdd = streetAdd;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "postCode=" + postCode +
                ", streetAdd='" + streetAdd + '\'' +
                '}';
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }
}



