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
public class TortillaMaizTest {
    private Taco taco;
    private Taco tortillaMaiz;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
        tortillaMaiz = new TortillaMaiz(taco);
    }

    @Test
    public void testCost(){
        double cost = tortillaMaiz.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaMaiz.getDescription();
        assertEquals("Taco Normal en tortilla de maíz", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(Taco.MEGA);
        tortillaMaiz.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,tortillaMaiz.getSize());
    }
}
