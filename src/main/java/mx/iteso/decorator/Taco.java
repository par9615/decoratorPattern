package mx.iteso.decorator;

public abstract class Taco {

    public static int MINI = 0;
    public static int REGULAR = 1;
    public static int MEGA = 2;

    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
    public abstract void setStize(int size);
    public abstract int getSize();
}
