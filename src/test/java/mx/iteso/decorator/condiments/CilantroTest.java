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
public class CilantroTest {
    private Taco taco;
    private Taco cilantro;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
        cilantro = new Cilantro(taco);
    }

    @Test
    public void testCost(){
        double cost = cilantro.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cilantro.getDescription();
        assertEquals("Taco Normal con cilantro", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(Taco.MEGA);
        cilantro.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,cilantro.getSize());
    }
}
