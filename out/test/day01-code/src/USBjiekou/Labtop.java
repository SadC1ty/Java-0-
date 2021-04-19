package USBjiekou;

public class Labtop {
    public void turnOn(){
        System.out.println("开机");
    }
    public void turnOff(){
        System.out.println("关机");
    }
    public void useDevice(Usb usb){
        usb.turnOn();
        if(usb instanceof Mouse){
            Mouse obj = (Mouse) usb;
            obj.click();
        }
        if(usb instanceof Keyboard){
            Keyboard obj = (Keyboard) usb;
            obj.scanning();
        }
        usb.turnOff();
    }
}
