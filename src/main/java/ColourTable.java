import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    private final int paletteSize;

    public ColourTable(int paletteSize) {
        if (paletteSize <= 1 || (paletteSize & (paletteSize - 1)) != 0) {
            throw new IllegalArgumentException("Size must be a power of two and greater than 1.");
        }
        this.paletteSize = paletteSize;
    }

    public int getPaletteSize() {
        return paletteSize;
    }
}


