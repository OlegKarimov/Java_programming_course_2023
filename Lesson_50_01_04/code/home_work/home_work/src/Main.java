//Дана Map map, написать метод, который вернет мапу, такую,
// что если в исходной map есть ключи ‘a’ и ‘b’,
// то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве значения.
// Если нет, ничего не менять
//Примеры:
//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//mapAB({"a": "Hi"}) → {"a": "Hi"}
//mapAB({"b": "There"}) → {"b": "There"}


//Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем,
// а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
//Примеры:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}


//Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет количество вхождений этого имени в список.
//Пример: nameToNumberOccurence(List list, String name)
//Vasia -> 3


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> inputMap = new HashMap<>();
        Map<String, String> resAB;
        inputMap.put("a", "Hi");
        inputMap.put("b", "There");
        inputMap.put("c", "Hi hi");
        resAB = mapAB(inputMap);
        for (String i : resAB.keySet()) {
            System.out.println("key: " + i + " : " + resAB.get(i));
        }

//---------------------------------------------------------------------------------
        System.out.println();
        Map<String, Boolean> stringBooleanMap;
        String[] strings = {"a", "b", "a", "c", "b"};
        stringBooleanMap = wordMultiple(strings);
        for (String i : stringBooleanMap.keySet()) {
            System.out.println("key: " + i + " : " + stringBooleanMap.get(i));
        }
//---------------------------------------------------------------------------------
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Олег");
        list.add("Петя");
        list.add("Коля");
        list.add("Олег");
        int colNames;
        colNames = nameToNumberOccurence(list, "Олег");
        System.out.println("Names in list: " + colNames);
    }
//Дана Map map, написать метод, который вернет мапу, такую,
// что если в исходной map есть ключи ‘a’ и ‘b’,
// то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве значения.
// Если нет, ничего не менять
//Примеры:
//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//mapAB({"a": "Hi"}) → {"a": "Hi"}
//mapAB({"b": "There"}) → {"b": "There"}

    public static Map<String, String> mapAB(Map<String, String> inputMap) {
        Map<String, String> bufRes;
        String a = "a";
        String b = "b";
        bufRes = inputMap;
        if (inputMap.containsKey("a") && inputMap.containsKey("b")) {
            bufRes.put("ab", bufRes.get("a") + bufRes.get("b"));
        }
        return bufRes;
    }

//-------------------------------------------------------------------------------------------------
//Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем,
// а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
//Примеры:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> mapBoolean = new HashMap<>();
        boolean repeat = false;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if ((i != j) && (strings[i].equals(strings[j]))) {
                    repeat = true;
                }
            }
            mapBoolean.put(strings[i], repeat);
            repeat = false;
        }
        return mapBoolean;
    }

    //------------------------------------------------------------------------------------------------
//Дан список имен, где некоторые имена повторяются.
// Написать метод,который по имени вернет количество вхождений этого имени в список.
//Пример: nameToNumberOccurence(List list, String name)
//Vasia -> 3
    public static int nameToNumberOccurence(List<String> list, String name) {
        int col = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                col++;
            }
        }
        return col;
    }
}
