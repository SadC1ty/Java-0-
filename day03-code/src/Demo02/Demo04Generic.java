package Demo02;
/*
    测试接口的实现类
 */
public class Demo04Generic {
    public static void main(String[] args) {
        //第一种
        GenericInterfaceImpl gii =new GenericInterfaceImpl();
        gii.method("ABCD");

        //第二种
        GenericInterfaceImpl2<Integer> gii2 = new GenericInterfaceImpl2<>();
        gii2.method(1234);
        GenericInterfaceImpl2<Double> gii3 = new GenericInterfaceImpl2<>();
        gii3.method(8.8);
    }
}
