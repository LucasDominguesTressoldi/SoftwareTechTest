package main;

public class JuiceOrSoda {
    public static void chooseJuiceOrSoda(String response) {
        if (response.equals("1")) {
            Order juiceOrder = new Order("Suco");
            juiceOrder.prepareOrder();
        } else if (response.equals("2")) {
            Order sodaOrder = new Order("Refrigerante");
            sodaOrder.prepareOrder();
        } else {
            throw new IllegalArgumentException("Tipo de bebida inválido.");
        }
    }
}
