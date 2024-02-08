import java.util.Scanner;

public class CupMaterial {
    public String chooseCupMaterial(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        if (drinkType.equals("suco")) {
            return "Plástico";
        } else {
            return "Papel";
        }
    }
}
