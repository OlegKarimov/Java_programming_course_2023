public class PredicateClass2 extends PredicateAbstract {

    @Override
    public boolean test(String s) {
        if (s.length() == 4) return true;
        return false;
    }
}
