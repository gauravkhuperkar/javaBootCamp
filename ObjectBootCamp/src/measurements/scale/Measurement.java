package measurements.scale;

import measurements.unit.UnitMeasurement;

public abstract class Measurement {
//    private Unit unit;
//
//    public Measurement(Unit unit) {
//        this.unit = unit;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Measurement that = (Measurement) o;
//
//        return unit != null ? unit.equals(that.unit) : that.unit == null;
//
//    }
//    public boolean compare(Unit unit) {
//        return this.unit.equals(unit);
//    }

    private final UnitMeasurement unit;
    private final double value;

    public Measurement(double value, UnitMeasurement unit) {
        this.unit = unit;
        this.value = value;
    }

    public abstract boolean equalTo(Measurement comparator);
//    {
//        return Math.abs(this.unit.convertIntoBase(value) - comparator.unit.convertIntoBase(comparator.value)) < 0.01;
//    }

    public abstract Measurement add(Measurement otherMeasurement);
//    {
//        value1 = unit.covertIntoBase(otherMeasurement.unit);
//        value2 = otherMeasurement.covertIntoBase(otherMeasurement.unit);
//        sum = value1+value2;
//        return Measurement.create(sum,Inch/Liter);
//    }

    public abstract double covertIntoBase();
//    {
//        value * multiplayar;
//    }


}
