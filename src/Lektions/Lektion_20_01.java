package Lektions;

public class Lektion_20_01 {
    public static void main(String[] args) {
       /* int a = 25;
        int b = 3;
        double res = (double)a/b;
        System.out.println(25.0/3);
        System.out.println(25%3);
//------------------------------------------------------
        int num = 8;
        System.out.println(num*num);
  */      //-------------------------------------------------
        int a = 365;
        int kon = a%10;
        int per = a/100;
        int d = a%100;
        d = d/10;
        kon = kon*100;
        d = d*10;
        d = kon+per+d;

        System.out.println("a = "+a);
        // System.out.print(kon);
        System.out.println("Perevernutoe a = "+d);
        System.out.println();
        //   System.out.println(per);
        int n = 365;
        int ones,tens,hunderts;
        ones = n%10;
        tens = n/10%10;
        hunderts = n/100;

        int reversed = ones*100+tens*10+hunderts;
        System.out.println("n = "+n+" Rewerst n = "+reversed);

        //-------------------------------------------------------
        // Bankomat, kupuri 1,5,10

        int banknotes = 49;

        int tens1 = banknotes / 10;    // skolko
        int fives = banknotes % 10 / 5;  // skolko budet po 5
        int ones1 = banknotes % 10 % 5;

        System.out.println(tens1+fives+ones1);

//-----------------------------------------------

        int y,z;
        int x = 10;
        // y=++x;
        //y=x++;
        z=++x;
        z=--x;
        //System.out.println("y= "+y);
        System.out.println("z= "+z);
        System.out.println("x= "+x);

        //----------------------------------------


        /*
        ==
        !=
        >
        <
        >=
        <=

        */

        System.out.println(10==10);

        /*
        &   AND   - & + = -
        |   OR    - | + = +
        !   NOT
        ^   XOR (exclusive OR)  odinakovie - False, raznie - True

        &&  STAVIT NADO TOLKO TAKOY
        ||  STAVIT NADO TOLKO TAKOY

         */

        System.out.println(11>10);
        boolean b1 = false;
        boolean b2 = false;

        System.out.println("For b1 "+b1+" and b2 "+b2+":");

        System.out.println("b1 & b2: "+(b1&b2));
        System.out.println("b1 | b2: "+(b1|b2));
        System.out.println("b1 ^ b2: "+(b1^b2));
        System.out.println("! b1 : "+(!b1));

        System.out.println();

        b1 = false;
        b2 = true;
        System.out.println("For b1 "+b1+" and b2 "+b2+":");
        System.out.println("b1 & b2: "+(b1&b2));
        System.out.println("b1 | b2: "+(b1|b2));
        System.out.println("b1 ^ b2: "+(b1^b2));
        System.out.println("! b1 : "+(!b1));

        System.out.println();
        b1 = true;
        b2 = true;
        System.out.println("For b1 "+b1+" and b2 "+b2+":");
        System.out.println("b1 & b2: "+(b1&b2));
        System.out.println("b1 | b2: "+(b1|b2));
        System.out.println("b1 ^ b2: "+(b1^b2));
        System.out.println("! b1 : "+(!b1));

        int a1 = 1;
        int b22 = 0;
        if (a1>b22)
            System.out.println("a1>b22");

        int num12 = 10;
        int d123 = 2;
        d123 = ++d123;
        System.out.println(d123);

        if (d123 != 0 && (num12%5)==0)
            System.out.println("it can be...");


    }
}
