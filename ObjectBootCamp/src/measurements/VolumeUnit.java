package measurements;

/**
 * Created by gauravkh on 19/03/16.
 */
public abstract class VolumeUnit implements Unit{
    private double value;
    protected VolumeUnit(double value) {
        this.value = value;
    }
    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
    @Override
    public Unit add(Unit unit) {
        return Litre.create((double) (inBase() + unit.inBase()));
    }
}
