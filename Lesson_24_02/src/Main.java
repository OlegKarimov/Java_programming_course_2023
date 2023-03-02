import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> gerlands = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            int e = (int) ((Math.random() * 2));
            gerlands.add(e);
        }
        System.out.println(gerlands);
//        blink(gerlands, 1);
//        System.out.println();
//        System.out.println(gerlands);

        for (int i = 0; i < 32; i++) {
            blink(gerlands, i);
        }
    }

    public static void blink(ArrayList<Integer> arr, int num) {
        if (arr.get(num) == 1) {
            arr.set(num, 0);                // заменяет (обновляет) значение элемента по индексу
        } else arr.set(num, 1);
    }
}