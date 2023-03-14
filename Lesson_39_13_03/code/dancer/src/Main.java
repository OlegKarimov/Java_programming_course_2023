import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TwistDancer d2 = new TwistDancer("Танцор Твиста", 27, "М");
        d2.dance();

        BraekDancer d3 = new BraekDancer("Танцор Брейк Данса", 26, "М");
        d3.dance();

        DancerClassik d4 = new DancerClassik("Танцор классический", 25, "М");
        d4.dance();

        ArrayList<Dancer> dancers_list = new ArrayList<>();
        dancers_list.add(d2);
        dancers_list.add(d3);
        dancers_list.add(d4);

        System.out.println();
        System.out.println(dancers_list); // печатем лист танцоров

        // все танцоры выполняют метод dance в цикле по элементам массива
        for (int i = 0; i < dancers_list.size(); i++) {
            dancers_list.get(i).dance();
        }

    }
}