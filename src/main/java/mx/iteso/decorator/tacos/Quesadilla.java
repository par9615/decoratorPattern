package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    private Quesadilla(){
        description = "Quesadilla";
    }

    public Quesadilla(int size) {
        super();
        setSize(size);
    }

    @Override
    public double cost() {
        return 10.00;
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
