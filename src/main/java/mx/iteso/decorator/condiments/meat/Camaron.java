package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;

/**
 * Created by simio on 28/09/2016.
 */
public class Camaron extends Taco{
    Taco taco;

    public Camaron (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camarón";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }

    public void setSize(int size) {
        taco.size = size;
    }

    public int getSize() {
        return taco.getSize();
    }
}

