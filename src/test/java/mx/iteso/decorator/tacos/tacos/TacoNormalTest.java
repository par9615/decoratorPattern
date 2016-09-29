package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    Taco tacoNormal;
    @Before
    public void setUp() {
        tacoNormal = new TacoNormal(Taco.REGULAR);
    }

    @Test
    public void testCost() {
        assertEquals(8.0, tacoNormal.cost(),0);
    }

    @Test
    public void testSettingSize() {
        tacoNormal.setSize(Taco.MINI);
        assertEquals(Taco.MINI,tacoNormal.getSize());
    }

    @Test (expected = IllegalStateException.class)
    public void testSettingInvalidSize() {
        tacoNormal.setSize(4);
    }
}
