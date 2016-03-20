package measurements;

public class Gallon extends VolumeUnit {

    @Override
    public double inBase() {
        return volume * 3.78;
    }


    private Gallon(double value) {
        super(value);
    }

    public static Gallon create(double value) {

        return new Gallon(value);
    }
}
