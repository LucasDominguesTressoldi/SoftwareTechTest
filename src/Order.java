public class Order {
    private final String drinkType;
    private Boolean withIce;
    private int ice;
    private Boolean cupLidWithHole;

    public Order(String drinkType) {
        this.drinkType = drinkType;
    }

    public void prepareOrder() {

        String cupMaterial = new CupMaterial().chooseCupMaterial(drinkType);
        String flavor = new Flavor().chooseFlavor(drinkType);
        String size = new Size().chooseSize(drinkType);

        System.out.println("Pedido de " + drinkType + "\n" + "Material do copo: " + cupMaterial + "\n" +
                "Sabor: " + flavor + "\n" + "Tamanho: " + size);
    }
}