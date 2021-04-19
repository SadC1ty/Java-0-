package Day10;

public class Demo02Innerclass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();  //30 20 10
    }
}
