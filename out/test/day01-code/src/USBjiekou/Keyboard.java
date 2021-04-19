package USBjiekou;

public class Keyboard implements Usb{

    public void scanning(){
        System.out.println("键盘输入");
    }

    @Override
    public void turnOn() {
        System.out.println("键盘连接");
    }

    @Override
    public void turnOff() {
        System.out.println("断开键盘连接");
    }
}
