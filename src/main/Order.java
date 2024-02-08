package main;

public class Order {
    private final String drinkType;

    public Order(String drinkType) {
        this.drinkType = drinkType;
    }

    public void prepareOrder() {

        String cupMaterial = CupMaterial.chooseCupMaterial(drinkType);
        String flavor = Flavor.chooseFlavor(drinkType);
        String size = Size.chooseSize(drinkType);
        int iceCubes = Ice.chooseIce(drinkType);
        String cupLidWithHole = CupLid.takeOut();

        System.out.println("-".repeat(26));
        System.out.println("Pedido de " + drinkType + "\n" + "Material do copo: " + cupMaterial + "\n" +
                "Sabor: " + flavor + "\n" + "Tamanho: " + size + "ml" + "\n" + "Qtde de pedras de gelo: " + iceCubes
        + "\n" + "Tampa com furo? " + cupLidWithHole);
    }
}