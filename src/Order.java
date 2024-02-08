public class Order {
    private final String drinkType;
    private String flavor;
    private int size;
    private Boolean withIce;
    private int ice;
    private Boolean cupLidWithHole;

    public Order(String drinkType) {
        this.drinkType = drinkType;
    }

    public void prepareOrder() {

        String cupMaterial = new CupMaterial().chooseCupMaterial(drinkType);
        System.out.println("Pedido de " + drinkType + "\n" + "Material do copo: " + cupMaterial);
    }
}