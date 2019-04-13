package mate.academy.hw10;

import java.util.Objects;

// task 2: https://stepik.org/lesson/12769/step/9?unit=3117
public final class ComplexNumber {
    private final double REAL;
    private final double IMAGINARY;

    public ComplexNumber(double real, double imaginary) {
        this.REAL = real;
        this.IMAGINARY = imaginary;
    }

    public double getReal() {
        return REAL;
    }

    public double getImaginary() {
        return IMAGINARY;
    }

    @Override
    public int hashCode() {
        String value = Objects.toString(REAL);
        String index = Objects.toString(IMAGINARY);
        return 25 + value.hashCode() + index.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || !(this.getClass().equals(object.getClass()))) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) object;
        return (this.REAL == complexNumber.getReal()
                && this.IMAGINARY == complexNumber.getImaginary());
    }
}
