/*
    Job
        compare two length measurement
 */

package lengths;

public class Feet extends Scale{
    private Feet(LeastCountForLength inch) {
        super(inch);
    }

    public static Feet create(int value){
        int inMilimeter = value*300;
        LeastCountForLength leastCountForLength = new LeastCountForLength(inMilimeter);
        return new Feet(leastCountForLength);
    }

}
