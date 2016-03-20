package measurements.unit;

public enum LengthUnits {
    FEET(12),
    INCH(1),
    CM(0.4),
    MM(0.04);

    private final double multiplier;

    LengthUnits(double multiplier) {
        this.multiplier = multiplier;
    }

    public double convertIntoBase(double value) {
        return value * multiplier;
    }
}
