package tests;

import main.Ice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IceTest {

    @Test
    void chooseIceForJuice() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("1".getBytes()));
        assertEquals(12, Ice.chooseIce(drinkType));
    }

    @Test
    void chooseNoIceForJuice() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("2".getBytes()));
        assertEquals(0, Ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForSoda() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("1".getBytes()));
        assertEquals(6, Ice.chooseIce(drinkType));
    }

    @Test
    void chooseNoIceForSoda() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("2".getBytes()));
        assertEquals(0, Ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForJuiceWithInvalidInput() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("3".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> Ice.chooseIce(drinkType));
    }

    @Test
    void chooseIceForSodaWithInvalidInput() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("3".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> Ice.chooseIce(drinkType));
    }
}
