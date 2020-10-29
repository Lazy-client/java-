package USB接案例;

public class Laptop {
    public void open(){
        System.out.println("BE ON");
    }
    public void OFF(){
        System.out.println("BE OFF");
    }
    public void useUSBDevice(USB usb){
//        判断usb是否为鼠标
        if (usb instanceof Mouse)
        {
            usb.openDevice();
            usb.closeDevice();
        }
//        判断usb是否为键盘
        if (usb instanceof KeyBoard)
        {
            usb.openDevice();
            usb.closeDevice();
        }


    }
}
