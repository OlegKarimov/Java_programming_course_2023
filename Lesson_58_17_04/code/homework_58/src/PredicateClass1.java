public class PredicateClass1 extends PredicateAbstract {

    @Override
    public boolean test(String s) {
        if (s.length() == 3) return true;
        return false;
    }
}
