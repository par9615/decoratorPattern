package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/09/2016.
 */
public class QuesadillaTest {
    Taco quesadilla;
    @Before
    public void setUp() {
        quesadilla = new Quesadilla(Taco.REGULAR);
    }

    @Test
    public void testCost() {
        assertEquals(10.0, quesadilla.cost(),0);
    }

    @Test
    public void testSettingSize() {
        quesadilla.setSize(Taco.MINI);
        assertEquals(Taco.MINI, quesadilla.getSize());
    }
}
