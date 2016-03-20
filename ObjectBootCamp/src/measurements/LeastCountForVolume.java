package measurements;

public class LeastCountForVolume implements LeastCount {
    private double value;

    public LeastCountForVolume(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeastCountForVolume that = (LeastCountForVolume) o;
        System.out.println(value+"dfff"+that.value);


        return value == that.value;

    }
}
