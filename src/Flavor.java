import java.util.Scanner;

public class Flavor {
    public String chooseFlavor(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        if (drinkType.equals("suco")) {
            System.out.print("Uva ou Laranja? ");
        } else {
            System.out.print("Coca ou Guaraná? ");
        }
        return scanner.nextLine();
    }
}
