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
public class PescadoTest {
    private Taco taco;
    private Taco pescado;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCost(){
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = pescado.cost();
        assertEquals(8.25, cost,0);
    }
    @Test (expected = IllegalStateException.class)
    public void testCostMini(){
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = pescado.cost();
    }

    @Test
    public void testCostMega(){
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = pescado.cost();
        assertEquals(9.00, cost,0);
    }
    @Test
    public void testDescription(){

        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    @Test
    public void testSettingSize() {
        when(taco.getSize()).thenReturn(taco.MEGA);
        pescado.setSize(Taco.MEGA);
        assertEquals(Taco.MEGA,pescado.getSize());
    }

    @Test (expected = IllegalStateException.class)
    public void testSettingInvalidSize() {
        pescado.setSize(Taco.MINI);
    }
}
