public class DancerClassik extends Dancer {
    public DancerClassik(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "двигается под музыку классически");
    }


}
