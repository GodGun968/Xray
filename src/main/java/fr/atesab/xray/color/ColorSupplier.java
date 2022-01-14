package fr.atesab.xray.color;

public class ColorSupplier {
    private static final int[] COLORS = { 0xff00ffff, 0xffff0000, 0xffffff00, 0xffff00ff, 0xff7aff00, 0xffff7a00,
            0xff00ff7a, 0xffff007a, 0xff7a00ff, 0xff7a7aff, 0xff7aff7a, 0xffff7a7a };
    public static final ColorSupplier DEFAULT = new ColorSupplier();

    private int index = -1;

    public int getColor() {
        return COLORS[index = (index + 1) % COLORS.length];
    }

    public void reset() {
        index = -1;
    }
}