package Konsultations;

public class Konsul_20_01 {
    public static void main(String[] args) {
        boolean weekdey = true;  // 1 true - rabochiy den
        //  weekdey = !weekdey;
        boolean vacation = true;   // 1 true - otpusk
        // vacation  = !vacation;
        boolean res;              // 1 - true esli spit
        // res = weekdey || vacation;

        //  System.out.println(res);
        System.out.println(!weekdey || vacation);

    }
}
