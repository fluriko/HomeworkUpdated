package mate.academy.hw10;

import java.util.Objects;

// task 2: https://stepik.org/lesson/12769/step/9?unit=3117
public final class ComplexNumber {
    private final double VALUE;
    private final double INDEX;

    public ComplexNumber(double value, double index) {
        this.VALUE = value;
        this.INDEX = index;
    }

    public double getRe() {
        return VALUE;
    }

    public double getIm() {
        return INDEX;
    }

    @Override
    public int hashCode() {
        String value = Objects.toString(VALUE);
        String index = Objects.toString(INDEX);
        return 25 + value.hashCode() + index.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(this.getClass().equals(object.getClass()))) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) object;
        return (this.VALUE == complexNumber.getRe()
                && this.INDEX == complexNumber.getIm());
    }
}
