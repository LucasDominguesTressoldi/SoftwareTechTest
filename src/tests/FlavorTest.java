package tests;

import main.Flavor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlavorTest {

    @Test
    void chooseFlavorForJuice() {
        Flavor flavor = new Flavor();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("Uva\n".getBytes()));
        assertEquals("Uva", flavor.chooseFlavor(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("Laranja\n".getBytes()));
        assertEquals("Laranja", flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForSoda() {
        Flavor flavor = new Flavor();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("Coca\n".getBytes()));
        assertEquals("Coca", flavor.chooseFlavor(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("Guaraná\n".getBytes()));
        assertEquals("Guaraná", flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForJuiceError() {
        Flavor flavor = new Flavor();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("Invalid\n".getBytes()));
        assertThrows(RuntimeException.class, () -> flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForInvalidDrink() {
        Flavor flavor = new Flavor();
        String drinkType = "Invalid";

        System.setIn(new java.io.ByteArrayInputStream("Coca\n".getBytes()));
        assertEquals("Coca", flavor.chooseFlavor(drinkType));
    }
}
