package USB接案例;

public class Mouse implements USB{
    @Override
    public void openDevice() {
        System.out.println("turn on Mouse");
    }

    @Override
    public void closeDevice() {

        System.out.println("turn off Mouse");
    }
}
