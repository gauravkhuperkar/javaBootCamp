package lengths;

public abstract class Scale {

    private LeastCount leastCount;

    public Scale(LeastCount leastCount) {
        this.leastCount = leastCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scale scale = (Scale) o;

        return leastCount != null ? leastCount.equals(scale.leastCount) : scale.leastCount == null;

    }
}
