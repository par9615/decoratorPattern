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

    public void setSize(int size) {
        if(size != this.REGULAR && size != this.MEGA && size != this.MINI){
            throw new IllegalStateException();
        }
        else{

            this.size = size;
        }
    }

    public int getSize() {
        return this.size;
    }
}

