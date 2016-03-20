package measurements;

public class Millimeter extends LengthUnit{
    protected Millimeter(double value) {
        super(value);
    }

    @Override
    public double inBase() {
        return value;
    }

    public static Millimeter create(double value){
        return new Millimeter(value);
    }
}
