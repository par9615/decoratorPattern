package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Cebolla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Erick on 29/09/2016.
 */
public class BistecTest {
    private Taco taco;
    private Taco bistec;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = bistec.cost();
        assertEquals(9.0, cost,0);
    }
    @Test
    public void testCostMini(){
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = bistec.cost();
        assertEquals(8.25, cost,0);
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = bistec.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testDescription(){

        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(taco.MEGA);
        bistec.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,bistec.getSize());
    }
}
