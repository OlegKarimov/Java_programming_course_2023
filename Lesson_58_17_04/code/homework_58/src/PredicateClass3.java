public class PredicateClass3 extends PredicateAbstract {

    @Override
    public boolean test(String s) {
        if (s.length() == 5) return true;
        return false;
    }
}
