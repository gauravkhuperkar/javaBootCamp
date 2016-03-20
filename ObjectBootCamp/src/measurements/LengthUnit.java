package measurements;

import measurements.exception.NotOfSameMeasurementException;

public abstract class LengthUnit implements Unit {
    protected final double value;
    protected LengthUnit(double value){
        this.value = value;
    }
    @Override
    public Unit add(Unit unit) {
        if (getClass().getSuperclass() != unit.getClass().getSuperclass())
            throw new NotOfSameMeasurementException("can not add two different measurement");
        return Inch.create((inBase() + unit.inBase()) * 0.04);
    }
    @Override
    public boolean equalsTo(Unit unit) {
        if (getClass().getSuperclass() != unit.getClass().getSuperclass())
            throw new NotOfSameMeasurementException("two different measurement can not be equal");
        return inBase() == unit.inBase();
    }
}
