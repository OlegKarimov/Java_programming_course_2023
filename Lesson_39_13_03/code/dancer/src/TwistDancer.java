public class TwistDancer extends Dancer {

    public TwistDancer(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println("двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу");
    }
}
