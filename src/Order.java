public class Order {
    private final String drinkType;
    private String flavor;
    private int size;
    private String cupMaterial;
    private Boolean withIce;
    private int ice;
    private Boolean cupLidWithHole;

    public Order(String drinkType) {
        this.drinkType = drinkType;
    }

    public void prepareOrder() {
        System.out.println("Pedido de " + drinkType);
    }
}