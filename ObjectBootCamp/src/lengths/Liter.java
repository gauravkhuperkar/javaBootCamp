package lengths;

/**
 * Created by gauravkh on 18/03/16.
 */
public class Liter extends Scale{

    private Liter(LeastCountForVolume volume) {
        super(volume);
    }

    public static Liter create(double value) {
        double inML =(double) value * 1000;
        LeastCountForVolume leastCountForVolume = new LeastCountForVolume(inML);
        return new Liter(leastCountForVolume);
    }


}
