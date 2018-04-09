import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    private Calculator someCalculator;

    @Before
    public void before() {
        someCalculator = new Calculator(10, 5);
    }

    @Test
    public void canAdd() {
        assertEquals(15, someCalculator.addNumbers());
    }


    @Test
    public void canSubtract() {
        assertEquals(5, someCalculator.subtractNumbers());
    }

    @Test
    public void canMultiply() {
        assertEquals(50, someCalculator.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(2, someCalculator.divideNumbers());
    }
}
