package USB接案例;

public class KeyBoard implements USB {
    @Override
    public void openDevice() {
        System.out.println("turn on KeyBoard");
    }

    @Override
    public void closeDevice() {
        System.out.println("turn off KeyBoard");

    }
}
