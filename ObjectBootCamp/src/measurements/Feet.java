/*
    Job
        compare two length measurement
 */

package measurements;

public class Feet extends LengthUnit {

    private Feet(double value) {
        super(value);
    }

    public static Feet create(int value){
        return new Feet(value);
    }

    @Override
    public double inBase() {
        return value * 300;
    }
}
