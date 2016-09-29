package mx.iteso.decorator;

public abstract class Taco {

    public final static int MINI = 0;
    public final static int REGULAR = 1;
    public final static int MEGA = 2;

    public String description = "Any Taco";

    public int size = REGULAR;
    public String getDescription(){
        return description;
    }
    public abstract double cost() throws Exception;
    public abstract void setSize(int size);
    public abstract int getSize();


}
