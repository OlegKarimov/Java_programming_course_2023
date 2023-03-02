package Lektions;

// ООП ( Калсс Scaner, Math)

public class Lektion_24_01 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner("dwqdwqdqwd");
//        String s = scanner.nextLine();

//        System.out.println(s);
//-----------------------------------------

/*        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter you name: ");


        String str1 = scanner1.nextLine();              // Ввод строки !!
        System.out.println("You name: "+str1);

        scanner1.close();                                // закрываем класс !!

//----------------------------------------------------

     Scanner scanner2 = new Scanner(System.in);
       System.out.println("Num: ");
        int num = scanner2.nextInt();

        System.out.println("Num2: ");
        int num2 = scanner2.nextInt();                      // Ввод числа !!

        System.out.println("Num + num2: "+(num+num2));

        System.out.println("Enter name: ");
        String word = scanner2.next();

        System.out.println("Name: "+word);
  */
//-------------------------------------------------------------------------------------------------
        //  -10 abs 10

        int abs = Math.abs(-10);
        System.out.println(abs);

        int x1 = 10;
        System.out.println(Math.abs(x1));

//----------------

        int min = Math.min(10,20);
        System.out.println(min);

//-------------------

        int max = Math.max(10,20);  // MAX Min !!
        System.out.println(max);

//-------------------
        double random = Math.random();   // Random  ot 0 do 1   !!
        System.out.println(random);
        random = Math.random()*100D;
        System.out.println(random);

        double round = Math.round(random);
        System.out.println("rounded rendom is "+round);

        double roundUP = Math.round(24.8);                // Okruglenie !!
        double roundDown = Math.round(24.2);
        System.out.println("roundUP " + roundUP);
        System.out.println("roundDown" + roundDown);

//---------------------------

        double power = Math.pow(2,3);  // Возведение в степень !!
        System.out.println("power: "+power);

//----------------------------
        double sqrt = Math.sqrt(9);  // Корень квадратный !!
        System.out.println("sqrt: "+sqrt);

//----------------------------
        int qwertz = (int)(sqrt/1);  // Перевод из double в int
        System.out.println(qwertz);


    }
}
