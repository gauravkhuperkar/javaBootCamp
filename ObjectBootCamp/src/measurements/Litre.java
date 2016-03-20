package measurements;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Litre implements Unit {

    private double volume;

    private Litre(double volume) {

        this.volume = volume;
    }

    public static Litre create(double value) {
        return new Litre(value);
    }



    public Unit add(Unit unit) {
        double v = Double.valueOf(String.format("%.2f",(inBase() + unit.inBase())));
        return Litre.create(v );
    }

    @Override
    public double inBase() {
        return volume * 1.00;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return inBase() == unit.inBase();
    }
}
