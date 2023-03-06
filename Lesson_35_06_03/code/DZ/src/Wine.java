public class Wine {

    String name;
    String sort;
    int year;

    // Конструктор класса
    public Wine() {
        this.name = name;
        this.sort = sort;
        this.year = year;
    }


    public String toString() {
        return "Вино : " + "\n" +
                "название = '" + name + '\'' + "\n" +
                "сорт = '" + sort + '\'' + "\n" +
                "год = ' " + year + '.' + "\n";
    }

    public void onStock(int kolBut) {
        System.out.println("На складе имеется " + kolBut + " бутылок");
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSort() {
        return sort;
    }
}