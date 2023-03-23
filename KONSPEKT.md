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

Interface
Definition: An interface is a completely "abstract class" that is used to group related methods with empty bodies.

Интерфейс — это полностью «абстрактный класс», который используется для группировки/объединения связанных (похожих)
нереализованных методов (только декларация/объявление метода, а тело метода - пустое).

Интерфейс - это в общем понимании "способ взаимодействия".

Example:

// Interface, объединяющий два метода interface Move { public void moveFast(); // interface method (does not have a
body) public void moveSlow(); // interface method (does not have a body) }

// class Vehicle "implements" the Move interface class Vehicle implements Move { public void moveFast() { // The body of
moveFast() is provided here System.out.println("Fast speed... - вжик и нету"); } public void sleep() { // The body of
moveSlow() is provided here System.out.println("Slow speed... - ползем, как черепаха"); } }

class Main { public static void main(String[] args) { Vehicle myVehicle = new Vehicle(); // Create a Vehicle object
myVehicl.moveFast(); // вызов одного метода myVehicl.moveSlow(); // вызов другого метода } }

Кроме того, класс в Java может использовать НЕСКОЛЬКО интерфейсов! Пример: BankCard и два интерфейса - Debit, Credit

Object
Object - это стандартный класс Java. Является "супер-классом", от которого автоматически наследуется любой класс в Java.
Зачем нужен этот класс? - он содержит поведение и состояние, которое необходимо для всех классов в Java.

Класс Object в Java содержит в том числе методы equals, toString, hashCode, getClass, которые полезны сами по себе, но и
могут быть переопределены в дочерних классах.

Что делают эти методы? equals - сравнивает объекты и делает это не всегда правильно и корректно, так как сравнивает
ссылки, а не содержимое полей объектов.

toString - выводит все поля обЪекта в одну строку, если вид не утраивает, то его можно переопределить.

Метод hashCode позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту По данному
числу, например, можно сравнивать объекты. Но... можно задать свой алгоритм определения хэш-кода объекта. qwe.Person
tom =
new qwe.Person("Tom"); System.out.println(tom.hashCode()); // 2036368507

Метод getClass позволяет получить тип объекта: qwe.Person tom = new qwe.Person("Tom"); System.out.println(
tom.getClass()); //
class qwe.Person

Давайте послушаем лекцию одного продвинутого преподователя про Object и затем обсудим, что мы из нее
поняли. https://www.youtube.com/watch?v=FcKmgtMPvY0

Нужно научиться переопределять метод equql в дочерних классах, добавить сравнение по полям.

---------------------------------------------------------------------------

## Расширяем наш список знаний и умений

**Что мы уже знаем - ОБОБЩЕНИЕ:**

- переменные и их типы и ввод данных с клавиатуры;
- математические действия;
- услоие (ветвление), тернарный оператор, switch ... case;
- циклы (loop) - while, do ... while, for , for each
- exceptions: try ... catch ...
- cтруктуры для храненеия и обработки данных:
    1. Массивы (Array)
    2. ArrayList
    3. HashSet
    4. HashMap
- методы (функции)
- числовые системы
- работа с файлами (создание, запись, чтение)
- enums
- работа с Git - система контроля версий
- концепция ООП
- классы, объекты, методы, конструкторы, сеттеры, геттеры (это методы класса)
- абстрактные (abstract) классы и наследование
- метод Collections.shuffle() - перетасовывает случайным образом коллекцию

_________ добавилось на этой неделе ______________

- полиморфизм - это когда методы в классах могут иметь **одинаковые НАЗВАНИЕ** (смысл) и
  мы можем их переопределять в дочерних классах
- переопределение методов в дочерних классах:
    - класс Dancer и его наследники (танцуют по-разному)
    - класс Shape (Фигура), его наследники и методы расчета площадей
    - классы Bus и Driver (связка классов - видитель и автобус)
    - класс Car, его наследники Bus, Track, Auto и методы go, stop, speedUp, speedDown
- контроль создаваемых экземпляров объектов на уровне конструктора класса
- интерфейс (класс, в котором объеденены похожие "пустые" методы)
- класс Object и его методы toString, equals
- модификаторы доступа public и private
- статичные методы и атрибуты (static)

-----------------------------------------------------------------------------

Переопределение метода equals !!!!

1 способ правильный !!

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {       // если объект obj является экземпляром класса Human
            return false;
        }

        Human that = (Human) obj;
        return this.is_worker == that.is_worker && this.age == that.age;

------------------------
2 способ

@Override
public boolean equals(Object other) {
if (this == other) {
return true;
}
if (!(other instanceof Money money)) {
return false;
}
return amount == money.amount && currency.equalsIgnoreCase(money.currency);

---------------------------------------------------------------------------------

Интерфейс Comparable
public class ИмяКласса implements Comparable<Имя класса>

public class House implements Comparable<House> {