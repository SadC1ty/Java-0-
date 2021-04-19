package Day09;
/*
1.接口的默认方法,可以通过接口实现对象,直接调用;
2.接口的默认方法,也可以被接口类进行覆盖重写;
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.method(); //实现了抽象方法,A
        a.method2();//这是新添加的默认方法

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.method(); //实现了抽象方法,B
        b.method2();//覆盖重写,B
    }
}
