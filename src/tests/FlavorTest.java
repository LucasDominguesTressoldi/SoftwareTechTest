package tests;

import main.Flavor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlavorTest {

    @Test
    void chooseFlavorForJuice() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("Uva\n".getBytes()));
        assertEquals("Uva", Flavor.chooseFlavor(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("Laranja\n".getBytes()));
        assertEquals("Laranja", Flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForSoda() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("Coca\n".getBytes()));
        assertEquals("Coca", Flavor.chooseFlavor(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("Guaraná\n".getBytes()));
        assertEquals("Guaraná", Flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForJuiceError() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("Invalid\n".getBytes()));
        assertThrows(RuntimeException.class, () -> Flavor.chooseFlavor(drinkType));
    }

    @Test
    void chooseFlavorForInvalidDrink() {
        String drinkType = "Invalid";

        System.setIn(new java.io.ByteArrayInputStream("Coca\n".getBytes()));
        assertEquals("Coca", Flavor.chooseFlavor(drinkType));
    }
}
