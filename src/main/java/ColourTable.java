import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    private final int paletteSize;
    private final List<int[]> colours=new ArrayList<>();

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
        /**
         * Adds an RGB color to the palette.
         *
         * @param red   The red component (0-255).
         * @param green The green component (0-255).
         * @param blue  The blue component (0-255).
         * @throws IllegalStateException if the palette is full or if the RGB values are invalid.
         */
    }
    public void addColour(int red,int green,int blue){
        validateCapacity();
        validateRGB(red, green, blue);
        colours.add(new int[]{red,green,blue});
    }
    /**
     * Returns the current number of colors in the palette.
     *
     * @return The number of colors in the palette.
     */
    public int getCurrentCount(){
        return colours.size();
    }
    /**
     * Validates that the palette has remaining capacity.
     *
     * @throws IllegalStateException if the palette is full.
     */
    private void validateCapacity() {
        if (colours.size() >= paletteSize) {
            throw new IllegalStateException("Palette is full.");
        }
    }
    /**
     * Validates the RGB values.
     *
     * @param red   The red component to validate.
     * @param green The green component to validate.
     * @param blue  The blue component to validate.
     * @throws IllegalArgumentException if any component is out of the valid range (0-255).
     */
    private void validateRGB(int red, int green, int blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Invalid RGB value: each component must be between 0 and 255.");
        }
    }
}


