package Lektions;

public class Lektion_25_01 {
    public static void main(String[] args) {

        char ch;
        ch = 'X';
        System.out.println("This is ch "+ch);

        ch = 'A';
        System.out.println("ch now contains "+ch);

        ch++;
        System.out.println(ch);

        ch = 90;
        System.out.println("90 in Unicode is  "+ch);

        int letter = 'Z';
        System.out.println("letter is now  "+letter);

 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char: ");
        ch = scanner.nextLine();
*/

        String z = "qdqwd \' qw ";
 /*

        \'  - одинарная кавычка
        \"  - двойная кавычка
        \\  - backslash
        \n  - переход на новую строку
        \t  - табуляция
        \u1111 - символ Юникода

  */
        System.out.println("fsfefse\nnnn");
        System.out.println("sdsdfsda\tds\tcsewfse\tfrdd");
        System.out.println('\u1000');
        System.out.println("\u1000");

//---------------------------------------------------------------------------------

        String str1 = "sdfafs";
        System.out.println(str1);
        str1 = "";
        System.out.println("\"\":"+str1+".");
        str1 = null;
        System.out.println(str1);

    }
}