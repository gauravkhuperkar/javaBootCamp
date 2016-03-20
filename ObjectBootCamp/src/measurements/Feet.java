/*
    Job
        compare two length measurement
 */

package measurements;

public class Feet implements Unit {
    private final double value;

    private Feet(double value) {
        this.value = value;
    }

    public static Feet create(int value){
        return new Feet(value);
    }


    @Override
    public Unit add(Unit unit) {
        return Inch.create((double) (inBase() + unit.inBase()) * 0.4 );
    }

    @Override
    public double inBase() {
        return value * 300;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
}
