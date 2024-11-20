import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ColourTableTest {
    @Test
    void testConstructorWithValidSize() {
        ColourTable table = new ColourTable(8); // Valid size (power of 2)
        assertEquals(8, table.getPaletteSize());
    }
    @Test
    void testConstructorWithInvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(3));//Invalid Size (Not power of 2)
    }

}



