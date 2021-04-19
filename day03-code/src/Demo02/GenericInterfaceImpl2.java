package Demo02;
/*
    含有泛型的接口第二种使用方式
    接口使用什么类型，实现类就使用什么类型，类跟着接口走
    就相当于定义了一个含有泛型的类
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
