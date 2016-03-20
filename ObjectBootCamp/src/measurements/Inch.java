/*
    Job
        compare two length measurement
 */
package measurements;

public class Inch extends LengthUnit {
    private Inch(double value) {
        super(value);
    }

    public static Inch create(double value) {
        return new Inch(value);
    }



    @Override
    public double inBase() {
        return value * 25;
    }

}
