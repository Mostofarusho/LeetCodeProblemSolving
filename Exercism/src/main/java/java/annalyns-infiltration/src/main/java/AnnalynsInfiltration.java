// Save this file as AnnalynsInfiltrationTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnalynsInfiltrationTest {

    @Test
    void testCanFastAttack() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
    }

    @Test
    void testCanSpy() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, true, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    void testCanSignalPrisoner() {
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false, true));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, true));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(false, false));
    }

    @Test
    void testCanFreePrisoner() {
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, true));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, false, true));
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, false, false));
    }
}
