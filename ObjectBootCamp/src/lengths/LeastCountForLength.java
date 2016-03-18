package lengths;

public class LeastCountForLength implements LeastCount {
    private int value;

    public LeastCountForLength(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeastCountForLength that = (LeastCountForLength) o;

        return value == that.value;
    }
}
