import java.util.*;

public class DZ_22_02 {
    public static void main(String[] args) {

//Задача 1
// Создайте телефонную книгу нашей группы.

        System.out.println("Телефонный справочник");

        HashMap<String, Integer> group23 = new HashMap<>();


        group23.put("Vadim", 123456789);
        group23.put("Leonid", 26121213);
        group23.put("Lilian", 12343241);
        group23.put("Lilian M", 12313123);
        group23.put("Viacheslav", 35123213);
        group23.put("Katerina G", 123232322);
        group23.put("Katerina", 123123232);

        for (String i : group23.keySet()) {
            System.out.println("Имя: " + i + " - " + " телефон : " + group23.get(i));
        }


//Задача 2
//Решить задачу про результаты забега на 100 м (или про погодное наблюдение), используя HashMap.

//Имеются результаты забега на 100 метров группы бегунов из 10 участников.
// Внести эти результаты в компьютер согласно протоколу.
// Отсортировать результаты, напечатать кто занял 1-е и кто занял последнее место.
//
        System.out.println();
        System.out.println("--------------------------------------------");

        HashMap<Double, String> listResult = new HashMap<>();
        String bufName;
        double bufRes;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Введите имя " + i + "го участника : ");
            Scanner scanner = new Scanner(System.in);
            bufName = scanner.nextLine();
            System.out.print("Введите результат " + i + "го участника : ");
            bufRes = scanner.nextDouble();
            listResult.put(bufRes, bufName);
        }
        //---------------------------

        System.out.println("Результаты :");
        TreeMap<Double, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(listResult);
        // listResult.putAll(sortedMap);

        for (Double i : sortedMap.keySet()) {
            System.out.println("Имя : " + sortedMap.get(i) + ",  результат : " + i);
        }
        System.out.println();
        System.out.println("Лучший результат : " + sortedMap.firstEntry());
        System.out.println("Худший результат : " + sortedMap.lastEntry());


//-------------------------------------------------------------------------------------------
//Задача 3
//Посчитайте количество повторяющихся букв в предложении.

        System.out.println();
        System.out.println("--------------------------------------------");

        String s = "Мама мыла раму";
        System.out.println("Дано предложение: " + s);

        HashSet<String> hashSetOfChars = new HashSet<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {                           // не считаем пробелы
                hashSetOfChars.add(String.valueOf(s.toLowerCase().charAt(i)));
                // заносим уникальные букву в HashSet список;
            }
        }

        int kol = 0;
        int res = 0;
        ArrayList<String> resChars = new ArrayList<String>();
        for (String i : hashSetOfChars) {               // идём по уникальному списку букв
            for (int j = 0; j < s.length(); j++) {      // идём по стороке
                if (i.equals(String.valueOf(s.toLowerCase().charAt(j)))) {   //  если находим совпадения, то считаем
                    // не считаем пробелы и без учета регистра
                    kol++;
                }
            }
            if (kol > 1) {     // если нашли повторение, не считая самого себя, то...
                res++;
                resChars.add(i);
            }
            kol = 0;
        }
        System.out.println("Количество повтояющихся букв : " + res);
        System.out.println("Это буквы : " + resChars);
    }
}
