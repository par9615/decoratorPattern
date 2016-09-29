package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Vampiro;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/09/2016.
 */
public class VampiroTest {
    Taco vampiro;
    @Before
    public void setUp() {
        vampiro = new Vampiro(Taco.REGULAR);
    }

    @Test
    public void testCost() {
        assertEquals(12.0, vampiro.cost(),0);
    }

    @Test
    public void testSettingSize() {
        vampiro.setSize(Taco.REGULAR);
        assertEquals(Taco.REGULAR,vampiro.getSize());
    }

    @Test (expected = IllegalStateException.class)
    public void testSettingMiniSize() {
        vampiro.setSize(Taco.MINI);
    }

    @Test (expected = IllegalStateException.class)
    public void testSettingMegaSize() {
        vampiro.setSize(Taco.MEGA);
    }
}
