package chance;

import exceptions.IllegalInputException;

public class Chance {

    private double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance create(double value) throws IllegalInputException {
        if(value < 0 && value > 1)
            throw new IllegalInputException("Value should be within 0 to 1");
        return new Chance(value);
    }

    public Chance not() throws IllegalInputException {
        return create(1-value);
    }

    public Chance and(Chance chance) throws IllegalInputException {
        return create(this.value*chance.value);
    }

    public Chance or(Chance chance) throws IllegalInputException {
        return create(this.value+chance.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        return Double.compare(chance.value, value) == 0;

    }

    @Override
    public String toString() {
        return "Chance{" +
                "value=" + value +
                '}';
    }
}
