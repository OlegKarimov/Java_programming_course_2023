package Lektions;

public class Lektion_03_02 {

        public static void main(String[] args) {

// методы

//          ret-type name (parameter list) {
// void - это значит что метод ничего не отдаёт (пустота)
// static - надо по умолчанию для того чтобы легче было отдавать

            printSmth();
            sum();
            int a = sumReturn();
            System.out.println("rez = "+a);

            System.out.println(sumReturn());

            int aa = 2;
            int bb = 20;
            int rez1 = sumReturnParam(aa,bb);
            System.out.println(rez1);

            System.out.println(sumReturnParam(5,7));

            System.out.println(sumReturnParam(3,7));

            String wordF = "Hallo";
            int numberF = 1;

            System.out.println(retSrt(wordF,numberF));

        }

        public static void printSmth()
        {
            System.out.println("I am printing");
        }

        public static void sum()
        {
            int a = 2;
            int b = 3;
            int aPls = a +b;
            if (aPls==5)
                return;
            System.out.println("a + b = "+(a+b));

        }

        public static int sumReturn() {
            int a = 2;
            int b = 3;
            int aPls = a + b;
            return aPls;
        }


    // передача параметров в метод

        public static int sumReturnParam(int a, int b)
        {
            int aPls = a +b;
            return aPls;

            // return a+b


        }

        public static String retSrt(String word, int num){
            return word+" "+num;
        }
}




