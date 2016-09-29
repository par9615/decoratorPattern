package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(){
        description = "Taco normal";
    }

    @Override
    public double cost() {
        return 8.00;
    }
}
