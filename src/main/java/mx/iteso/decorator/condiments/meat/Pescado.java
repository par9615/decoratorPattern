package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;

/**
 * Created by simio on 28/09/2016.
 */
public class Pescado extends Taco{
    Taco taco;

    public Pescado (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }

    public void setSize(int size) {
        if(size != REGULAR && size != MEGA){
            throw new IllegalStateException();
        }

        else{
            this.size = size;
        }

    }

    public int getSize() {
        return taco.getSize();
    }
}

