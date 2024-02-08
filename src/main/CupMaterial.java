package main;

public class CupMaterial {
    public static String chooseCupMaterial(String drinkType) {
        if (drinkType.equals("Suco")) {
            return "Plástico";
        } else {
            return "Papel";
        }
    }
}
