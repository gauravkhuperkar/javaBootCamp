/*
    Job :-
        compare to length measurement and manipulation of two length
*/

package measurements.scale;

import measurements.unit.LengthUnits;

public class LengthMeasurement{
    private double value;
    private LengthUnits unit;

    public LengthMeasurement(double value, LengthUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(LengthMeasurement length) {
        return Math.abs(this.covertIntoBase()-length.covertIntoBase()) < 0.01;
    }

    public LengthMeasurement add(LengthMeasurement length) {
        return new LengthMeasurement(this.covertIntoBase()+length.covertIntoBase(),LengthUnits.INCH);
    }

    public double covertIntoBase() {
        return unit.convertIntoBase(value);
    }
}