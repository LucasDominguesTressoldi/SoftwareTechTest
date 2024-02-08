import java.util.Scanner;

public class Ice {
    public int chooseIce(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[1] Sim | [2] Não\nGostaria de gelo? ");
        int withIce = scanner.nextInt();

        if (withIce == 1) {
            if (drinkType.equals("suco")) {
                return 12;
            } else {
                return 6;
            }
        }

        return 0;
    }
}
