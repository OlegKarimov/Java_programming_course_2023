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

---------------------------------------------------------------------------------------

Юнит-тестирование
Модульное тестирование, или юнит-тестирование (англ. unit testing) — процесс в программировании, позволяющий проверить
на корректность отдельные модули (методы) исходного кода программы.

Зачем и когда пишуться тесты
Тесты пишутся программистами в идеале для каждого метода класса, который сложнее, чем sout или вызов стандартных
имеющихся в Java методов. Обычно, тесты пишет сам программист или другой прграммист-коллега (junior) параллельно по ходу
разработки или в ходе рефакторинга (это обычный/регулярный процесс).

Модульное тестирование позволяет достаточно быстро проверить, не привело ли очередное изменение кода (рефакторинг) к его
регрессии, то есть к появлению ошибок в уже оттестированных местах программы. Тестирование облегчает обнаружение и
устранение таких ошибок, НО не обеспечивает полной гарантии.

ВНИМАНИЕ!!! Можно добится 100% покрытия кода тестами, но не 100% уверенности, что тесты проверяют ВСЕ СЛУЧАИ и ВСЕ
НАБОРЫ НАННЫХ - это все остается на совести самих программистов.

Не нужно писать тесты, если
вы обладаете идеальной памятью и даром предвидения, ваш код способен изменять себя сам, вслед за требованиями клиента, а
иногда он объясняет клиенту, что его требования не нужно реализовывать.

Любой долгосрочный проект без надлежащего покрытия тестами обречен рано или поздно быть переписанным с нуля.

Тесты должны:

Быть достоверными, то есть проверять верные случаи и утверждения;
Не зависеть от окружения, на котором они выполняются;
Легко поддерживаться, то есть легко читаться и быть простыми для понимания, даже новый разработчик должен понять, что
именно тестируется;
Соблюдать единую конвенцию именования;
Запускаться регулярно в автоматическом режиме.
Алгоритм проведения Unit тестов

Выбрать/создать директорию для проведения Unit-тестирования (обычно - в директории где находится тестируемый класс)
Создать в этой директории новый класс (java-файл) с наименованием ИмяКлассаTest
Выполнить в этот Класс (файл) импорт библиотек: import org.junit.jupiter.api.Assertions; import
org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
Подключаем тестируемый класс и его методы строкой вида: ИмяКласса имяКласса;
Директива @BeforeEach void setUp(){ имя класса = new ИмяKласса(); // создаем экземпляр тестируемого класса перед каждым
тестом }
Директивы @Test @DisplayName("Описать что мы тестируем") создаь метод, вызывающий assertEquals ( нужное значение, вызов
тестируемого метода , "Сообщение(пояснение) о ...") Пример:
void testMultiPly(){ assertEquals(20,calculator.multiply(4,5),"4*5 should be 20"); }
Запустить тест
Один из возможных способов именования методов класса для проведения тестирования такой: [Тестируемый метод]
_[Сценарий]_[Ожидаемое поведение].

Предположим, что у нас есть класс Calculator, а у него есть метод sum, который должен складывать два числа. В этом
случае наш тестирующий класс будет выглядеть так:

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public сlass CalculatorTests {

	@Test

public void sum_2Plus5_7Returned() {
// …
}
}
Такая запись понятна без объяснений. Это спецификация к коду и его тесту.

Придерживайтесь единого стиля написания тела теста
Отлично зарекомендовал себя подход AAA (arrange, act, assert - упорядочить, выполнить действие, сравнить результат).

Пример того, как это выглядит на примере с калькулятором:

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

@Test
public void sum_2Plus5_7Returned() {
// arrange
Calculator calc = new Calculator(); // создали свой экземпляр калькулятора

		// act
		int res = calc.sum(2, 5); // вызвали метод из тестируемого класса

		// assert
		assertEquals(7, res); // выполнили сравнение желаемого с полученным
	}

}
Такая форма записи гораздо легче читается, чем

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

@Test
public void sum_2Plus5_7Returned() {
assertEquals(7, new Calculator().sum(2, 5));
}
}
Тестируйте один метод за один раз
Каждый тест должен охватывать одну понятную область и/или возможность. Если процесс слишком сложен (например, покупка в
интернет магазине), разделите его на несколько частей и протестируйте их отдельно. Если вы не будете придерживаться
этого правила, ваши тесты станут нечитаемыми и вскоре вам окажется очень сложно их поддерживать.

Фреймворк JUnit
JUnit - один из самых популярных фреймворков, используемых для тестирования кода в Java.

Официальный сайт

Руководство пользователя

Репозиторий на GitHub

Текстовая инструкция по настройке IntelliJ Idea (на английском)

Видеоинструкция по настройке IntelliJ Idea (на английском)

Нужные импорты
Эти два импорта заставят IntelliJ Idea предложить вам установить JUnit:

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

-----------------------------------------------------------------------------------
// 1. Function<T,R> - преобразует объект типа Т в объект типа R
// R apply(T obj)
Function<Integer, String> intToString = num -> String.valueOf(num);
intToString.apply(2);

// 2. UnaryOperator<T> - аналог Function только для одного и того де типа
// T apply (T obj)
UnaryOperator<Integer> isSquare = num -> num * num;
isSquare.apply(5);

// 3. Predicate<T> - проверяет условие true / false
// boolean test(T obj)
Predicate<Integer> isPositive = num -> num > 0;
isPositive.test(5);

// 4. Consumer<T> - принимает объект, но ничего не возвращает
// void accept (T obj)
Consumer<String> consumer = s -> System.out.println(s);
consumer.accept("Hallo");

// 5. Supplier<T> - ничего не принимает, но возвращает объект
// T get ()
Supplier<String> stringSupplier = () -> "Hallo";

// 6. BiFunction<T,U,R> - принимает два обьекта типов T и U и преобразует их в другой тип R
// R apply (T obj1, U obj2)
BiFunction<Integer, Integer, String> stringBiFunction = (a, b) -> Integer.toString(a, b);
stringBiFunction.apply(3, 4);

// 7. BinaryOperator<T> - принимает два обьекта типа T и возвращает обьект тоже типа T
// T apply (T obj1, T obj2)
BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
sum.apply(3, 4);

----------------------------------------------------------------------------------

Способы создания стримов

// Stream.empty() - пустой стрим
// list.stream() - стрим из списка
// map.enrtySet().stream() - стрим из мапы
// Arrays.stream(array) - стрим из массива
// Stream.of(1,2,3,5,9) - стрим из элементов