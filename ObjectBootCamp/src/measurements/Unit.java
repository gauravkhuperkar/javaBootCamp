package measurements;

public interface Unit {
    Unit add(Unit unit);
    double inBase();
    boolean equalsTo(Unit unit);
}
