package mate.academy.hw10;

// task 2: https://stepik.org/lesson/12769/step/9?unit=3117
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return (int) (re * im + Math.random() * 9999);
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
        return (this.re == complexNumber.getRe()
                && this.im == complexNumber.getIm());
    }
}
