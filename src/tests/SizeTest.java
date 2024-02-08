package tests;

import main.Size;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SizeTest {
    @Test
    public void testJuiceSize() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("300".getBytes()));
        assertEquals("300", Size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("500".getBytes()));
        assertEquals("500", Size.chooseSize(drinkType));
    }

    @Test
    public void testSodaSize() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("300".getBytes()));
        assertEquals("300", Size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("500".getBytes()));
        assertEquals("500", Size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("700".getBytes()));
        assertEquals("700", Size.chooseSize(drinkType));
    }

    @Test
    public void testSodaSizeError() {
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("800".getBytes()));
        assertThrows(RuntimeException.class, () -> Size.chooseSize(drinkType));
    }

    @Test
    public void testJuiceSizeError() {
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("800".getBytes()));
        assertThrows(RuntimeException.class, () -> Size.chooseSize(drinkType));
    }
}
