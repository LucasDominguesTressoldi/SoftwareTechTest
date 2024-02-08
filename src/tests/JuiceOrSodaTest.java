package tests;

import static org.junit.jupiter.api.Assertions.*;

import main.JuiceOrSoda;
import org.junit.jupiter.api.Test;

class JuiceOrSodaTest {
    @Test
    void chooseJuiceOrSodaError() {
        assertThrows(IllegalArgumentException.class, () -> {
            JuiceOrSoda.chooseJuiceOrSoda("3");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            JuiceOrSoda.chooseJuiceOrSoda("invalid");
        });
    }
}
