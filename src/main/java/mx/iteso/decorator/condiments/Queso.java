package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        if(getSize() == taco.MINI)
            return 2.00 + taco.cost();
        else if(getSize() == taco.REGULAR)
            return 3.00 + taco.cost();
        else
            return 4.00 + taco.cost();
    }

    public void setSize(int size) {
        taco.size = size;
    }

    public int getSize() {
        return taco.getSize();
    }
}
