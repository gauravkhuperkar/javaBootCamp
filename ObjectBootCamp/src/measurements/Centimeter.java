package measurements;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Centimeter extends LengthUnit {

    private Centimeter(double value) {
        super(value);
    }

    public static Centimeter create(double value) {
        return new Centimeter(value);
    }

    @Override
    public double inBase() {
        return value * 10;
    }
}
