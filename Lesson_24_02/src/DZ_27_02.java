import java.util.ArrayList;

//Задача 1
//гирлянда
//
//начальное состояние: все лампочки потушены
//сделать "бегущую строку" единичка пробегает слева напрао по всей гирлянде.

public class DZ_27_02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Гирлянда на 32 лампочки ");
        System.out.println();
        ArrayList<Integer> garland = new ArrayList<>();

        // заполняем гирлянду 0 ми
        for (int i = 0; i < 32; i++) {
            garland.add(i, 0);
        }

        garland_out(garland); // напечатали гирлянду
        System.out.print('\r'); //  возврат коретки

        for (int i = 0; i < garland.size(); i++) {
            garland.set(i, 1);        // включили i-ю лампочку
            garland_out(garland);       // напечатали гирлянду
            System.out.print('\r');     //  возврат каретки
            garland_nul(garland);       // погасили гирлянду
            Thread.sleep(400);   // задержка вконце, чтобы мигнула последняя лампочка с задержкой
        }

        garland_out(garland); // печать герлянды
    }

    // обнуляет гирлянду
    public static void garland_nul(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, 0);
        }
    }

    // выводит на печать гирлянду
    public static void garland_out(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " | ");
        }
    }

}
