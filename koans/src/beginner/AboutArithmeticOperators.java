package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutArithmeticOperators {
    @Koan
    public void notSoSimpleOperations() {
        assertEquals(1 / 2, 0);
        assertEquals(3 / 2, 1);
        assertEquals(1 % 2, 1);
        assertEquals(3 % 2, 1);
    }

    @Koan
    public void minusMinusVariableMinusMinus() {
        int i = 1;
        assertEquals(--i, 0);
        assertEquals(i, 0);
        assertEquals(i--, 0);
        assertEquals(i, -1);
    }

    @Koan
    public void plusPlusVariablePlusPlus() {
        int i = 1;
        assertEquals(++i, 2);
        assertEquals(i, 2);
        assertEquals(i++, 2);
        assertEquals(i, 3);
    }

    @Koan
    public void timesAndDivInPlace() {
        int i = 1;
        i *= 2;
        assertEquals(i, 2);
        i /= 2;
        assertEquals(i, 1);
    }

}
