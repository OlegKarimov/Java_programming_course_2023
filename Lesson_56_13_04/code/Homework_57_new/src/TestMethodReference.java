public class TestMethodReference {

    public static void main(String[] args) {
        int[] ints = {1, -50, 56};
//        System.out.println(sum(ints, TestMethodReference::isPositive));
//        System.out.println(sum(ints, TestMethodReference::isOdd));
        TestMethodReference tmr = new TestMethodReference();
        tmr.sumNonStatic(ints, tmr::isOdd);

    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public boolean isOdd(int num) {
        return num % 2 != 0;
    }


//    public static boolean isOdd(int num) {
//        return num % 2 != 0;
//    }

    //    public static int sum(int[] ints, Check check) {
//        int sum = 0;
//        for (int num : ints) {
//            if (check.check(num)) {
//                sum += num;
//            }
//        }
//        return sum;
//    }
    public int sumNonStatic(int[] ints, Check check) {
        int sum = 0;
        for (int num : ints) {
            if (check.check(num)) {
                sum += num;
            }
        }
        return sum;
    }

}
