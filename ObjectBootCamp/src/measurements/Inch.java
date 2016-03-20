/*
    Job
        compare two length measurement
 */
package measurements;

public class Inch implements Unit {
    private double value;

    private Inch(double value) {
        this.value = value;
    }

    public static Inch create(double value) {
        return new Inch(value);
    }


    @Override
    public Unit add(Unit unit) {
        return Inch.create((double) (inBase() + unit.inBase()) * 0.04);
    }

    @Override
    public double inBase() {
        return value * 25;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
}
