package lengths;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Gallon extends Scale {
    public Gallon(LeastCountForVolume leastCountForVolume) {
        super(leastCountForVolume);
    }

    public static Gallon create(double value) {
        double inML = value * 3780;
        LeastCountForVolume leastCountForVolume = new LeastCountForVolume(inML);
        return new Gallon(leastCountForVolume);
    }
}
