package Lektions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lektion_16_02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(
                Arrays.asList("sdfsd", "asfaf", "sdfsdf"));
        System.out.println(arrayList);

        ArrayList<Character> array = new ArrayList<Character>();
        String abc = "троллейбус";
        for (int i = 0; i < abc.length(); i++) {
            array.add(i, abc.charAt(i));  //  берём по 1 символу из строки abc
        }

        System.out.println(array);
        Collections.reverse(array);
        System.out.println(array);
        abc = array.toString();
        System.out.println(abc);

    }
}
