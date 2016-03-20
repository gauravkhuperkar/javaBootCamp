package measurements;

public class Litre extends VolumeUnit {
    private Litre(double volume) {
        super(volume);
    }

    public static Litre create(double value) {
        return new Litre(value);
    }
    @Override
    public double inBase() {
        return volume * 1.00;
    }
}
