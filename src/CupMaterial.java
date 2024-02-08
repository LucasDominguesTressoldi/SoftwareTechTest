public class CupMaterial {
    public String chooseCupMaterial(String drinkType) {
        if (drinkType.equals("suco")) {
            return "Plástico";
        } else {
            return "Papel";
        }
    }
}
