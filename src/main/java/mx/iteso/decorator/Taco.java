package mx.iteso.decorator;

public abstract class Taco {

    public static int MINI = 0;
    public static int REGULAR = 1;
    public static int MEGA = 2;

    public String description = "Any Taco";

    public int size = REGULAR;
    public String getDescription(){
        return description;
    }
    public abstract double cost() throws IllegalStateException;
    public abstract void setSize(int size);
    public abstract int getSize();


}
