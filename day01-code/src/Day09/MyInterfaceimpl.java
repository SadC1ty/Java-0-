package Day09;

public class MyInterfaceimpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("A的覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("B的覆盖重写");
    }
}
