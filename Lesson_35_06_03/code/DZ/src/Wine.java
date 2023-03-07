public class Wine {

    String name;
    String sort;
    int year;

  /*  // Конструктор класса
    public Wine() {
        this.name = name;
        this.sort = sort;
        this.year = year;
    }
*/
//    @Override
//    public String toString() {
//        return "Wine{" +
//                "name='" + name + '\'' +
//                ", sort='" + sort + '\'' +
//                ", year=" + year +
//                '}';
//    }

    public String toString() {
        return "Вино : " + "\n" +
                "название = '" + name + '\'' + "\n" +
                "сорт = '" + sort + '\'' + "\n" +
                "год = ' " + year + '.' + "\n";
    }

    public String onStock(int kolBut) {
        return ("На складе имеется " + kolBut + " бутылок");
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