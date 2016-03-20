package measurements.unit;

public enum VolumeUnits implements UnitMeasurement {
    LITRE (1),
    GALLON(3.78);

    private double multiplier;

    VolumeUnits(double multiplier) {
        this.multiplier = multiplier;
    }

    public double convertIntoBase(double value) {
        return value * multiplier;
    }
}
