package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        if(getSize() == taco.MINI)
            return 0.00 + taco.cost();
        else if(getSize() == taco.REGULAR)
            return 2.00 + taco.cost();
        else
            return 3.50 + taco.cost();
    }

    public void setSize(int size) {
        taco.size = size;
    }

    public int getSize() {
        return taco.getSize();
    }

}
