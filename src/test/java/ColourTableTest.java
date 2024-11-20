import org.junit.jupiter.api.Test;

import java.util.List;

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
    @Test
    void testAddInvalidRGBValues() {
        ColourTable table = new ColourTable(4);
        assertThrows(IllegalArgumentException.class, () -> table.addColour(256, 0, 0)); // Invalid red
        assertThrows(IllegalArgumentException.class, () -> table.addColour(0, -1, 0)); // Invalid green
        assertThrows(IllegalArgumentException.class, () -> table.addColour(0, 0, 300)); // Invalid blue
    }
    @Test
    void testStoredColours() {
        ColourTable table = new ColourTable(2);
        table.addColour(255, 0, 0); // Red
        table.addColour(0, 255, 0); // Green
        List<int[]> colours = table.getColours();
        assertArrayEquals(new int[]{255, 0, 0}, colours.get(0));
        assertArrayEquals(new int[]{0, 255, 0}, colours.get(1));
    }


}



