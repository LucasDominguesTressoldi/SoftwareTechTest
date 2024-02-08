public class CupMaterial {
    public String chooseCupMaterial(String drinkType) {
        if (drinkType.equals("Suco")) {
            return "Plástico";
        } else {
            return "Papel";
        }
    }
}
