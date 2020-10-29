package USB接案例;

public class AppMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.open();

        laptop.useUSBDevice(new Mouse());
        laptop.OFF();
        laptop.useUSBDevice(new KeyBoard());


    }
}
