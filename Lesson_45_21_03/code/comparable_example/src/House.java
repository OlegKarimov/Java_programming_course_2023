public class House implements Comparable<House> {
    int area;
    int prise;
    String city;

    public House(int area, int prise, String city) {
        this.area = area;
        this.prise = prise;
        this.city = city;
    }


    @Override
    public String toString() {
        return "House " +
                "area =" + area +
                ", prise = " + prise +
                ", city = " + city + '\n';
    }

    @Override
    public int compareTo(House o) {
        if (this.prise == o.prise)
            return 0;
        else if (this.prise < o.prise) {
            return -1;
        } else return 1;
    }
}
