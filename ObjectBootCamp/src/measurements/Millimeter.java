package measurements;

public class Millimeter implements Unit{
    @Override
    public Unit add(Unit unit) {
        return null;
    }

    @Override
    public double inBase() {
        return 0;
    }

    @Override
    public boolean equalsTo(Unit unit) {
        return false;
    }
}
