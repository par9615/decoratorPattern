package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
