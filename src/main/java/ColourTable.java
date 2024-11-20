import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    private final int paletteSize;

    /**
     * Constructs a ColourTable with a specified palette size
     * @param paletteSize The number of colours in the palette. Must be greater than one and be a power of 2.
     * @throws IllegalArgumentException if the palette size is not valid.
     */


    public ColourTable(int paletteSize) {
        validatePaletteSize(paletteSize);
        this.paletteSize = paletteSize;
    }

    /**
     * Returns the size of the colour palette.
     * @return The palette size.
     */
    public int getPaletteSize() {
        return paletteSize;
    }
    /**
     * Validates that the given palette size is a power of two and greater than 1.
     * @param size The palette size to validate
     * @throws IllegalArgumentException if the size is invalid.
     */
    private void validatePaletteSize(int size) {
        if (size <= 1 || (size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Palette size must be a power of two and greater than 1.");
        }
    }
}


