package tests;

import main.CupLid;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CupLidTest {

    @Test
    public void testTakeOutYes() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String result = CupLid.takeOut();

        System.setIn(System.in);

        assertEquals("Não", result);
    }

    @Test
    public void testTakeOutNo() {
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String result = CupLid.takeOut();

        System.setIn(System.in);

        assertEquals("Sim", result);
    }

    @Test
    public void testTakeOutInvalidInputString() {
        String input = "invalidInput";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(InputMismatchException.class, CupLid::takeOut);

        System.setIn(System.in);
    }

    @Test
    public void testTakeOutInvalidInputInt() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, CupLid::takeOut);

        System.setIn(System.in);
    }
}
