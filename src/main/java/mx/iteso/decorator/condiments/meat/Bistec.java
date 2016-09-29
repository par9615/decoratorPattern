package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de bistec";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
