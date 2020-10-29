package USB接案例;

public interface USB {
    public abstract void openDevice();
    public abstract void closeDevice();
    public default void insert(){
        System.out.println("Build Successfully");
    }
}
