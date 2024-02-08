package tests;

import main.CupMaterial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupMaterialTest {

    @Test
    public void testChooseCupMaterialPaper() {
        CupMaterial cupMaterial = new CupMaterial();
        assertEquals("Papel", cupMaterial.chooseCupMaterial("Refrigerante"));
    }

    @Test
    public void testChooseCupMaterialPlastic() {
        CupMaterial cupMaterial = new CupMaterial();
        assertEquals("Plástico", cupMaterial.chooseCupMaterial("Suco"));
    }
}
