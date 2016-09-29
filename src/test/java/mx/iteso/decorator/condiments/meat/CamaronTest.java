package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Erick on 29/09/2016.
 */
public class CamaronTest {
    private Taco taco;
    private Taco camaron;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = camaron.cost();
        assertEquals(9.0, cost,0);
    }
   @Test (expected = IllegalStateException.class)
    public void testCostMini(){
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = camaron.cost();
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = camaron.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testDescription(){

        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(taco.MEGA);
        camaron.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,camaron.getSize());
    }

    @Test (expected = IllegalStateException.class)
    public void testSettingInvalidSize() {
        camaron.setSize(Taco.MINI);
    }
}
