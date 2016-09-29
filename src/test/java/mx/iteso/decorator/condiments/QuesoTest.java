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
public class QuesoTest {
    private Taco taco;
    private Taco queso;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
        queso = new Queso(taco);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(Taco.REGULAR);
        double cost = queso.cost();
        assertEquals(11.0, cost,0);
    }

    @Test
    public void testCostMini(){
        when(taco.getSize()).thenReturn(Taco.MINI);
        queso.setSize(Taco.MINI);
        double cost = queso.cost();
        assertEquals(10.0,cost,0);
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(Taco.MEGA);
        queso.setSize(Taco.MEGA);
        double cost = queso.cost();
        assertEquals(12.0,cost,0);
    }

    @Test
    public void testDescription(){
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(Taco.MEGA);
        queso.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,queso.getSize());
    }
}
