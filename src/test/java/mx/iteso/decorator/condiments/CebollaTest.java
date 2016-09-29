package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CebollaTest {
    private Taco taco;
    private Taco cebolla;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
        cebolla = new Cebolla(taco);
    }

    @Test
    public void testCost(){
        double cost = cebolla.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cebolla.getDescription();
        assertEquals("Taco Normal con cebolla", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(Taco.MEGA);
        cebolla.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,cebolla.getSize());
    }
}
