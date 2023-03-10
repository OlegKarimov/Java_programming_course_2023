public class Main {
    public static void main(String[] args) {
        System.out.println("Работник и зарплата.");
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате

        // Так создать экземплярр Employee не получается
//        Employee emp1 = new Employee("Иванов Петр","ivanov_p@mail.com", 101);
//        emp1.mailPaySlip();

        // Содаем работника с зарплатой
        Salary s1 = new Salary("Иванов Петр", "ivanov_p@mail.com", 101, 60000);
        Salary s2 = new Salary("Петров Алексей", "petrov_a@mail.com", 102, 48000);

//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println("Вызываем метод mailPaySlip");

        s1.mailPaySlip();
        System.out.println();
        s2.mailPaySlip();

        s2.setSalary(54000); // установили новую зарплату
        System.out.println();
        s2.mailPaySlip(); // отправили уведомление

        System.out.println();

        Addres a1 = new Addres("Иванов Петрович", "ivanov_p@mail.com", 1011, 1000, "Адрес 123");
        Addres a2 = new Addres("Пётр Иванович", "ivanov_p@mail.com", 1012, 1001, "Адрес 456");

        System.out.println("Человек : " + a1.getName() + ", " + "адрес : " + a1.getStreetAdd());
        System.out.println("Человек : " + a2.getName() + ", " + "адрес : " + a2.getStreetAdd());
    }
}










/*
//        Employee emp1 = new Employee("Иванов Петр", "ivan@mail.ru", 001);
//        emp1.mailPaySlip(); // пробуем вызвать метод
//        String e = emp1.toString();
//        System.out.println(e);
        Salary s1 = new Salary("Иванов Петр", "ivanov_s@mail.com", 101, 60000 );
        Salary s2 = new Salary("Сидоров Алексей", "sidorov_a@mail.com", 102, 48000);
        Employee e = new Salary("Сидоров Алексей", "sidorov_a@mail.com", 102, 48000);
        System.out.println("--- Вызываем метод mailPaySlip в классе Salary ---");
        s1.mailPaySlip();
        s2.mailPaySlip();
        System.out.println("\n --- Вызываем метод mailPaySlip в классе Employee ---");
        e.mailPaySlip();
        System.out.println();
        s2.setSalary(54000); // изменили зарплату Сидорову
        s2.mailPaySlip(); // послали уведомление
 */