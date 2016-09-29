package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(){
        description = "Quesadilla";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
