package test;

public class Power {
    public double Power(double base, int exponent) {
        boolean pos = false;
        if (exponent < 0) {
            pos = true;
            exponent *= -1;
        }
        if (exponent == 0)
            return 1;
        if (base == 0)
            return 0;
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        if (pos)
            result = 1 / result;
        return result;
    }
}
