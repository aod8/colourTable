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
    @Test
    void testAddValidColour(){
        ColourTable table=new ColourTable(4);
        table.addColour(255,0,0);//Red
        table.addColour(0,255,0);//Green
        assertEquals(2,table.getCurrentCount());
    }
    @Test
    void testAddExceedsCapacity() {
        ColourTable table = new ColourTable(2);
        table.addColour(255, 0, 0);
        table.addColour(0, 255, 0);
        assertThrows(IllegalStateException.class, () -> table.addColour(0, 0, 255)); // Exceeds capacity
    }


}



