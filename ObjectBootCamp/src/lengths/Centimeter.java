package lengths;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Centimeter extends Scale {

    private Centimeter(LeastCountForLength value) {
        super(value);
    }

    public static Centimeter create(int value) {
        int inMillimeter = value * 10;
        LeastCountForLength leastCountForLength = new LeastCountForLength(inMillimeter);
        return new Centimeter(leastCountForLength);
    }
}
