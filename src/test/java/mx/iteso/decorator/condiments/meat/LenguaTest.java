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
public class LenguaTest {
    private Taco taco;
    private Taco lengua;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = lengua.cost();
        assertEquals(10.00, cost,0);
    }
    @Test
    public void testCostMini(){
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = lengua.cost();
        assertEquals(9.80,cost,0);
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = lengua.cost();
        assertEquals(11.15, cost,0);
    }
    @Test
    public void testDescription(){

        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = lengua.getDescription();
        assertEquals("Taco Normal de lengua", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(taco.MEGA);
        lengua.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,lengua.getSize());
    }
}
