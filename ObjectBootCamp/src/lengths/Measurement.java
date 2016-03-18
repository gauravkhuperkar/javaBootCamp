package lengths;

public class Measurement {
    private Scale scale;

    public Measurement(Scale scale) {
        this.scale = scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        return scale != null ? scale.equals(that.scale) : that.scale == null;

    }
    public boolean compare(Scale scale) {
        return this.scale.equals(scale);
    }
}
