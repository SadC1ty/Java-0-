package USBjiekou;

public class Mouse  implements Usb{

    @Override
    public void turnOn() {
        System.out.println("连入鼠标");
    }

    @Override
    public void turnOff() {
        System.out.println("断开鼠标连接");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
