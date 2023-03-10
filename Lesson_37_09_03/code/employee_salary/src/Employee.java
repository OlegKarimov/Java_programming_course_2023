public abstract class Employee {
    private String name; // это для имени сотрудника, оно закрыто от прямого доступа из других классов
    private String email; // это для email сотрудника, оно закрыто от прямого доступа из других классов
    private int ID_num; // это внутренний номер

    public Employee(String name, String email, int ID_num) {  // конструктор класса Employee
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }

    // метод для отправки информации
    public void mailPaySlip() {
        System.out.println("Это метод класса Eployee");
        System.out.println("Уважаемый " + this.name + ", направляем информацию о зарплате на адрес " + this.email);
    }

    // этот метод переопределяет стандартный toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID_num=" + ID_num +
                '}';
    }

    // это геттер
    public String getName() {
        return name;
    }

    // это геттер
    public String getEmail() {
        return email;
    }

    // это геттер
    public int getID_num() {
        return ID_num;
    }
}







/*
    private String name; // модификатор доступа private защищает данные от прямого доступа
    private String email;
    private int ID_num;
    // конструктор класса Employee
    public Employee(String name, String email, int ID_num) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }
    // этот метод назначает годовую зарплату
    public double computeYearSalary() {
        System.out.println("Внутри класса Employee метод computeYearSalary");
        return 0.0;
    }
    // метод отправляет работнику информацию о зарплате на его e-mail
    public void mailPaySlip() {
        System.out.println("Это метод класса Employee");
        System.out.println("Уважаемый " + this.name + ", направляем вам информацию о зарплате на адрес " + this.email);
    }
    // метод собирает информацию о сотруднике в одну строку
    @Override
    public String toString() {
        return name + " " + email + " " + ID_num;
    }
    // getter для имени работника
    public String getName() {
        return name;
    }
    // getter для e-mail работника
    public String getEmail() {
        return email;
    }
    // getter для ID_num работника
    public int getID_num() {
        return ID_num;
    }
    // сеттер для Name работника
    public void setName(String name) {
        this.name = name;
    }
 */
