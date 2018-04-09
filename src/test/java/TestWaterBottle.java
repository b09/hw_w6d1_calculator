import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWaterBottle {
    private WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle(100);
    }

    @Test
    public void canDrink() {
        assertEquals(90, myBottle.drink());
    }

    @Test
    public void makeEmpty() {
        assertEquals(0, myBottle.empty());
    }

    @Test
    public void bottleFill() {
        myBottle = new WaterBottle(0);
        assertEquals(100, myBottle.fill());
    }
}
