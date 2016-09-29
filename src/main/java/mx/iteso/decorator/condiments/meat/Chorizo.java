package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }

}
