/*
    Job :-
        Volume measurements should measure values and manipulate vaolumes
*/

package measurements.scale;

import measurements.unit.VolumeUnits;

public class VolumeMeasurement{

    private double value;
    private VolumeUnits unit;

    public VolumeMeasurement(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(LengthMeasurement length) {
        return Math.abs(this.covertIntoBase()-length.covertIntoBase()) < 0.01;
    }

    public VolumeMeasurement add(VolumeMeasurement length) {
        return new VolumeMeasurement(this.covertIntoBase()+length.covertIntoBase(), VolumeUnits.LITRE);
    }

    public double covertIntoBase() {
        return unit.convertIntoBase(value);
    }
}