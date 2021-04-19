package Day09;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void method() {
        System.out.println("实现了抽象方法,B");
    }

    @Override
    public void method2(){
        System.out.println("覆盖重写,B");
    }
}
