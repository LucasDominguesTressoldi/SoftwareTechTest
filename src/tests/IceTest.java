package tests;

import main.Ice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IceTest {

    @Test
    void chooseIceForJuice() {
        Ice ice = new Ice();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("1".getBytes()));
        assertEquals(12, ice.chooseIce(drinkType));
    }

    @Test
    void chooseNoIceForJuice() {
        Ice ice = new Ice();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("2".getBytes()));
        assertEquals(0, ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForSoda() {
        Ice ice = new Ice();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("1".getBytes()));
        assertEquals(6, ice.chooseIce(drinkType));
    }

    @Test
    void chooseNoIceForSoda() {
        Ice ice = new Ice();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("2".getBytes()));
        assertEquals(0, ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForJuiceWithInvalidInput() {
        Ice ice = new Ice();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("3".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForSodaWithInvalidInput() {
        Ice ice = new Ice();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("3".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> ice.chooseIce(drinkType));
    }
}
