package measurements;

public class Measurement {
    private Unit unit;

    public Measurement(Unit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        return unit != null ? unit.equals(that.unit) : that.unit == null;

    }
    public boolean compare(Unit unit) {
        return this.unit.equals(unit);
    }
}
