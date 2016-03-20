package measurements;

public  abstract class VolumeUnit implements Unit{
    protected final double volume;
    protected VolumeUnit(double value) {
        this.volume = value;
    }
    @Override
    public boolean equalsTo(Unit unit) {
        if (getClass().getSuperclass() != unit.getClass().getSuperclass())
            throw new NotOfSameMeasurementException("two different measurement can not be equal");
        return inBase() == unit.inBase();
    }
    public Unit add(Unit unit) {
        if(getClass().getSuperclass() != unit.getClass().getSuperclass())
            throw new NotOfSameMeasurementException("Can not add different measurement");
        double v = Double.valueOf(String.format("%.2f",(inBase() + unit.inBase())));
        return Litre.create(v );
    }

}
