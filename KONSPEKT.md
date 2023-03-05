public class KONSPEKT {
public static void main(String[] args) {

1.        HashMap<keyType, valueType> nameHashMap = new HashMap<keyType, valueType>();

Внутри структуры/коллекции Map (Dictionary) данные хранятся в формате “ключ”-”значение”, то есть по парам.
И в качестве ключей, и в качестве значений могут выступать любые типы — числа, строки или даже объекты других классов.
ВНИМАНИЕ!!! Ключ должен быть уникален!

nameHashMap.put ( key , value) - добавление и обновление элемента
nameHashMap.get ( key ) - получение значения по ключу
nameHashMap.remove ( key ) - удаление значения по ключу
nameHashMap.size () - получение размера коллекции элементов

Print keys - проход по всем ключам
for (String i : nameHashMap.keySet()) { System.out.println(i); }

Print values - проход по всем значениям
for (String i : nameHashMap.values()) { System.out.println(i); }

Print keys and values - проход по всем ключам и их значениям
for (String i : nameHashMap.keySet()) { System.out.println("key: " + i + " value: " + nameHashMap.get(i)); }

--------------------------------------------------------------------------------------------------------------------

2.      HashSet myHashSet = new HashSet();

Set в переводе с английского - это "множество каких-то элементов" в нашем контексте.
Особенность этого множества в том, что оно может хранить только уникальные значения, элементы.
Пример: бренды автомобилей - это множество, где каждый элемент должен быть уникален. Их сейчас порядка 100...

--------------------------------------------------------------------------------------------------------------------

3.      ArrayList namesList = new ArrayList( Arrays.asList("Peter","Vladimir","Stepan"));

ArrayList - это динамический массив?
На самом деле, ArrayList "на лету" создает новый массив, а не меняет размер старого, и переносит в него
содержимое старого массива. Размер массива увеличивается в 1,5 раза. Размер массива ни в одном
языке программирования "на лету", внутри программы изменить нельзя.

        System.out.println(namesList);  печать

      arr.set(num, 0);                // заменяет (обновляет) значение элемента по индексу

        for (type var : array) { statements using var; } Вывод ArrayList в цикле for each

        ArrayList mylist = new ArrayList(); Обратная сортировка ArrayList
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        System.out.println("Original List : " + mylist); Collections.reverse(mylist); System.out.println("Reversed List: " + mylist);



        Chekhachov Viacheslav
        Zhilina Katerina

----------------------------------------------------------------------------------

4. String str = "155";
   n = Integer.parseInt(str); // перевод из строки в число

   }

}