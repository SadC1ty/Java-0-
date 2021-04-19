package Day09;

public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticimpl a = new MyInterfaceStaticimpl();
        //错误写法,不能通过接口实现类的对象调用静态方法;
        //a.method();

        //正确用法,通过接口名称直接调用静态方法
        MyInterfaceStatic.method();//这是静态的接口方法
    }
}
