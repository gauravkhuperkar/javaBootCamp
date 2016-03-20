package measurements;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Centimeter implements Unit {

    private double value;

    private Centimeter(double value) {

        this.value = value;
    }

    public static Centimeter create(double value) {
        return new Centimeter(value);
    }


    @Override
    public Litre add(Unit unit) {
        return Litre.create((double) (inBase() + unit.inBase()) * 0.4 );
    }

    @Override
    public double inBase() {
        return value * 10;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
}
