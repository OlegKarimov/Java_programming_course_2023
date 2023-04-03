import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Main m = new Main();
//        m.garbageSorter();
        garbageSorter();
    }

    public static void garbageSorter() {
        String garbageSort;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What kind of garbage do you want to throw away?");
            garbageSort = scanner.nextLine().toUpperCase();
            switch (garbageSort) {
                case "PAPER":
                    System.out.println("Trow to white container");
                    break;
                case "FOOD":
                    System.out.println("Trow to red container");
                    break;
                case "GLASS":
                    System.out.println("Indicete the color - WHITE, GREEN or BROWN");
                    String glassColor = scanner.nextLine().toUpperCase();
                    if (glassColor.equalsIgnoreCase("WHITE")) {
                        System.out.println("Trow to WHITE glass compartment");
                    } else if (glassColor.equalsIgnoreCase("GREEN")) {
                        System.out.println("Trow to GREEN glass compartment");
                    } else System.out.println("Trow to BROWN glass compartment");
                    break;
                default:
                    System.out.println("This sort of garbage does not exist");//мусор такого сорта не существует

            }
            System.out.println("Do you want to throw away more garbage? Enter any letter if yes and 'no' if not");
            //хотите выбросить еще мусор ? введите любую букву если да и no  если нет

        } while (!(scanner.nextLine().toUpperCase().equals("NO")));

    }

    public static void printDigits(int n) {
        System.out.println("Input number");
        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println();
            System.out.print(num + " is : ");
            while (!(num == 0)) {
                arrayList.add(num % 10);
                num = num / 10;
            }
//            for (int i = arrayList.size() - 1; i >= 0; i--) {
//                System.out.print(arrayList.get(i) + " , ");
//            }

            Collections.reverse(arrayList);
            
        } catch (InputMismatchException e) {                // проверка на некорректный ввод
            System.out.println("Ошибка: " + e.getMessage() + ". Нельзя вводить символы!");
        }
        System.out.println();

    }
}