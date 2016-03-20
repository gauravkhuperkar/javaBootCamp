package measurements;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Gallon implements Unit{
    private double value;

    @Override
    public Unit add(Unit unit) {
        return Litre.create((double) (inBase() + unit.inBase()));
    }

    @Override
    public double inBase() {
        return value * 3.78;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
    private Gallon(double value) {
        this.value = value;
    }

    public static Gallon create(double value) {

        return new Gallon(value);
    }
}
