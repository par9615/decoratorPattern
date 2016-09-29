package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Erick on 29/09/2016.
 */
public class TortillaHarinaTest {
    private Taco taco;
    private Taco tortillaHarina;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
        tortillaHarina = new TortillaHarina(taco);
    }

    @Test
    public void testCost(){
        double cost = tortillaHarina.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaHarina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(Taco.MEGA);
        tortillaHarina.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,tortillaHarina.getSize());
    }
}
