package USBjiekou;

public class Main {
    public static void main(String[] args) {
        //创建一个电脑
        Labtop obj =new Labtop();
        obj.turnOn();

        //创建一个鼠标,进行向上转型
        Usb obj1 = new Mouse();
        obj.useDevice(obj1);
        //创建一个键盘
        Usb obj2 = new Keyboard();
        obj.useDevice(obj2);


        obj.turnOff();
    }
}
