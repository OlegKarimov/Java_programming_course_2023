public class DZ {
    // Задача 2
    //Перевести двоичное число 111000111000111000 в десятичное.
    //Дано десятичное число 9876543210. Каконо будет выглядеть в двоичной,
    // двенадцатеричной и шестнадцатиричной системах счисления?

    public static void main(String[] args) {

        String stringNum = "111000111000111000";
        System.out.println("Перевод из 2сс в 10сс числа " + stringNum);
        System.out.println("Результат : " + Integer.parseInt(stringNum, 2));

        long n = 9876543210l;

        System.out.println("Перевод из 10сс числа 9876543210 :" + n);
        System.out.println("Результат в 2сс : " + Long.toBinaryString(n));
        System.out.println("Результат в 8сс : " + Long.toHexString(n));
        System.out.println("Результат в 16сс : " + Long.toOctalString(n));

        System.out.println("---------------------------------------------------------");
    }
}
