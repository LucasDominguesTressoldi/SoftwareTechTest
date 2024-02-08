package tests;

import main.Size;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SizeTest {
    @Test
    public void testJuiceSize() {
        Size size = new Size();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("300".getBytes()));
        assertEquals("300", size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("500".getBytes()));
        assertEquals("500", size.chooseSize(drinkType));
    }

    @Test
    public void testSodaSize() {
        Size size = new Size();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("300".getBytes()));
        assertEquals("300", size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("500".getBytes()));
        assertEquals("500", size.chooseSize(drinkType));

        System.setIn(new java.io.ByteArrayInputStream("700".getBytes()));
        assertEquals("700", size.chooseSize(drinkType));
    }

    @Test
    public void testSodaSizeError() {
        Size size = new Size();
        String drinkType = "Refrigerante";

        System.setIn(new java.io.ByteArrayInputStream("800".getBytes()));
        assertThrows(RuntimeException.class, () -> size.chooseSize(drinkType));
    }

    @Test
    public void testJuiceSizeError() {
        Size size = new Size();
        String drinkType = "Suco";

        System.setIn(new java.io.ByteArrayInputStream("800".getBytes()));
        assertThrows(RuntimeException.class, () -> size.chooseSize(drinkType));
    }
}
