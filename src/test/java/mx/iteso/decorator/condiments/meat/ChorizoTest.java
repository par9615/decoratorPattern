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
public class ChorizoTest {
    private Taco taco;
    private Taco chorizo;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = chorizo.cost();
        assertEquals(9.15, cost,0);
    }
    @Test
    public void testCostMini(){
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = chorizo.cost();
        assertEquals(8.50,cost,0);
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = chorizo.cost();
        assertEquals(11.0, cost,0);
    }
    @Test
    public void testDescription(){

        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal de chorizo", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(taco.MEGA);
        chorizo.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,chorizo.getSize());
    }
}
