/*
    Job
        compare two length measurement
 */
package lengths;

public class Inch extends Scale{
    private int value;

    private Inch(LeastCountForLength value) {
        super(value);
    }

    public static Scale create(int value) {
        int inMelimeter = value * 25;
        LeastCountForLength leastCountForLength = new LeastCountForLength(inMelimeter);
        return new Inch(leastCountForLength);
    }
}
