package tests;

import main.CupMaterial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupMaterialTest {

    @Test
    public void testChooseCupMaterialPaperOrPlastic() {
        assertEquals("Papel", CupMaterial.chooseCupMaterial("Refrigerante"));
        assertEquals("Plástico", CupMaterial.chooseCupMaterial("Suco"));
    }
}
