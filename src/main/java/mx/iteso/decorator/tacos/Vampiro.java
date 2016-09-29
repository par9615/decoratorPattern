package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by simio on 28/09/2016.
 */
public class Vampiro extends Taco {
    public Vampiro(){description = "Vampiro";}

    public double cost() {
        return 10.00;
    }
}
